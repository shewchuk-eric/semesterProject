

package rectangle.of.fortune;

import error.handling.MenuException;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */

public abstract class MainMenuView extends Menu {
    
    MainMenuControl mainMenuControl = new MainMenuControl();    
    
    //Menu items to be displayed
    static final String[][] menuItems = {
        {"", "MAIN MENU"},
        {"1", "Start New Game"},
        {"2", "Help and Instructions"}, 
        {"3", "Quit and Exit Game"},
    };
    
    static int x=1, y=1;
    
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
                    try{
                        x=0;
                        x=y/x;
                    }
                    catch (ArithmeticException exc){
                        error.handling.MenuException problem = new MenuException();
                        problem.mainMenuThrow();
                     }                
            }
         }while (!newChoice.equals("3"));
     }
  }

