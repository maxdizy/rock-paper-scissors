/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
verification
class to verify user inputs*/
import java.util.*;

public class verification{
/*varifies user input is a name
  Pre: user input
  Post: returns boolean value if the input is valid or not*/
  public static boolean checkName(String name){
    boolean confirmed = false;
    boolean ifString = false;
    char[] nameArray = name.toCharArray();
    char[] alph = "abcdefghijklmnopqrstuvwrxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    for (char digit : nameArray){
      confirmed = false;
      for (char letter : alph){
        if (digit == letter){
          confirmed = true;
        }
      }
      if (confirmed == false){
        System.out.println("Sorry I don\'t understand, Please only use letters and try again... ");
        return false;
      }
    }
    return true;
  }

/*varifies if user input is in the list of possible entries
  Pre: list of String values
  Post: returns boolean value if the input is valid or not*/
  public static boolean inPossibleStringEntries(String guess, List <String> list){
    boolean confirmed = false;
    for (String valid : list){
      confirmed = false;
        if (guess.equals(valid)){
          return true;
        }
      }
    if (confirmed == false){
      System.out.println("Sorry your input is not in my database, please try again...");
      return false;
    }
      return false;
    }

/*varifies if user input is a integer
  Pre: user input
  Post: returns boolean value if the input is valid or not*/
  public static boolean checkInt(int num){
    int[] numbers = {1,2,3,4,5,6,7,8,9,0};
    for (int digit : numbers){
      if (num == digit){
        return true;
      }
    }
    System.out.println("invalid response. please enter a whole number and try again:");
    return false;
  }
}
