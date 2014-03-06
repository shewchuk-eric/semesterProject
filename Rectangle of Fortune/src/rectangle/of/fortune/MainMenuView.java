

package rectangle.of.fortune;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class MainMenuView implements Serializable {
    
    // Create instance of the HelpMenuControl (action) class
    MainMenuView() {
    }
    
    MainMenuControl mainMenuControl = new MainMenuControl();    
    
    //Menu items to be displayed
    private final static String[][] menuItems = {
        {"1", "Start New Game"},
        {"2", "Help and Instructions"}, 
        {"3", "Quit and Exit Game"},
    };
    
    // display the help menu and get the user input selection
    public void getChoice() { 
                      
        String choice;
        Scanner inFile = new Scanner(System.in);
        
        do {            
            this.display();
            
            // get user choice and direct to proper display item
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch (choice) {
                case "1":
                    this.mainMenuControl.newGame();
                    break;
                case "2":
                    this.mainMenuControl.getHelpMenu();
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    break;                  
                default:
                    border();
                    System.out.println("Invalid selection. Please enter a valid selection.");
                    border();
            }
        } while (!choice.equals("3"));
    }
        private void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
        private void display() {
        border();
        System.out.println("\tMAIN MENU\n\n\tEnter the number associated with one of the following commands:");
        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        border();
    }
}
