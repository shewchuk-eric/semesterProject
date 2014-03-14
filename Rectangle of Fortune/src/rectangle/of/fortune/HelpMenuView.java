

package rectangle.of.fortune;
/**
 *
 * @author Eric Shewchuk
 */

public class HelpMenuView extends Menu{
    
    HelpMenuView() {
    }
    
        // Create instance of the HelpMenuControl (action) class
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // Menu items to be displayed    
    static final String[][] menuItems = {
        {"", "HELP MENU"},
        {"1", "Object of Game"},
        {"2", "Scoring"}, 
        {"3", "Options"},
        {"4", "Playing the Game"},
        {"5", "See list of words"},
        {"6", "Back to Main Menu"}
    };
  
    // display the help menu and get the user input selection
    public void helpMenu() {
        do{
            Menu.getChoice(menuItems);            
             
            switch (newChoice) {
                case "1":
                    this.helpMenuControl.gameObject();
                    break;
                case "2":
                    this.helpMenuControl.scoreGame();
                    break;
                case "3":
                    this.helpMenuControl.gameOptions();
                    break;                  
                case "4":
                    this.helpMenuControl.gamePlay();
                    break;
                case "5":
                    this.helpMenuControl.wordList();
                    break;
                case "6":
                    MainMenuView goBack = new MainMenuView();
                    goBack.mainMenu();
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
            }
        }while (!newChoice.equals("6"));
    }
}
