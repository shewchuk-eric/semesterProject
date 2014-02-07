

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
            System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tMAIN MENU\n\n\tEnter the number associated with one of the following commands:");
            System.out.println("\n\t1 - Start New Game");
            System.out.println("\t2 - Help and Instructions");
            System.out.println("\t3 - Quit and Exit Game");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            
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
                    System.out.println("Invalid selection. Please enter a valid selection.");
                    continue;
            }
        } while (!choice.equals("3"));
         return;
    }
}
