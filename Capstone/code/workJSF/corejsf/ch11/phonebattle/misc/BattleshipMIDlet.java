import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;

public class BattleshipMIDlet extends MIDlet implements CommandListener {
   private Display display;
   private Form addBoatForm;
   private StringItem position;
   private ChoiceGroup size;
   private ChoiceGroup direction;
   private StringItem message;
   private StringItem result;
   private Command exitCommand;
   private Command startCommand;
   private Command nextCommand;
   private Command addCommand;
   private Command opponentCommand;
   private Command fireCommand;
   private Command continueCommand;
   private Command newGameCommand;
   private BattleCanvas addBoatCanvas;
   private BattleCanvas own;
   private BattleCanvas opponent;
   private Form startForm;
   private Form messageForm;
   private Form waitForm;
   private Form gameOverForm;
   private String webform;
   private ConnectionWorker worker;
   private Thread workerThread;

   // Required methods

   public void startApp() {
      display = Display.getDisplay(this);
      exitCommand = new Command("Exit", Command.EXIT, 1);
      createStartForm();
      createAddBoatForms();
      createBattleCanvases();
      createMessageForm();
      createGameOverForm();
      
      worker = new ConnectionWorker();
      workerThread = new Thread(worker);
      workerThread.start();
      waitForm = new Form("Waiting...");

      display.setCurrent(startForm);
   }

   public void pauseApp() {}
   
   public void destroyApp(boolean unconditional) {}

   // Initialization

   public void createStartForm() {
      startForm = new Form("Start");
      startForm.setTitle("Welcome");
      startForm.append("Start the Battleship Game");
      startCommand = new Command("Start", Command.OK, 0);
      startForm.addCommand(startCommand);
      startForm.addCommand(exitCommand);
      startForm.setCommandListener(this);
   }

   public void createAddBoatForms() {
      addBoatCanvas = new BattleCanvas();
      addBoatCanvas.setTitle("Select Position");
      nextCommand = new Command("Next", Command.OK, 0);
      addBoatCanvas.addCommand(nextCommand);
      addBoatCanvas.addCommand(exitCommand);
      addBoatCanvas.setCommandListener(this);

      addBoatForm = new Form("Add Boat");
      direction = new ChoiceGroup("Direction", Choice.EXCLUSIVE);
      size = new ChoiceGroup("Size", Choice.EXCLUSIVE);
      position = new StringItem("", null);
      addBoatForm.append(direction);
      addBoatForm.append(size);
      addBoatForm.append(position);
      addCommand = new Command("Add", Command.OK, 0);
      addBoatForm.addCommand(addCommand);
      addBoatForm.addCommand(exitCommand);
      addBoatForm.setCommandListener(this);
   }

   public void createBattleCanvases() {
      own = new BattleCanvas();
      own.setTitle("Your battleground");

      opponent = new BattleCanvas();
      opponent.setTitle("Your opponent");

      opponentCommand = new Command("Opponent", Command.OK, 0);
      own.addCommand(opponentCommand);
      own.addCommand(exitCommand);
      own.setCommandListener(this);
      fireCommand = new Command("Fire", Command.OK, 0);
      opponent.addCommand(fireCommand);
      opponent.addCommand(exitCommand);
      opponent.setCommandListener(this);
   } 
  
   public void createMessageForm() {
      messageForm = new Form("Message");
      message = new StringItem("", null);
      messageForm.append(message);
      continueCommand = new Command("Continue", Command.OK, 0);
      messageForm.addCommand(continueCommand);
      messageForm.addCommand(exitCommand);
      messageForm.setCommandListener(this);
   }

   public void createGameOverForm() {
      gameOverForm = new Form("Game Over");
      result = new StringItem("", null);
      gameOverForm.append(result);
      newGameCommand = new Command("New Game", Command.OK, 0);
      gameOverForm.addCommand(newGameCommand);
      gameOverForm.addCommand(exitCommand);
      gameOverForm.setCommandListener(this);
   }

