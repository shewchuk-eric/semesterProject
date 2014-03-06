

package rectangle.of.fortune;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class Player implements Serializable {
    
    static String playerNames[] = new String[3];//initialize player scores arrays - convert to a multidimensional array later!
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
                 border();
                 System.out.println("\tPlayer names must be no longer than 15 characters.");
                 border();
             }
        }
             playerNames[position]=name;
             return name;
    }
        
        String sendName(int position){
            name=playerNames[position];
            return name;
        }
        
   private void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}
