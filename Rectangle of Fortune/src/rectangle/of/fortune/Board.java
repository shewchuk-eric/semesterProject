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
public class Board {
    int letters;
    int players;
    String word;
    char guess;
    
    Board() {
        word="hello";
    }
 public void whatWord() {
    System.out.println(word);
    }
}