   // Commands

   public void commandAction(Command c, Displayable s) {
      if (c == startCommand) doStart();
      else if (c == nextCommand) doNext();
      else if (c == addCommand) doAdd();
      else if (c == continueCommand) doContinue();
      else if (c == opponentCommand) doOpponent(); 
      else if (c == fireCommand) doFire();
      else if (c == newGameCommand) doNewGame();
      else if (c == exitCommand) notifyDestroyed();
   }

   public void doStart() {
      connect("setup.faces", null);
   }

   public void doNext() {      
      position.setText("Position: " + addBoatCanvas.getString());
      display.setCurrent(addBoatForm);      
   }

   public void doAdd() {
      Hashtable request = new Hashtable();
      request.put("size", size.getString(size.getSelectedIndex()));
      request.put("direction", 
         direction.getString(direction.getSelectedIndex()));
      request.put("own", addBoatCanvas.getString());
      request.put("form", "setup");
      request.put("submit", "");
      connect("setup.faces", request);
   }

   public void doContinue() {
      display.setCurrent(addBoatCanvas);
   }

   public void doOpponent() { 
      display.setCurrent(opponent);
   }

   public void doFire() {
      Hashtable request = new Hashtable();
      request.put("own", own.getString());
      request.put("opponent", opponent.getString());
      request.put("form", "turn");
      request.put("fire", "");
      connect("turn.faces", request);
   }

   public void doNewGame() {
      Hashtable request = new Hashtable();
      request.put("form", webform);
      request.put("newgame", "");
      connect(webform + ".faces", request);
   }

   // Connection

   public void connect(String url, Hashtable request) {
      display.setCurrent(waitForm);
      worker.connect(url, request);
   }

   public void connectionCompleted(Hashtable response) {      
      webform = (String) response.get("form");
      if (webform.equals("setup")) showSetup(response);
      else if (webform.equals("turn")) showTurn(response);
      else if (webform.equals("win")) showGameOver(response);
      else if (webform.equals("lose")) showGameOver(response);
   }

   // Navigation

   public void showSetup(Hashtable response) {         
      select(size, response, "size");
      select(direction, response, "direction");
      addBoatCanvas.parse((String) response.get("own"));
      String msg = (String) response.get("messages.own");
      if (msg != null) {
         message.setText(msg);
         display.setCurrent(messageForm);      
         return;
      }
      display.setCurrent(addBoatCanvas);      
   }

   public void showGameOver(Hashtable response) {         
      result.setText((String) response.get("result"));
      display.setCurrent(gameOverForm);      
   }

   public void showTurn(Hashtable response) {
      own.parse((String) response.get("own"));
      opponent.parse((String) response.get("opponent"));
      display.setCurrent(own);
   }
  
   private static void select(ChoiceGroup group, 
      Hashtable response, String name) {
      String value = (String) response.get(name);
      int i = 0;
      String label;
      group.deleteAll();
      while ((label = (String) response.get(name + ".label." + i)) 
         != null) {
         group.append(label, null);
         if (label.equals(value))
            group.setSelectedIndex(i, true);
         i++;
      }
   }
   
   private class ConnectionWorker implements Runnable {
      private String url;
      private String urlPrefix = "http://localhost:8080/phonebattle/";
      private Hashtable request;
      private Hashtable response;  
      private String sessionCookie;
      private boolean busy = false;

      public synchronized void run() {
         try {
            for (;;) {
               while (!busy) 
                  wait(); 
               try {
                  byte[] data = post();            
                  response = decode(data);
                  
               }
               catch (IOException ex) {
                  ex.printStackTrace();
               }
               busy = false;
               connectionCompleted(response);
            }
         }
         catch (InterruptedException ie) {}
      }

      public synchronized void connect(String url, Hashtable request) {
         this.url = url;
         this.request = request;
         if (busy) return;
         busy = true; 
         notify();
      }

