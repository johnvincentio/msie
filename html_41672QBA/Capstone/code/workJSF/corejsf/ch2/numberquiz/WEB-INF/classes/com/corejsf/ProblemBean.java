package com.corejsf;
import java.util.ArrayList;

public class ProblemBean {
   private ArrayList sequence; 
   private int solution;
   
   public ProblemBean() {}

   public ProblemBean(int[] values, int solution) {
      sequence = new ArrayList();
      for (int i = 0; i < values.length; i++)
         sequence.add(new Integer(values[i]));
      this.solution = solution;
   }

   // PROPERTY: sequence
   public ArrayList getSequence() { return sequence; }
   public void setSequence(ArrayList newValue) { sequence = newValue; }

   // PROPERTY: solution
   public int getSolution() { return solution; }
   public void setSolution(int newValue) { solution = newValue; }
}
