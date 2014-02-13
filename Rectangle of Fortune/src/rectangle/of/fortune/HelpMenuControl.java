

package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk
 */
public class HelpMenuControl {

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
    
    public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

