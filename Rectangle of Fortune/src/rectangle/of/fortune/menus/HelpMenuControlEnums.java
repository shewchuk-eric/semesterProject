
package rectangle.of.fortune.menus;

/**
 *
 * @author Eric Shewchuk
 */
public enum HelpMenuControlEnums {
    
    GAMEOBJECT("This is a version of the well-known and popular \"Hangman\" game.  The object is to successfully guess the hidden word."),
    SCOREGAME("Players score points by guessing a letter that is contained in the word being played.  Each letter guess is worth a randomly chosen value.  If the word contains more than one of the guessed letter,then the score is multiplied by the number of letters.  For example, if there are two letters and the value of a successful guess is 200 points, then the score will be 400 points.  The player with the most points after the last round wins the game."),
    GAMEOPTIONS("This game has three options which are: "
                + "\nNUMBER OF PLAYERS. The game can be played with 2 or 3 players. "
                + "\nNUMBER OF ROUNDS.  Up to 10 rounds can be played per game. "
                + "\nDIFFICULTY.  You can choose from \"Easy\", \"Medium\", or \"Hard\". "),
    GAMEPLAY("Players take turns guessing a letter.  If the letter exists in the word then the players score will increase.  If a player chooses a letter successfully, the player will be allowed to choose another letter.  If a letter is not successfully guessed then the game moves to the next players turn. When a word is completed a new round will start unless the chosen number of rounds has been completed.  The player with the most points after the last round wins the game.");     
    
 String value;
    HelpMenuControlEnums (String v){
        value = v;
    }
    public String getValue(){
        return value;
    }    
}
