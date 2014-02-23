
package rectangle.of.fortune;
import java.util.Scanner;

/**
 * @author Eric Shewchuk
 */

public class PlayGame {
    
    int playerOneScores[] = new int[10];//initialize player scores arrays - convert to a multidimensional array later!
    int playerTwoScores[] = new int[10];
    int playerThreeScores[] = new int[10];
    
    Scanner inFile = new Scanner(System.in);
    int rounds, played, players, totalPoints, totalPoints1, one, two, three;
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
        
        rounds=Rounds.playRounds();// set number of rounds to play
        GuessLetter secret = new GuessLetter();        
     for(played=0;played<rounds;played++){//main play game loop
        Words newWord = new Words();
        //set word difficulty and choose word
        word=newWord.selectWord();
        System.out.println("Begin round "+(played+1));
        
        //play a round
        secret.secretWord(word, players, played);
        
        if(played+1==rounds){
            GameOver wrapUp = new GameOver();
            wrapUp.gameEnd(players);
        }        
     }
 }

  public void keepScore(int playerNumber, int round) {//called from the GuessLetter class
      if(playerNumber==1){
          playerOneScores[round]+=200;         
          System.out.println("Player one has scored "+playerOneScores[played]);
      }
      else if(playerNumber==2){
          playerTwoScores[round]+=200;
          System.out.println("Player two has scored "+playerTwoScores[played]);
      }         
      else{
          playerThreeScores[round]+=200;
          System.out.println("Player three has scored "+playerThreeScores[played]);
      }
  }
  
     int finalScore(int contestant){//called from GameOver class
          switch(contestant){
          
          case 1:
            for(int i:playerOneScores){
              totalPoints+=i;
          }
          return totalPoints;   
          case 2:
            for(int i:playerTwoScores){
              totalPoints+=i;
          }
          return totalPoints;   
          default:
            for(int i:playerThreeScores){
              totalPoints+=i;
          }
          return totalPoints;   
  }
    }
   

  public void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

}
}
