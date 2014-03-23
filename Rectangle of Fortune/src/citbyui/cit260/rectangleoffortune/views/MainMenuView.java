

package citbyui.cit260.rectangleoffortune.views;

import citbyui.cit260.rectangleoffortune.views.MainMenuControl;
import citbyui.cit260.rectangleoffortune.views.Menu;

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
                    System.out.println(MainMenuControlEnums.QUIT.getValue());
                    break;                  
                default:
                    Menu.border();
                    System.out.println(MainMenuControlEnums.INVALID.getValue());
                    Menu.border();
            }
         }while (!newChoice.equals("3"));
     }
  }

