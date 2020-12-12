/*Max Dizy
December 16, 2020
ICS4U
Mr. Hofstatter
rockPaperScissors client
rock paper scissors game that allows the user to choose the number of rounds and play rock paper scissors against the computer*/
import java.util.*;

public class rockPaperScissorsClient{
  public static void main(String[] args){
    //define variables
    int userScore = 0;
    int comScore = 0;
    String play;
    String comPlay;
    String winner;
    //welcome and intro
    String name = getUserInfo.name();
    int rounds = rockPaperScissorsInterface.rounds();
    //game loop
    while(rounds > 0){
      play = rockPaperScissorsInterface.play();
      comPlay = rockPaperScissorsComputer.playEasy();
      winner = rockPaperScissorsComputer.calculate(play, comPlay);
      if (winner.equals("user")){
        userScore++;
      }
      if (winner.equals("computer")){
        comScore++;
      }
      rockPaperScissorsComputer.results(winner, userScore, comScore);
      rounds ++;
    }
  }
}
