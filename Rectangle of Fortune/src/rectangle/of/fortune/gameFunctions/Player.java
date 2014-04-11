

package rectangle.of.fortune.gameFunctions;
import java.io.Serializable;
import java.util.Scanner;
import rectangle.of.fortune.menus.Menu;

/**
 *
 * @author Eric Shewchuk
 */
public class Player implements Serializable {
    
    static String playerNames[] = new String[3];//initialize player names array
    String name;
    static int validName;
    static Boolean valid;
    
    Player() { 
        name="";
    }
 
        public static Boolean setName(int position, String name) {//called from PlayerCount class
             validName=name.length();
             if(validName==0 || validName > 15) {
                 valid=false;
                 return valid;
             } 
             playerNames[position]=name;
             valid=true;
             return valid;
         } 
        
        
        String getName(int position) {//called from StartGame class
             //Scanner input = new Scanner(System.in);
             //this.name = input.next();
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
