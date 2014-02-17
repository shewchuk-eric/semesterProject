

package rectangle.of.fortune;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class Player {
    
    String name;
    int score, validName;
    
    Player() { 
        score=0;
        name="";
    }
 
        String getName() {//called from StartGame class
             Scanner input = new Scanner(System.in);
             this.name = input.next();
             validName=name.length();
             while(validName==0) {
             continue;
          }  
             if(validName > 15){
                 border();
                 System.out.println("\tPlayer names must be no longer than 15 characters.");
                 border();
                 getName();
             }
             return name;
    }
        
   public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}

