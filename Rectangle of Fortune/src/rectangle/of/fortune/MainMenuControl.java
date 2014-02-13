

package rectangle.of.fortune;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk
 */
public class MainMenuControl {
        
        public void newGame() {
        StartGame newGame = new StartGame();
        GuessLetter newWord = new GuessLetter();
        newGame.playerCount();
        newGame.playRounds();
        newGame.difficulty();
        newWord.GuessWord();
        newGame.outputTest();
        }
           
        public void getHelpMenu() {
         // Create instance of the HelpMenuView class
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getChoice();
    } 
}
