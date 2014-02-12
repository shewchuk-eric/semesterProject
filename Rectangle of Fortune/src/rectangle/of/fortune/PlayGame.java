
package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk
 */
public class PlayGame {
    int rounds, played;
    char guess;
    PlayGame() {
        rounds=5;
        played=2;
    }
 public void whatWord() {
     System.out.println("This game will play a total of "+rounds+" rounds./n"
     +played+" rounds have already been played.  There are "+(rounds-played)+" rounds left.");
 }
 public void guessLetter() {
     
 }   
}
