

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
        PlayGame newGame = new PlayGame();
        newGame.playGame();
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
