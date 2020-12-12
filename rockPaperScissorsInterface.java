/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
rockPaperScissorsInterface
class to talk to the user and get their resposnes for rock paper scissors*/
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
      int play = scan.nextInt();
      if (verification.inPossibleStringEntries(choices[play-1], plays)){
        return choices[play-1];
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
      int rounds = scan.nextInt();
      if (verification.checkInt(rounds)){
        return rounds;
      }
    }
  }
}
