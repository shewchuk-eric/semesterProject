
package rectangle.of.fortune;
import java.util.Scanner;

/**
 * @author Eric Shewchuk
 */

public class PlayGame {
    
    Scanner inFile = new Scanner(System.in);
    int rounds, played, players, index, cycle, flag=0;
    char guess;
    String word, nameOne, nameTwo, nameThree="";

 public void playGame() {
        StartGame Rounds = new StartGame();
        StartGame Players = new StartGame();
        
        players=Players.playerCount();//get number of players from user     
              Player playerOne = new Player();//initialize player one
                     border();
                     System.out.println("\tPlayer one, please enter your name");
                     border();
                     nameOne = playerOne.getName();
                     playerOne.name=nameOne;
                     
              Player playerTwo = new Player();//initialize player two
                     border();
                     System.out.println("\tPlayer two, please enter your name");
                     border();
                     nameTwo = playerTwo.getName();
                     playerTwo.name=nameTwo;
                     
        if(players==3){
              Player playerThree = new Player();//initialize player three if needed
                     border();
                     System.out.println("\tPlayer three, please enter your name");
                     border();
                     nameThree = playerThree.getName();
                     playerThree.name=nameThree;
                  }
        System.out.println(playerOne.name);
        System.out.println(playerTwo.name);
        System.out.println(nameThree);
        
        rounds=Rounds.playRounds();// set number of rounds to play
        
     for(played=0;played<rounds;played++){//main play game loop
        Words newWord = new Words();//set word difficulty and choose word
        word=newWord.selectWord();
        System.out.println("Begin round "+(played+1));
        GuessLetter secret = new GuessLetter();//play a round
        secret.secretWord(word, players); 
        }
     
     /*Build a function here to gather and track
     player scores for use when rounds are completed.
     */
   
        GameOver wrapUp = new GameOver();
        wrapUp.gameEnd(); 
 }

        public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }  

}
