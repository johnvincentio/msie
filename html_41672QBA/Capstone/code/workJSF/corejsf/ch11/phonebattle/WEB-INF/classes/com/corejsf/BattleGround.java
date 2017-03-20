package com.corejsf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.faces.model.SelectItem;

public class BattleGround {
   public static final int OCCUPIED = 1;
   public static final int HIT = 2;

   private int rows;
   private int columns;
   private int currentRow;
   private int currentColumn;
   private int[][] positions;
   private int[] sizes;
   private static final int[] INITIAL_SIZES = { 2, 3, 3, 4, 5 };
   private static Random generator = new Random();

   // PROPERTY: rows
   public void setRows(int newValue) { rows = newValue; }
   public int getRows() { return rows; }

   // PROPERTY: columns
   public void setColumns(int newValue) { columns = newValue; }
   public int getColumns() { return columns; }

   public void initialize() {
      sizes = (int[]) INITIAL_SIZES.clone();
      positions = new int[rows][columns];
   }

   public void initializeRandomly() {
      initialize();
      for (int i = 0; i < sizes.length; i++) 
         addRandomBoat(sizes[i]);
   }

   public int getValueAt(int i, int j) {
      if (positions == null) return 0;
      if (0 <= i && i < rows && 0 <= j && j < columns)
         return positions[i][j];
      else
         return 0;
   }

   public void setCurrent(String pos) {
      if (pos == null || pos.length() < 2) 
         throw new IllegalArgumentException();
      int r = pos.charAt(0) - 'A';
      int c = Integer.parseInt(pos.substring(1)) - 1;
      if (r < 0 || r >= rows || c < 0 || c >= columns)
         throw new IllegalArgumentException();
      currentRow = r;
      currentColumn = c;
   }

   public void fire() {
      if (positions == null) return;
      positions[currentRow][currentColumn] |= HIT;
   }

   public void addBoat(int size, boolean horizontal) {
      addBoat(size, currentRow, currentColumn, horizontal);
   }

   public boolean boatFits(int size, boolean horizontal) {
      return boatFits(size, currentRow, currentColumn, horizontal);
   }

   public void makeRandomMove() {
      // try to find a neighbor of an occupied+hit cell that hasn't 
      // been fired on
      for (int i = 0; i < rows; i++)
         for (int j = 0; j < columns; j++) 
            if (positions[i][j] == (OCCUPIED | HIT)) 
               for (int m = i - 1; m <= i + 1; m++) 
                  for (int n = j - 1; n <= j + 1; n++)
                     if (m >= 0 && m < rows && n >= 0 && n < columns
                        && (positions[m][n] & HIT) == 0) {
                        positions[m][n] |= HIT;
                        return;
                     }
      // pick a random cell that hasn't yet been hit
      int m = generator.nextInt(rows);
      int n = generator.nextInt(columns);
      for (int i = 0; i < rows; i++)
         for (int j = 0; j < columns; j++) {
            int r = (i + m) % rows;
            int s = (j + n) % columns;
            if ((positions[r][s] & HIT) == 0) {
               positions[r][s] |= HIT;
               return;
            }
         }
   }

   public List getAvailableSizes() {
      List availableSizes = new ArrayList();
      for (int i = 0; i < sizes.length; i++)
         if (sizes[i] > 0) {
            // is it a duplicate?
            boolean found = false;
            for (int j = 0; j < i && !found; j++)
               if (sizes[i] == sizes[j]) found = true;
            if (!found) {
               String sz = "" + sizes[i];
               availableSizes.add(new SelectItem(sz, sz, null));
            }
         }
      return availableSizes;
   }

   public boolean isGameOver() {
      for (int i = 0; i < rows; i++) 
         for (int j = 0; j < columns; j++)
            if (positions[i][j] == OCCUPIED /* and not hit */)
               return false;
      return true;
   }

   private void addBoat(int size, int i, int j, boolean horizontal) {
      if (!boatFits(size, i, j, horizontal)) return;
      boolean found = false;
      for (int k = 0; !found && k < sizes.length; k++) {
         if (sizes[k] == size) {
            found = true;
            sizes[k] = 0;
         }
      }
      if (!found) return;
         
      for (int k = 0; k < size; k++) 
         positions[i + (horizontal ? 0 : k)]
            [j + (horizontal ? k : 0)] = OCCUPIED;            
   }

   private boolean boatFits(int size, int i, int j, 
      boolean horizontal) {
      boolean found = false;
      for (int k = 0; !found && k < sizes.length; k++) {
         if (sizes[k] == size) found = true;
      }
      if (!found) return false;
      if (horizontal && j + size > columns 
         || !horizontal && i + size > rows) 
         return false;
      for (int k = 0; k < size; k++) 
         if (positions[i + (horizontal ? 0 : k)]
            [j + (horizontal ? k : 0)] != 0) 
            return false;
      return true;
   }

   private void addRandomBoat(int size) {
      if (rows < size || columns < size) return;
      int i;
      int j;
      boolean horizontal;
      boolean fits;
      do {
         horizontal = generator.nextBoolean();
         i = generator.nextInt(rows - (horizontal ? 0 : size ));
         j = generator.nextInt(columns - (horizontal ? size : 0));
      } while (!boatFits(size, i, j, horizontal));      
      addBoat(size, i, j, horizontal);
   }
}
