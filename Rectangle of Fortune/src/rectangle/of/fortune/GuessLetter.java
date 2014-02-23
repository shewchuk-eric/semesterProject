
package rectangle.of.fortune;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class GuessLetter {

    int goodPick, i, correct, eachPass, playerNumber=0, round;
    String word,secretWord;
    String validLetters="BACDEFGHIJKLMNOPQRSTUVWXYZ";
    PlayGame scoreTracker = new PlayGame();
    
    public void secretWord(String s, int players, int played) {
        String guesses="";
        secretWord = s;//comes from Words.selectWord() - passed in by PlayGame class
        eachPass=players;
        round=played;

    Scanner keyboard = new Scanner (System.in);

    boolean notDone;     
    while (true){
        playerNumber++;        
        //print out the board
        notDone = false;
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHere's your word:");
            for (char secretLetter : secretWord.toCharArray()){//iterates over the letters
            if(guesses.indexOf(secretLetter) == -1){
            System.out.print("_ ");
            notDone = true;
        }
           
            else{
                System.out.print(secretLetter + " ");
            }
        }
        if (!notDone){
            System.out.println("\nCongratulations Player " + playerNumber + "! You successfully guessed the word \"" + secretWord + "\"!");
            break;
        }
        
        //get user's guess
        System.out.print("\nGuesses so far: " + guesses);
        System.out.print("\nPlayer number "+playerNumber+", enter a letter:");
        String letter = keyboard.next();
        letter = letter.toUpperCase();
        if(letter.length() != 1){
                if (letter.equals(secretWord)) {
                    guesses += letter;
                    continue;
                }else{
                    System.out.println("You can only guess one letter at a time. Please try again.");
                    playerNumber--;
                    continue;
                }
        }
        if(validLetters.indexOf(letter) == -1){
            System.out.println("\"" + letter + "\" is not a letter. Please enter a valid letter.");
            playerNumber--;
            continue;
        }
        if(guesses.indexOf(letter)<0){
        guesses += letter;    
        }
        else{
        System.out.println("That letter has already been guessed. Try again.");
        playerNumber--;
        continue;    
        }
        
        if(secretWord.indexOf(letter)<0){
            System.out.println("Bad Guess");
        }
        else{
           System.out.println("Great Guess!");
           //add score to player - in PlayGame class
           scoreTracker.keepScore(playerNumber, round);
           playerNumber--;
        }
        
        if(playerNumber==eachPass){
            playerNumber=0;
        }
    }
System.out.println("");
 }        
}

