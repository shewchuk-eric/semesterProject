

package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk
 */
public class MainMenuControl {
    
    MainMenuControl() {
    }
        
        public void newGame() {
        PlayGame newGame = new PlayGame();
        newGame.playGame();
    }
           
        public void getHelpMenu() {
         // Create instance of the HelpMenuView class
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getChoice();
    }   
}
