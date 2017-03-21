package com.corejsf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.render.Renderer;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.servlet.http.HttpServletResponse;

public class ChartRenderer extends Renderer {
   public void encodeBegin(FacesContext context, UIComponent component) 
      throws IOException {
      if (!component.isRendered()) return;

      HttpServletResponse response 
         = (HttpServletResponse) context.getExternalContext().getResponse();
      response.setContentType("image/jpeg");
      OutputStream stream = response.getOutputStream();

      Map attributes = component.getAttributes();

      int width = parseInt(attributes, "width", DEFAULT_WIDTH);
      int height = parseInt(attributes, "height", DEFAULT_HEIGHT);
      String title = parseString(attributes, "title", "");            

      ValueBinding vb = component.getValueBinding("names");
      String[] names = vb == null ? null : (String[]) vb.getValue(context);
      vb = component.getValueBinding("values");
      double[] values = vb == null ? null : (double[]) vb.getValue(context);
           
      BufferedImage image = new BufferedImage(width, height,
         BufferedImage.TYPE_INT_RGB);
      Graphics2D g2 = (Graphics2D) image.getGraphics();
      drawChart(g2, width, height, title, names, values);

      Iterator iter = ImageIO.getImageWritersByFormatName("jpeg");
      ImageWriter writer = (ImageWriter) iter.next();
      writer.setOutput(ImageIO.createImageOutputStream(stream));
      writer.write(image);

      context.responseComplete();
   }

   private static int parseInt(Map attributes, String name, int defaultValue) {
      String value = (String) attributes.get(name);
      if (value != null)
         try { 
            return Integer.parseInt(value); 
         } catch (NumberFormatException ex) {
         }
      return defaultValue;
   }

   private static String parseString(Map attributes, String name, 
      String defaultValue) {
      String value = (String) attributes.get(name);
      if (value != null) return value;
      return defaultValue;
   }

   private static void drawChart(Graphics2D g2, int width, int height, 
      String title, String[] names, double[] values)
   {
      // clear the background
      g2.setPaint(Color.WHITE);
      g2.fill(new Rectangle2D.Double(0, 0, width, height));
      g2.setPaint(Color.BLACK);

      if (names == null || values == null || names.length != values.length) 
         return;
      
      // compute the minimum and maximum values
      if (values == null) return;
      double minValue = 0;
      double maxValue = 0;
      for (int i = 0; i < values.length; i++) {  
         if (minValue > values[i]) minValue = values[i];
         if (maxValue < values[i]) maxValue = values[i];
      }
      if (maxValue == minValue) return;
                 
      Font titleFont = new Font("SansSerif", Font.BOLD, 20);
      Font labelFont = new Font("SansSerif", Font.PLAIN, 10);
         
      // compute the extent of the title
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D titleBounds 
         = titleFont.getStringBounds(title, context);
      double titleWidth = titleBounds.getWidth();
      double top = titleBounds.getHeight();

      // draw the title
      double y = -titleBounds.getY(); // ascent
      double x = (width - titleWidth) / 2;
      g2.setFont(titleFont);
      g2.drawString(title, (float)x, (float)y);
      
      // compute the extent of the bar labels
      LineMetrics labelMetrics 
         = labelFont.getLineMetrics("", context);
      double bottom = labelMetrics.getHeight();

      y = height - labelMetrics.getDescent();
      g2.setFont(labelFont);

      // get the scale factor and width for the bars
      double scale = (height - top - bottom) 
         / (maxValue - minValue);
      int barWidth = width / values.length;

      // draw the bars
      for (int i = 0; i < values.length; i++) {  
         // get the coordinates of the bar rectangle
         double x1 = i * barWidth + 1;
         double y1 = top;
         double barHeight = values[i] * scale;
         if (values[i] >= 0)
            y1 += (maxValue - values[i]) * scale;
         else {  
            y1 += maxValue * scale;
            barHeight = -barHeight;
         }

         // fill the bar and draw the bar outline
         Rectangle2D rect = new Rectangle2D.Double(x1, y1, 
            barWidth - 2, barHeight);
         g2.setPaint(Color.RED);
         g2.fill(rect);
         g2.setPaint(Color.BLACK);
         g2.draw(rect);
         
         // draw the centered label below the bar
         Rectangle2D labelBounds 
            = labelFont.getStringBounds(names[i], context);

         double labelWidth = labelBounds.getWidth();
         x = i * barWidth + (barWidth - labelWidth) / 2;
         g2.drawString(names[i], (float)x, (float)y);
      }
   }
   
   private static int DEFAULT_WIDTH = 200;
   private static int DEFAULT_HEIGHT = 200;
}
