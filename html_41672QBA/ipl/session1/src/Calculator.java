// John Vincent MSIE 9/23/2003

// Simple program exercising JOptionPane to perform some
// calculator functions

import javax.swing.JOptionPane;

public class Calculator {

  public static void main(String args[]) {
    boolean bDebug = true;
    String strOne, strTwo, strT1, strT2;
    double dOne, dTwo, dTotal;
    int nCommand, nCntr;
    Object[] arObjects = {"Add", "Subtract", "Multiply", "Divide", "Exponential"};

    try {             // catch exceptions - not subtle.
      while (true) {    // loop until user cancels
        strOne = JOptionPane.showInputDialog("Enter first number"); // Get user instructions
        if (strOne == null)
          break; // user cancelled
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
          break; // user cancelled

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
            break; // user cancelled
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

        JOptionPane.showMessageDialog(null, "The total is " + dTotal,
                                      "Results", JOptionPane.PLAIN_MESSAGE);
      }
    }
    catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "The total is unknown",
                                    "Results", JOptionPane.ERROR_MESSAGE);
    }
    System.exit(0);
  }
}
