
package rectangle.of.fortune.menus;
import java.io.Serializable;
import java.util.Scanner;
import rectangle.of.fortune.DisplayInfo;
import rectangle.of.fortune.EnterInfo;
/**
 *
 * @author Eric Shewchuk
 */

public abstract class Menu implements Serializable, DisplayInfo, EnterInfo {
    
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
        
        public static void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        public static void display(String[][]options) {
        int items=options.length;
        border();
        System.out.println("\tEnter the number associated with one of the following commands:");
        for (int i = 0; i < items; i++) {
            System.out.println("\t   " + options[i][0] + "\t" + options[i][1]);
        }
        border();
    }        
  }  
