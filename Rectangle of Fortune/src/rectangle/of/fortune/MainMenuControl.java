

package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class MainMenuControl {
    
        public void newGame() {
        Player newPlayer = new Player();
        newPlayer.getName();
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
