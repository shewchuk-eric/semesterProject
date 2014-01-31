/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

import java.util.Scanner;

/**
 *
 * @author Eric Shewchuk and Kevin Phair
 */
public class Player {
    String name;
    int players=2, score;
    
    Player() { // This will be changed later to allow for selection of number of players
        score=0;
    }
        public void getName() {
             System.out.println("Enter player name\n\n");
             Scanner input = new Scanner(System.in);
             this.name = input.next();             
             System.out.println("Hi "+this.name+", there are "+players+" players.");
             /*System.out.println("Player 1 please enter your name");
             playOne.playName = input.next();
             System.out.println("Player 2 please enter your name");
             playTwo.playName = input.next();
             System.out.println("Player 3 please enter your name");
             playThree.playName = input.next();
             System.out.println("The player names are:\n"+playOne+"\n"+playTwo+"\n"+playThree);
        }    */
}}