      private void urlEncode(String s, OutputStream out) 
         throws IOException {
         byte[] bytes = s.getBytes("UTF8");
         for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if (b == ' ')
               out.write('+');
            else if ('0' <= b && b <= '9' 
               || 'A' <= b && b <= 'Z'
               || 'a' <= b && b <= 'z'
               || "-_.!~*'(),".indexOf(b) >= 0)
               out.write(b);
            else {
               out.write('%');
               int b1 = (b & 0xF0) >> 4;
               out.write((b1 < 10 ? '0' : 'a' - 10) + b1);
               int b2 = b & 0xF;
               out.write((b2 < 10 ? '0' : 'a' - 10) + b2);             
            }
         }
      }

      private boolean isspace(byte b) {
         return " \n\r\t".indexOf(b) >= 0;
      }

      private Hashtable decode(byte[] data) {
         if (data == null) return null;
         Hashtable table = new Hashtable();
         try {
            int start = 0;
            for (;;) {
               while (start < data.length && isspace(data[start])) 
                  start++;
               if (start >= data.length) return table;
               int end = start + 1;
               int count = 0; 
               while (end < data.length && data[end] != '=') end++;
               String key = 
                  new String(data, start, end - start, "ASCII");
               start = end + 1;
               end = start;
               while (end < data.length && !isspace(data[end])) {
                  count++;
                  if (data[end] == '%') end += 3; else end++;
               }
               byte[] b = new byte[count];
               int k = start; 
               int c = 0;
               while (k < end) {
                  if (data[k] == '%') {
                     int h = data[k + 1];
                     if (h >= 'a') h = h - 'a' + 10;
                     else if (h >= 'A') h = h - 'A' + 10;
                     else h = h - '0';
                     int l = data[k + 2];
                     if (l >= 'a') l = l - 'a' + 10;
                     else if (l >= 'A') l = l - 'A' + 10;
                     else l = l - '0';                  
                     b[c] = (byte) ((h << 4) + l);
                     k += 3;
                  }
                  else if (data[k] == '+') {
                     b[c] = ' ';
                     k++;
                  }
                  else {
                     b[c] = data[k];
                     k++;
                  }
                  c++;
               }               
               String value = new String(b, "UTF8");
               table.put(key, value);
               start = end + 1;
            }
         }
         catch (UnsupportedEncodingException ex) {
         }
         return table;
      }
  
      private byte[] post() throws IOException {
         HttpConnection conn = null;
         byte[] data = null;
         
         try {
            conn = (HttpConnection) Connector.open(urlPrefix + url);
            
            conn.setRequestMethod(HttpConnection.POST);
            conn.setRequestProperty("User-Agent",
               "Profile/MIDP-2.0 Configuration/CLDC-1.0");
            conn.setRequestProperty("Content-Language", "en-US");
            conn.setRequestProperty("Content-Type", 
               "application/x-www-form-urlencoded");
            if (sessionCookie != null)
               conn.setRequestProperty("Cookie", sessionCookie);
            
            OutputStream out = conn.openOutputStream();
            if (request != null) {
               Enumeration keys = request.keys();
               while (keys.hasMoreElements()) {
                  String key = (String) keys.nextElement();
                  String value = (String) request.get(key);
                  urlEncode(key, out);
                  out.write('=');
                  urlEncode(value, out);
                  if (keys.hasMoreElements()) out.write('&');
               }            
            }

            int rc = conn.getResponseCode();
            if (rc != HttpConnection.HTTP_OK) 
               throw new IOException("HTTP response code: " + rc);
            
            InputStream in = conn.openInputStream();
            
            // Read the session ID--it's the first cookie
            String cookie = conn.getHeaderField("Set-cookie");
            if (cookie != null) {
               int semicolon = cookie.indexOf(';');
               sessionCookie = cookie.substring(0, semicolon);
            }

            // Get the length and process the data
            int len = (int) conn.getLength();
            int actual = 0;
            int bytesread = 0 ;
            if (len > 0) {
               data = new byte[len];
               while ((bytesread != len) && (actual != -1)) {
                  actual = in.read(data, bytesread, len - bytesread);
                  if (actual != -1) bytesread += actual;
               }
            } else {
               final int BLOCKSIZE = 1024;
               data = new byte[BLOCKSIZE];
               while (actual != -1) {
                  if (bytesread == data.length) {
                     byte[] bigger = new byte[data.length + BLOCKSIZE];
                     System.arraycopy(data, 0, bigger, 0, data.length);
                     data = bigger;
                  }
                  actual = in.read(data, bytesread, 
                     data.length - bytesread);
                  if (actual != -1) bytesread += actual;
               }               
               if (bytesread < data.length) {
                  byte[] smaller = new byte[bytesread];
                  System.arraycopy(data, 0, smaller, 0, bytesread);
                  data = smaller;                  
               }
            }
         } catch (ClassCastException e) {
            throw new IOException("Not an HTTP URL");
         } finally {
            if (conn != null) conn.close();
         }
         return data;
      }
   }      
}

