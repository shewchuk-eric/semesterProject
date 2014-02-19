

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
public class AcceptingNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int numberOfPlayers;
        int numStart=0;
        System.out.print("How many players?");
        numberOfPlayers = keyboard.nextInt();
        String[][] players = new String[numberOfPlayers][3];
        for (int row = 0; row < numberOfPlayers; row++){  
            players[row][0] = "Player" + ++numStart;
        int col = 1;
        int playnum = row + 1;
        System.out.println("Player " + playnum + ", enter your name:");
        players[row][col] = keyboard.next();
     
    }
        
        System.out.println();
}
    }

