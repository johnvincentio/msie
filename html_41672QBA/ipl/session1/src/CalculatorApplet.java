
import java.awt.Graphics;
import javax.swing.*;

public class CalculatorApplet extends JApplet {
  private double dTotal = 0;
  private boolean bDebug = true;
  private String strOne, strTwo, strT1, strT2;
  private double dOne, dTwo;
  private int nCommand, nCntr;
  private Object[] arObjects = {"Add", "Subtract", "Multiply", "Divide", "Exponential"};

  public void init() {
        strOne = JOptionPane.showInputDialog("Enter first number"); // Get user instructions
        if (strOne == null)
          return; // user cancelled
        strT1 = strOne.trim();
        if (strT1.length() < 1)
          strT1 = "0"; // null string is a zero
        dOne = Double.parseDouble(strT1);
        if (bDebug)
          System.out.println("StrOne :" + strOne + ": strT1 :" + strT1 +
                             ": double " + dOne);

        Object objValue = JOptionPane.showInputDialog(null,
            "Choose your operator", "Input",
            JOptionPane.INFORMATION_MESSAGE, null, arObjects, arObjects[0]);
        if (bDebug)
          System.out.println("objValue :" + objValue + ":");
        if (objValue == null)
          return; // user cancelled

        for (nCntr = 0, nCommand = 0; nCntr < arObjects.length; nCntr++) { // calculate the command
          if (objValue.equals(arObjects[nCntr])) {
            nCommand = nCntr + 1;
            break;
          }
        }

        dTwo = 0;
        if (nCommand != 5) {
          strTwo= JOptionPane.showInputDialog("Enter second number");
          if (strTwo == null)
            return; // user cancelled
          strT2 = strTwo.trim();
          if (strT2.length() < 1)
            strT2 = "0";
          dTwo = Double.parseDouble(strT2);
          if (bDebug)
            System.out.println("StrTwo :" + strTwo + ": strT2 :" + strT2 +
                               ": double" + dTwo);
        }

        switch (nCommand) { // perform the operation
          case 2: // subtraction
            dTotal = dOne - dTwo;
            break;
          case 3:
            dTotal = dOne * dTwo; //multiplication
            break;
          case 4:
            dTotal = dOne / dTwo; // division
            break;
          case 5:
            dTotal = Math.exp(dOne); // expontial
            break;
          default:
            dTotal = dOne + dTwo; // addition
            break;
        }
  }

  public void paint (Graphics g) {
    super.paint(g);
    g.drawRect(15,10,270,20);
    g.drawString("The Total is "+dTotal, 25, 25);
  }
}