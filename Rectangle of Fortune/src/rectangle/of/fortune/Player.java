

package rectangle.of.fortune;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class Player {
    
    String name;
    int score;
    
    Player() { // This will be changed later to allow for selection of number of players
        score=0;
    }
 
        String getName() {
             Scanner input = new Scanner(System.in);
             this.name = input.next();
             return name;
    }
}

