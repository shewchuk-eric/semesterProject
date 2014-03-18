

package rectangle.of.fortune;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class HelpMenuControl implements Serializable {
    
    HelpMenuControl() {
    }    
    
        static String choice;
        static Scanner inFile = new Scanner(System.in); 


    public static void wordList() {
        System.out.println();
        Menu.border();
        System.out.println(
                "\tYou can choose to print a list of the words that can be played."
                + "\n\tYou will be given the option to list the level of difficulty"
                + "\n\tthat you want to see.  Select one of the following options:\n\n"
                        + "\t1 - Choose a word list to display\n"
                        + "\t2 - Go back to Help Menu\n"
                        + "\t3 - Go back to Main Menu");
        Menu.border();
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch (choice) {
                case "1":
                    Words.printWords();
                    break;
                case "2":
                    break;
                case "3":
                    MainMenuView.mainMenu();
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
            }
        while (!choice.equals("2"));
    }
}

