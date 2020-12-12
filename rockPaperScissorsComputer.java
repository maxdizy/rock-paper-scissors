/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
rockPaperScissorsComputer
class to detrmine the computer rock paper scissors play*/
import java.util.*;

public class rockPaperScissorsComputer{
/*picks rock paper or scissors
  Pre: none
  Post: prints and returns randomly String either rock paper or scissors*/
  public static String playEasy(){
    Random rand = new Random();
    int play = rand.nextInt(3);
    System.out.print("\nThe computer played ");
    if (play == 1){
      System.out.print("rock");
      return "rock";
    }
    else if (play == 2){
      System.out.print("paper");
      return "paper";
    }
    else if (play == 3){
      System.out.print("scissors");
      return "scissors";
    }
    return "error";
  }

/*calculates the winner of rock paper scissors matches
  Pre: user play and computer play
  Post: returns who won the match*/
  public static String calculate(String userPlay, String comPlay){
    if (userPlay.equals(comPlay)){
      return "tie";
    }
    //user plays ROCK
    if (userPlay.equals("rock")){
      if (comPlay.equals("paper")){
        return "computer";
      }
      if (comPlay.equals("scissors")){
        return "user";
      }
    }
    //user plays PAPER
    if (userPlay.equals("paper")){
      if (comPlay.equals("rock")){
        return "user";
      }
      if (comPlay.equals("scissors")){
        return "computer";
      }
    }
      //user plays SCISSORS
    if (userPlay.equals("scissors")){
        if (comPlay.equals("rock")){
          return "computer";
        }
        if (comPlay.equals("paper")){
          return "user";
      }
    }
    return "error";
  }

/*prints the results and scores after each match
  Pre: winner of the match, updated user score and updated computer score
  Post: prints the winner of the matches and the current score*/
  public static String results(String winner, int userScore, int comScore){
    if (winner.equals("user")){
      System.out.print("\n\nCongradulations!! YOU WON!!");
      System.out.print("\n\nScore  --  You: " + userScore + "  --   Computer: " + comScore);
    }
    if (winner.equals("computer")){
      System.out.print("\n\nOops you LOST!!");
      System.out.print("\n\nScore  --  You: " + userScore + "  --   Computer: " + comScore);
    }
    if (winner.equals("tie")){
      System.out.print("\n\nIt\'s a Tie!!");
      System.out.print("\n\nScore  --  You: " + userScore + "  --   Computer: " + comScore);
    }
    return "error";
  }
}
