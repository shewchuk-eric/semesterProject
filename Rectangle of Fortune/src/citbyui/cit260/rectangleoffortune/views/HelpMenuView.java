    

package citbyui.cit260.rectangleoffortune.views;

import citbyui.cit260.rectangleoffortune.views.HelpMenuControl;

/**
 *
 * @author Eric Shewchuk
 */

public abstract class HelpMenuView extends Menu{
    
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
    public static void helpMenu() {
        do{
            Menu.getChoice(menuItems);            
            switch (newChoice) {
                case "1":
              Menu.border();
              System.out.println(HelpMenuControlEnums.GAMEOBJECT.getValue());
              Menu.border();
                    break;
                case "2":
                    Menu.border();
                    System.out.println(HelpMenuControlEnums.SCOREGAME.getValue());
                    Menu.border();
                    break;
                case "3":
                    Menu.border();
                    System.out.println(HelpMenuControlEnums.GAMEOPTIONS.getValue());
                    Menu.border();
                    break;                  
                case "4":
                    Menu.border();
                    System.out.println(HelpMenuControlEnums.GAMEPLAY.getValue());
                    Menu.border();
                    break;
                case "5":
                    HelpMenuControl.wordList();
                    break;
                case "6":
                    MainMenuView.mainMenu();
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
            }
        }while (!newChoice.equals("6"));
    }
}