class BattleCanvas extends Canvas {
   public static final int ROWS = 10;
   public static final int COLUMNS = 10;
   public static final int OCCUPIED = 1;
   public static final int HIT = 2;

   private int[][] positions = new int[ROWS][COLUMNS];
   private int currentRow = 0;
   private int currentColumn = 0;

   public void parse(String state) {
      int n = 0; 
      for (int i = 0; i < ROWS; i++) {
         for (int j = 0; j < COLUMNS; j++) {
            char c = state.charAt(n);
            n++;
            positions[i][j] = c - '0';
         }
         n++;
      }
   }

   public String getString() {
      return "" + (char) ('A' + currentRow) + (1 + currentColumn);
   }

   public void paint(Graphics g) {
      int width = getWidth();
      int height = getHeight();
      int oldColor = g.getColor();
      g.setColor(0xFFFFFF);
      g.fillRect(0, 0, width, height);
      g.setColor(oldColor);
      int cellWidth = width / (COLUMNS + 2);
      int cellHeight = height / (ROWS + 2);
      int cellSize = Math.min(cellWidth, cellHeight);
      for (int i = 0; i <= ROWS; i++) {
         int y = (i + 1) * cellSize;
         g.drawLine(cellSize, y, (COLUMNS + 1) * cellSize, y);
      }
      for (int j = 0; j <= COLUMNS; j++) {
         int x = (j + 1) * cellSize;
         g.drawLine(x, cellSize, x, (ROWS + 1) * cellSize);
      }
      for (int i = 0; i < ROWS; i++) {
         int y = (i + 1) * cellSize;
         for (int j = 0; j < COLUMNS; j++) {
            int x = (j + 1) * cellSize;
            int p = positions[i][j];
            if ((p & OCCUPIED) != 0)
               g.fillRect(x, y, cellSize, cellSize);
            if ((p & HIT) != 0) {
               if (p == (HIT | OCCUPIED)) {
                  oldColor = g.getColor();
                  g.setColor(0xFFFFFF);                  
               }
               g.drawLine(x, y, x + cellSize, y + cellSize);
               g.drawLine(x + cellSize, y, x, y + cellSize);
               if (p == (HIT | OCCUPIED)) g.setColor(oldColor);
            }
         }
      }
      int x = (currentColumn + 1) * cellSize;
      int y = (currentRow + 1) * cellSize;
      g.drawRect(x - 1, y - 1, cellSize + 2, cellSize + 2);
   }

   public void keyPressed(int keyCode) {
      int action = getGameAction(keyCode);
      if (action == LEFT) 
         currentColumn = (currentColumn + COLUMNS - 1) % COLUMNS;
      else if (action == RIGHT) 
         currentColumn = (currentColumn + 1) % COLUMNS;
      else if (action == UP) 
         currentRow = (currentRow + ROWS - 1) % ROWS;
      else if (action == DOWN) 
         currentRow = (currentRow + 1) % ROWS;
      repaint();
   }
}
