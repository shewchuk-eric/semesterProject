
package rectangle.of.fortune;

/**
 * @author Eric Shewchuk
 */

public class PlayGame {
    int rounds, played;
    char guess;
    String word;

 public void playGame() {
        Words newWord = new Words();
        word=newWord.selectWord();
        GuessLetter player = new GuessLetter();
        player.guessWord(word);
 } 
        public void outputTest() {
        border();
        System.out.println(word);
        border();
        }

        public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }  
}
