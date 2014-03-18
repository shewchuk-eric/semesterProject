

package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public abstract class MainMenuView extends Menu {
    
    MainMenuView() {
    }
    
    MainMenuControl mainMenuControl = new MainMenuControl();    
    
    //Menu items to be displayed
    static final String[][] menuItems = {
        {"", "MAIN MENU"},
        {"1", "Start New Game"},
        {"2", "Help and Instructions"}, 
        {"3", "Quit and Exit Game"},
    };
    
    // display the help menu and get the user input selection
    public static void mainMenu() {
           do{
               Menu.getChoice(menuItems);
            switch (newChoice) {
                case "1":
                    MainMenuControl.newGame();
                    break;
                case "2":
                    MainMenuControl.getHelpMenu();
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    break;                  
                default:
                    Menu.border();
                    System.out.println("Invalid selection. Please enter a valid selection.");
                    Menu.border();
            }
         }while (!newChoice.equals("3"));
     }
  }

