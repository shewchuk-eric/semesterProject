

package rectangle.of.fortune;

import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class StartGame {

    Scanner inFile = new Scanner(System.in);  
        
        String choice, nameOne, nameTwo, nameThree="";
        int rounds, level, players, nameLength;

        
    
    public void playerCount() {// choose the number of players 
        border();
        System.out.println("\tWill there be two or three players?");// get user choice and validate
        border();
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            if(choice.equals("2")){
                players=2;
                     Player playerOne = new Player();//initialize player one
                     border();
                     System.out.println("\tPlayer one, please enter your name");
                     border();
                     nameOne = playerOne.getName();
                     
                     Player playerTwo = new Player();//initialize player two
                     border();
                     System.out.println("\tPlayer two, please enter your name");
                     border();
                     nameTwo = playerTwo.getName();
            }
                     
            else if(choice.equals("3")){
                players=3;
                     Player playerOne = new Player();//initialize player one
                     border();
                     System.out.println("\tPlayer one, please enter your name");
                     border();
                     nameOne = playerOne.getName();
                     
                     Player playerTwo = new Player();//initialize player two
                     border();
                     System.out.println("\tPlayer two, please enter your name");
                     border();
                     nameTwo = playerTwo.getName();
                                          
                     Player playerThree = new Player();//initialize player three
                     border();
                     System.out.println("\tPlayer three, please enter your name");
                     border();
                     nameThree = playerThree.getName();
            }
            
            else {
                     border();
                     System.out.println("\tInvalid selection. Please enter either 2 or 3.");
                     border();
                     playerCount();
            }
       }
    
    public void playRounds() {//choose the number of rounds to play
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
    
    public void outputTest() {
        border();
        System.out.println("\tThere are "+players+" players.\n");
        System.out.print("\tTheir names are:\n"+
                "\t"+nameOne+"\n"+
                "\t"+nameTwo+"\n");
        if(!nameThree.equals("")){
            System.out.println("\t"+nameThree);
        }
        border();
        }

    public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}
