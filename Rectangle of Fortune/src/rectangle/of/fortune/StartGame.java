

package rectangle.of.fortune;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class StartGame implements Serializable {
    
    StartGame(){
    }

        Scanner inFile = new Scanner(System.in);  
        static String nameOne, nameTwo, nameThree="";
        String choice;
        static int rounds, level, players;
        int nameLength;
        
    int playerCount() {// called from PlayGame class - choose the number of players 
        border();
        System.out.println("\tWill there be two or three players?");
        border();
            choice = inFile.nextLine();//get user choice
            choice = choice.trim().toUpperCase();//convert to UPPERCASE
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
    
    int playRounds() {//choose the number of rounds to play
        border();
        System.out.println("\tHow many rounds would you like to play?\n\tYou may play up to ten rounds.");
        border();
        choice = inFile.nextLine();
        choice = choice.trim().toUpperCase();
        switch(choice){
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
                 border();
                 System.out.println("\tInvalid selection. Please enter a number between 1 and 10");
                 border();
                 playRounds();
        }
        return rounds;
    }
    
    int difficulty() {//choose the difficulty level
        border();
        System.out.println("\tHow difficult would you like the words to be?\n\tPlease choose from the following:\n"+
                "\t1 - Easy\n"+
                "\t2 - Medium\n"+
                "\t3 - Hard");
        border();
        choice = inFile.nextLine();
        choice = choice.trim().toUpperCase();
        switch(choice){
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
                 border();
                 System.out.println("\tInvalid selection. Please choose 1 for easy, 2 for medium, or 3 for hard.");
                 border();
                 difficulty();
        }
        return level;
    }

    private void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}
