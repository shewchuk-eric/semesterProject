/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

/**
 *
 * @author Eric
 */
public class PlayGame {
    int rounds, played;
    
    PlayGame() {
        rounds=5;
        played=2;
    }
 public void whatWord() {
     System.out.println("This game will play a total of "+rounds+" rounds./n"
     +played+" rounds have already been played.  There are "+(rounds-played)+" rounds left.");
 }
    
}
