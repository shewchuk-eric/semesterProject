/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

/**
 *
 * @author kevinphair
 */
public class Menu {
        public static void main(String[] args) {
        RectangleOfFortune newGame = new RectangleOfFortune();
        Player newPlayer = new Player();
        newPlayer.getName();
        newGame.getName();
        newGame.displayHelp();
    }
}
