

package rectangle.of.fortune;

import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk
 */
public class HelpMenuControl {
    
        Words wordList = new Words();
        MainMenuView goMain = new MainMenuView();
        String choice;
        Scanner inFile = new Scanner(System.in);    

    public void gameObject() {
        System.out.println();
        this.border();             
        System.out.println( 
                "\tThis is a version of the well-known and popular \"Hangman\"  "
                + "\n\tgame.  The object is to successfully guess the hidden "
                + "\n\tword.");
        border();
    }
       
    public void scoreGame() {
        System.out.println();
        border();     
        System.out.println( 
                 "\tPlayers score points by guessing a letter that is contained "
                + "\n\tin the word being played.  Each letter is worth 200 points. "
                + "\n\tIf the word contains more than one of the letter guessed, "
                + "\n\tthen the score is multiplied by the number of letters.  For "
                + "\n\texample, if there are two letters then the score will be "
                + "\n\t400 points.  The player who successfully guesses the word "
                + "\n\twill be awarded a 500 point bonus.  The player with the most "
                + "\n\tpoints after the last round wins the game."
                ); 
        border();
    }
            
    public void gameOptions() {
        System.out.println();
        border();     
        System.out.println( 
                "\tThis game has three options which can be set by selecting "
                + "\n\t\"Options\" from the main menu.  The options are:"
                + "\n\t1) Number of players. The game can be played with 2 or 3 "
                + "\n\tplayers.  Two is the default number of players."
                + "\n\t2) Number of rounds.  Up to 10 rounds can be played per "
                + "\n\tgame.  Five is the default number of rounds."
                + "\n\t3) Difficulty.  You can choose from \"Easy\", \"Medium\","
                + "\n\tor \"Hard\".  Medium is the default."
                ); 
        border();
    }
                    
    public void gamePlay() {
        System.out.println();
        border();     
        System.out.println( 
                "\tPlayers take turns guessing a letter.  If the letter exists in "
                + "\n\tthe word then the players score will increase.  After a "
                + "\n\tletter is chosen the player will have a short time to try "
                + "\n\tto guess the word.  If the word is not successfully guessed "
                + "\n\tthen the game moves to the next players turn.  When a word "
                + "\n\tis guessed a new round will start unless the chosen "
                + "\n\tnumber of rounds has been completed."
                ); 
        border();
    }
    
    public void wordList() {
        System.out.println();
        border();
        System.out.println(
                "\tYou can choose to print a list of the words that can be played."
                + "\n\tYou will be given the option to list the level of difficulty"
                + "\n\tthat you want to see.  Select one of the following options:\n\n"
                        + "\t1 - Choose a word list to display\n"
                        + "\t2 - Go back to Help Menu\n"
                        + "\t3 - Go back to Main Menu");
        border();
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch (choice) {
                case "1":
                    this.wordList.printWords();
                    break;
                case "2":
                    break;
                case "3":
                    this.goMain.getChoice();
                    break;
                default: 
                    System.out.println("Invalid selection. Please enter a valid selection.");
            }
        while (!choice.equals("2"));
    }
    
    public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

