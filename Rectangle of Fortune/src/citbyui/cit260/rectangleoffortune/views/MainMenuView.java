

package citbyui.cit260.rectangleoffortune.views;
import error.handling.MenuException;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public abstract class MainMenuView extends Menu {
    
    static int x=0, y=1;
    
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
                    try{
                    x=y/x;
                    }
                    catch(ArithmeticException exc){
                    error.handling.MenuException error = new MenuException();
                    error.mainMenuThrow();
                    }
              }
     }while (!newChoice.equals("3"));
 }}

  


