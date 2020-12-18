/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
rockPaperScissorsInterface
JAVA class to talk to the user and get their resposnes for rock paper scissors*/
import java.util.*;

public class rockPaperScissorsInterface{
/*talks to user to get their plays
  Pre: none
  Post: returns String of the users play*/
  public static String play(){
    Scanner scan = new Scanner(System.in);
    String[] choices = {"rock", "paper", "scissors"};
    List <String> plays = new ArrayList <String>();
    plays.add("rock");
    plays.add("paper");
    plays.add("scissors");
    while (true){
      System.out.print("\nPlease enter your play (1=rock, 2=paper, 3=scissors): ");
      String play = scan.nextLine();
      int playInt = 0;
      try{
        playInt = Integer.parseInt(play);
        if (verification.checkIntBetween(playInt, 1, 3)){
          if (verification.inPossibleStringEntries(choices[playInt-1], plays)){
            return choices[playInt-1];
          }
        }
      }
      catch(Exception e){
        System.out.print("\ninvalid response. please enter a whole number between 1 and 3, and try again: \n");
      }
    }
  }

/*talks to user to get the number of rounds they wouold like to play
  Pre: none
  Post: returns integer of the number of rounds they would like to play*/
  public static int rounds(){
    Scanner scan = new Scanner(System.in);
    while (true){
      System.out.print("\nHow many rounds would you like to play?: ");
      String rounds = scan.nextLine();
      if (verification.checkInt(rounds)){
        return Integer.parseInt(rounds);
      }
    }
  }

/*returns the winner of the game and the final scores
  Pre: user name, user score, computer score
  Post: returns boolean value false if there is a winner or true if it is a tie*/
  public static boolean gameOver(String name, int userScore, int comScore){
    boolean winner = false;
    if (userScore > comScore){
      System.out.print("\n\nCONGRADULATIONS YOU WON THE GAME!!");
      winner = true;
    }
    else if (comScore > userScore){
      System.out.print("\n\nSorry you lost the game:(");
      winner = true;
    }
    else{
      System.out.print("\n\nIt\'s a tie!!");
      System.out.print("\nTie Breaker Round...");
      return false;
    }
    System.out.print("\nFinal Scores:");
    System.out.print("\n" + name + ": " + userScore);
    System.out.print("\nComputer: " + comScore);
    return winner;
  }
}
