
package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk
 */
public enum HelpMenuControlEnums {
    
    GAMEOBJECT("\tThis is a version of the well-known and popular \"Hangman\"  "
                + "\n\tgame.  The object is to successfully guess the hidden "
                + "\n\tword."),
    SCOREGAME("\tPlayers score points by guessing a letter that is contained "
                + "\n\tin the word being played.  The value of each letter is "
                + "\n\trandomly chosen. If the word contains more than one of the "
                + "\n\tletter guessed, then the score is multiplied by the number "
                + "\n\tof letters.  For example, if the value of a correct guess "
                + "\n\tis 200 points and there are two letters then the score  "
                + "\n\twill be 400 points.  The player with the most points after "
                + "\n\tthe last round wins the game."),
    GAMEOPTIONS("\tThis game has three options which are:\n "
                + "\n\t1) NUMBER OF PLAYERS - The game can be played with 2 or 3 "
                + "\n\tplayers. "
                + "\n\t2) NUMBER OF ROUNDS - Up to 10 rounds can be played per "
                + "\n\tgame. "
                + "\n\t3) DIFFICULTY - You can choose from \"Easy\", \"Medium\","
                + "\n\tor \"Hard\". "),
    GAMEPLAY("\tPlayers take turns guessing a letter.  If a player chooses a "
                + "\n\tletter that exists in the word then the players score will "
                + "\n\tincrease.  A successful guess will allow the player to "
                + "\n\tchoose again. If the guessed letter is not present then "
                + "\n\tplay will move to the next players turn.  When a word is "
                + "\n\tcompleted a new round will start unless the chosen number "
                + "\n\tof rounds has been completed."
                );     
    
 String value;
    HelpMenuControlEnums (String v){
        value = v;
    }
    public String getValue(){
        return value;
    }    
}
