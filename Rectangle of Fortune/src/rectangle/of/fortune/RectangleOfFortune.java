package rectangle.of.fortune;

import java.util.Scanner;

/**
 * @authors Eric Shewchuk and Kevin Phair
 */
public class RectangleOfFortune {
       int rounds=3, letters, found, level;  /** players is how many players in game - game proposal suggests 2 or 3
         * rounds is how many rounds to play - limit to a certain number like 5?
         * letters is how many letters in the word being played
         * found is how many letters have been correctly chosen in the word being played
         */
       String name;
       String instructions= "Welcome to Rectangle of Fortune! \n\n"
               +"This is a variation of the well known \"Hangman\" game.\n"
               +"The game is played by guessing a letter.  If the letter\n"
               +"is present you will score points.  The player with the\n"
               +"highest score wins!\n\n"
               +"Rules of play:\n"
               +"Players will take turns.  Start a player turn by clicking\n"
               +"the \'spin\' button to determine how much each letter will\n"
               +"be worth.  Then choose a letter or click the \'guess word\'\n"
               +"button.  A correctly chosen letter will be rewarded with the\n"
               +"amount of points shown in the spin value box.  Points will\n"
               +"be given for each letter in the word (i.e. if the spin value\n"
               +"is 200 and the word contains two of the chosen letter then a\n"
               +"score of 400 will be added to the player.)  Choosing the last\n"
               +"letter or correctly guessing the word will score bonus points!";
       
       char playWord; // this is the storage container for the word being played
       
    public static void main(String[] args) {
        RectangleOfFortune newGame = new RectangleOfFortune();
        Player playerOne = new Player();
        Player playerTwo = new Player();
        GuessLetter newGuess = new GuessLetter();
        newGuess.checkLetter(); 
        playerOne.getName();
        playerTwo.getName();
        newGame.getName();
        newGame.displayHelp();  
    }
        public void getName() {
             Scanner input = new Scanner(System.in);
             System.out.println("Please enter your name");
             this.name = input.next();
        }
        public void displayHelp() {
            System.out.println("\nWelcome " + this.name + "\n");
            System.out.println(this.instructions);
        }

    private void getRandom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
