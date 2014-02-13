

package rectangle.of.fortune;

import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk 
 */
public class MainMenuView {
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    // display the help menu and get the user input selection
    public void getChoice() { 
                      
        String choice;
        Scanner inFile = new Scanner(System.in);
        
        do {            
            border();
            System.out.println("\tMAIN MENU\n\n\tEnter the number associated with one of the following commands:");
            System.out.println("\n\t1 - Start New Game");
            System.out.println("\t2 - Help and Instructions");
            System.out.println("\t3 - Quit and Exit Game");
            border();
            
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
                    break;                  
                default:
                    border();
                    System.out.println("Invalid selection. Please enter a valid selection.");
                    border();
                    continue;
            }
        } while (!choice.equals("3"));
         return;
    }
        public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
