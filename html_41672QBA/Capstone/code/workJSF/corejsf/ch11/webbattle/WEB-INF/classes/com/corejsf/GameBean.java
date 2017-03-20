package com.corejsf;

public class GameBean {
   private BattleGround own;
   private BattleGround opponent;

   public GameBean() { initialize(); }

   // PROPERTY: own
   public BattleGround getOwn() { return own; }   
   public void setOwn(BattleGround newValue) { own = newValue; }

   // PROPERTY: opponent
   public BattleGround getOpponent() { return opponent; }
   public void setOpponent(BattleGround newValue) { opponent = newValue; }

   public String initialize() {
      own = new BattleGround();
      own.setRows(10);
      own.setColumns(10);
      own.initialize();
      opponent = new BattleGround();
      opponent.setRows(10);
      opponent.setColumns(10);
      opponent.initializeRandomly();
      return "setup";
   }

   public String move() {
      opponent.fire();
      if (opponent.isGameOver()) return "win";
      own.makeRandomMove();
      if (own.isGameOver()) return "lose";
      return "turn";
   }
}
