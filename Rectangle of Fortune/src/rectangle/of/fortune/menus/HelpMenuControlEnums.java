
package rectangle.of.fortune.menus;

/**
 *
 * @author Eric Shewchuk
 */
public enum HelpMenuControlEnums {
    
    GAMEOBJECT("\tThis is a version of the well-known and popular \"Hangman\"  "
                + "\n\tgame.  The object is to successfully guess the hidden "
                + "\n\tword."),
    SCOREGAME("\tPlayers score points by guessing a letter that is contained "
                + "\n\tin the word being played.  Each letter guess is worth a "
                + "\n\trandomly chosen value.  If the word contains more than one "
                + "\n\tof the guessed letter,then the score is multiplied by the "
                + "\n\tnumber of letters.  For example, if there are two letters "
                + "\n\tand the value of a successful guess is 200 points, then "
                + "\n\tthe score will be 400 points.  The player with the most "
                + "\n\tpoints after the last round wins the game."),
    GAMEOPTIONS("\tThis game has three options which are: "
                + "\n\tNUMBER OF PLAYERS. The game can be played with 2 or 3 "
                + "\n\tplayers. "
                + "\n\tNUMBER OF ROUNDS.  Up to 10 rounds can be played per "
                + "\n\tgame. "
                + "\n\tDIFFICULTY.  You can choose from \"Easy\", \"Medium\","
                + "\n\tor \"Hard\". "),
    GAMEPLAY("\tPlayers take turns guessing a letter.  If the letter exists in "
                + "\n\tthe word then the players score will increase.  If a player "
                + "\n\tchooses a letter successfully, the player will be allowed "
                + "\n\tto choose another letter.  If a letter is not successfully "
                + "\n\tguessed then the game moves to the next players turn. "
                + "\n\tWhen a word is completed a new round will start unless the "
                + "\n\tchosen number of rounds has been completed.  The player with "
                + "\n\tthe most points after the last round wins the game.");     
    
 String value;
    HelpMenuControlEnums (String v){
        value = v;
    }
    public String getValue(){
        return value;
    }    
}
