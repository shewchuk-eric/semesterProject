

package rectangle.of.fortune;

import rectangle.of.fortune.gameFunctions.PlayGame;

/**
 *
 * @author Eric Shewchuk
 */
public class MainMenuControl {
    
    MainMenuControl() {
    }
        
        public static void newGame() {
        rectangle.of.fortune.gameFunctions.PlayGame newGame = new PlayGame();
        newGame.playGame();
    }
           
        public static void getHelpMenu() {
         // Call HelpMenuView method
        HelpMenuView.helpMenu();
    }   
}
