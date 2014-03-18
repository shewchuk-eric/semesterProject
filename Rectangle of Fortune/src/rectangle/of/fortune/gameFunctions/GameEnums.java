
package rectangle.of.fortune.gameFunctions;

/**
 *
 * @author Eric Shewchuk
 */
public enum GameEnums {
    STARTGAME ("Begin Playing New Game"),
    ROUNDONE ("Start the First Round"),
    NEWROUND ("Start Next Round"),
    GAMEOVER ("Game Over!");
    
    String value;
    GameEnums (String v){
        value = v;
    }
    public String getValue(){
        return value;
    }
    
}
