

package rectangle.of.fortune;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk
 */
public class MainMenuControl {
    int players, rounds;
    String nameOne, nameTwo, nameThree, word;
        
        public void newGame() {
        StartGame newGame = new StartGame();
        newGame.playerCount();
        newGame.playRounds();
        PlayGame playGame = new PlayGame();
        playGame.playGame();
    }
           
        public void getHelpMenu() {
         // Create instance of the HelpMenuView class
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getChoice();
    }

    public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}
