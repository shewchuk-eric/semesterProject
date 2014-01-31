/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

/**
 *
 * @author Eric Shewchuk and Kevin Phair
 */
public class GuessLetter {
    char newLet1, newLet2, oldLet1, oldLet2;
    int playerScore=200, goodPick, i, correct;
    String word;
    
    GuessLetter() { // This will be changed later to allow for selection of number of players
        newLet1='s';
        newLet2='r';
        oldLet1='c';
        oldLet2='t';
        goodPick=100;
        word="class";
        correct=3;
    }

    public void checkLetter(){
        if(newLet1==oldLet1){
            System.out.println("That letter has already been used.\nPlease select another letter.");
        }
        else {
            for(i=0; i<word.length(); i++){
             if(newLet1==word.charAt(i)){
                 playerScore+=goodPick;
                 correct++;
                 System.out.println("You found the letter in position "+(i+1)+
                         "\nYour score is now "+playerScore+" points.");
                 if(correct==word.length()){
                     System.out.println("You Win!!!");
                     GameOver gameOver=new GameOver();
                     gameOver.gameEnd();
                 }
             }
        }
    }  
}

}
