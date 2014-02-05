

package rectangle.of.fortune;
/**
 *
 * @author Eric Shewchuk
 */
import java.util.Scanner;
public class HelpMenuView {

    // Menu items to be displayed    
    private final static String[][] menuItems = {
        {"1", "Object of Game"},
        {"2", "Scoring"}, 
        {"3", "Options"},
        {"4", "Playing the Game"},
        {"5", "Quit and Exit"}
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // display the help menu and get the user input selection
    public void getChoice() {       
              
        String choice;
        Scanner inFile = new Scanner(System.in);
        
        do {            
            this.display(); // display the menu
            
            // get user choice and direct to proper display item
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch (choice) {
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
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
                    continue;
            }
        } while (!choice.equals("5"));
         return;
    }

        // displays the help menu - is it worth the trouble to use an array and loop instead of just a direct print?
    public final void display() {
        System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tEnter the number associated with one of the following commands:");
        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
  
}