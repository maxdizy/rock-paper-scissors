/*Max Dizy
December 11, 2020
ICS4U
Mr. Hofstatter
playMedia
JAVA class to play different types of media*/
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class playMedia{
/*plays WAV file audio continuously
  Pre: WAV file path
  Post: plays WAV file audio continuously*/
  public static void playMusic(String path){
    Clip clip;
    AudioInputStream audioInputStream;
    try{
      audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
      clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    catch(Exception e){
      System.out.print("/nERROR PLAYING MUSIC");
    }
  }
}
