
package rectangle.of.fortune;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk
 */

public class Menu implements Serializable {
    
    static String choice, newChoice;
    // display the help menu and get the user input selection
    static String getChoice(String[][] options) { 
            
        Scanner inFile = new Scanner(System.in);
        display(options);
            // get user choice and direct to proper display item
            choice = inFile.nextLine();
            newChoice = choice.trim().toUpperCase();
            return newChoice;
        }
        
        static void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        static void display(String[][]options) {
        int items=options.length;
        border();
        System.out.println("\tEnter the number associated with one of the following commands:");
        for (int i = 0; i < items; i++) {
            System.out.println("\t   " + options[i][0] + "\t" + options[i][1]);
        }
        border();
    }        
  }  
