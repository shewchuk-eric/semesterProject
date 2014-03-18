

package rectangle.of.fortune.gameFunctions;
import java.io.Serializable;
import java.util.Scanner;
import rectangle.of.fortune.Menu;

/**
 *
 * @author Eric Shewchuk
 */
public class Player implements Serializable {
    
    static String playerNames[] = new String[3];//initialize player scores arrays
    String name;
    int validName;
    
    Player() { 
        name="";
    }
 
        String getName(int position) {//called from StartGame class
             Scanner input = new Scanner(System.in);
             this.name = input.next();
             validName=name.length();
             while(validName==0) {
 
             if(validName > 15){
                 Menu.border();
                 System.out.println("\tPlayer names must be no longer than 15 characters.");
                 Menu.border();
             }
        }
             playerNames[position]=name;
             return name;
    }
        
        String sendName(int position){
            name=playerNames[position];
            return name;
        }
}
