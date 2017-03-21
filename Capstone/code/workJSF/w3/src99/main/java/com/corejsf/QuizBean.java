package com.corejsf;

public class QuizBean {
   private int currentProblem;
   private int tries;
   private int score;
   private String response;
   private String correctAnswer;

   // here, we hardwire the problems. In a real application, 
   // they would come from a database
   private Problem[] problems = {
      new Problem(
         "What trademarked slogan describes Java development? Write once, ...",
         "run anywhere"),
      new Problem(
         "What are the first 4 bytes of every class file (in hexadecimal)?",
         "CAFEBABE"),
      new Problem(
         "What does this statement print? System.out.println(1+\"2\");",
         "12"),
      new Problem(
         "Which Java keyword is used to define a subclass?",
         "extends"),
      new Problem(
         "What was the original name of the Java programming language?",
         "Oak"),
      new Problem(
         "Which java.util class describes a point in time?",
         "Date")
   };

   public QuizBean() { startOver(); }

   // PROPERTY: question
   public String getQuestion() {
      return problems[currentProblem].getQuestion();
   }

   // PROPERTY: answer
   public String getAnswer() { return correctAnswer; }
   
   // PROPERTY: score
   public int getScore() { return score; }

   // PROPERTY: response
   public String getResponse() { return response; }
   public void setResponse(String newValue) { response = newValue; }

   public String answerAction() {
      tries++;
      if (problems[currentProblem].isCorrect(response)) {
         score++;
         nextProblem();
         if (currentProblem == problems.length) return "done";
         else return "success";
      }
      else if (tries == 1) {
         return "again";
      }
      else {
         nextProblem();
         if (currentProblem == problems.length) return "done";
         else return "failure";
      }
   }

   public String startOverAction() {
      startOver();
      return "startOver";
   }

   private void startOver() {
      currentProblem = 0;
      score = 0;
      tries = 0;
      response = "";
   }

   private void nextProblem() {
      correctAnswer = problems[currentProblem].getAnswer();
      currentProblem++;
      tries = 0;
      response = "";
   }
}
