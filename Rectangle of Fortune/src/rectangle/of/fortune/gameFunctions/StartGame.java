

package rectangle.of.fortune.gameFunctions;
import java.util.Scanner;
import rectangle.of.fortune.Menu;

/**
 *
 * @author Eric Shewchuk
 */
public abstract class StartGame extends GameFunctionsInterface {
    
    static final String[][] difficulty = {
        {"", "How difficult would you like the word to be?\n\tPlease choose from the following:\n"},
        {"1", " - Easy"},
        {"2", " - Medium"},
        {"3", " - Hard"}
    };
    
    static final String[][] roundCount = {
        {"", "Enter how many rounds you would like to play."},
        {"", "You may play up to ten rounds."}
    };
    
    static final String[][] playCount = {
        {"", "How many players will there be?\n"},
        {"2", "There will be (2) players."},
        {"3", "There will be (3) players."}
    };

        static Scanner inFile = new Scanner(System.in);  
        static String nameOne, nameTwo, nameThree="";
        static int rounds, level, players;
        int nameLength;
        
    static public int playerCount() {// called from PlayGame class - choose the number of players 
            GameFunctionsInterface.getChoice(playCount);
            choice = newChoice;
            if(!choice.equals("2") && !choice.equals("3")){//validate entry from user
                System.out.println("\tInvalid selection. Please enter either 2 or 3.");
                playerCount();
            }
            if(choice.equals("2")){//set to 2 players if chosen
                players = 2;
            }
            else{//set to 3 players if chosen
                players = 3;
            }
            return players;//send value back to PlayGame class
    }
    
    static public int playRounds() {//choose the number of rounds to play
        GameFunctionsInterface.getChoice(roundCount);
        switch(newChoice){
             case "1":
                    rounds=1;
                    break;
             case "2":
                    rounds=2;
                    break;
             case "3":
                    rounds=3;
                    break;
             case "4":
                    rounds=4;
                    break;
             case "5":
                    rounds=5;
                    break;                    
             case "6":
                    rounds=6;
                    break;                    
             case "7":
                    rounds=7;
                    break;                    
             case "8":
                    rounds=8;
                    break;
             case "9":
                    rounds=9;
                    break;                    
             case "10":
                    rounds=10;
                    break;                    
             default:
                 Menu.border();
                 System.out.println("\tInvalid selection. Please enter a number between 1 and 10");
                 Menu.border();
                 playRounds();
        }
        return rounds;
    }
    
    static public int difficulty() {//choose the difficulty level
        GameFunctionsInterface.getChoice(difficulty);
        switch(newChoice){
             case "1":
                    level=1;
             return level;
             case "2":
                    level=2;
             return level;
             case "3":
                    level=3;
             return level;
             default:
                 Menu.border();
                 System.out.println("\tInvalid selection. Please choose 1 for easy, 2 for medium, or 3 for hard.");
                 Menu.border();
                 difficulty();
        }
        return level;
    }
}
