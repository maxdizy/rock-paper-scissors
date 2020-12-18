/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
getUserInfo
JAVA class to get promt user for their info*/
import java.util.*;

public class getUserInfo{
/*gets the name of the user
  Pre: none
  Post: returns String of the users name*/
  public static String name(){
    Scanner scan = new Scanner(System.in);
    while (true){
      System.out.print("\nPlease enter your name to begin: ");
      String name = scan.nextLine();
      if (verification.checkName(name)){
        return name;
      }
    }
  }
}
