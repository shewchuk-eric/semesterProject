

package rectangle.of.fortune;
/**
 *
 * @author Eric Shewchuk
 */
import java.util.Scanner;
public class HelpMenuView {
    
    Scanner inFile = new Scanner(System.in);
    String choice;

    // Menu items to be displayed    
    public final static String[][] menuItems = {
        {"1", "Object of Game"},
        {"2", "Scoring"}, 
        {"3", "Options"},
        {"4", "Playing the Game"},
        {"5", "See list of words"},
        {"6", "Back to Main Menu"}
    };
    
    // Create instance of the HelpMenuControl (action) class
    HelpMenuControl helpMenuControl = new HelpMenuControl();
  
    // display the help menu and get the user input selection
    public void getChoice() {
        
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
                    this.helpMenuControl.wordList();
                    break;
                case "6":
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
            }
        } while (!choice.equals("6"));
    }

    public final void display() {
        border();
        System.out.println("\tHELP MENU\n\n\tEnter the number associated with one of the following commands:");
        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        border();
    }
      public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}