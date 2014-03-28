
package rectangle.of.fortune.gameFunctions;
import java.io.Serializable;
import java.util.Scanner;
import rectangle.of.fortune.menus.Menu;
import rectangle.of.fortune.Words;

/**
 * @author Eric Shewchuk
 */

public class PlayGame implements Serializable {
    
    public PlayGame() {
    }
    
    static int playerOneScores[] = new int[10];//initialize player scores arrays - convert to a multidimensional array later!
    static int playerTwoScores[] = new int[10];
    static int playerThreeScores[] = new int[10];
    
    Scanner inFile = new Scanner(System.in);
    static int rounds, played, players, totalPoints;
    static String word, nameOne, nameTwo, nameThree="";

 public void playGame() {
        
        Menu.border();
        System.out.println("\t"+GameEnums.STARTGAME.getValue());
        Menu.border();
        
        players=StartGame.playerCount();//get number of players from user     
              Player playerOne = new Player();//initialize player one
                     Menu.border();
                     System.out.println("\tPlayer one, please enter your name");
                     Menu.border();
                     nameOne = playerOne.getName(0);
                     playerOne.name=nameOne;
                     
              Player playerTwo = new Player();//initialize player two
                     Menu.border();
                     System.out.println("\tPlayer two, please enter your name");
                     Menu.border();
                     nameTwo = playerTwo.getName(1);
                     playerTwo.name=nameTwo;
                     
        if(players==3){
              Player playerThree = new Player();//initialize player three if needed
                     Menu.border();
                     System.out.println("\tPlayer three, please enter your name");
                     Menu.border();
                     nameThree = playerThree.getName(2);
                     playerThree.name=nameThree;
                  }
        
        rounds=StartGame.playRounds();// set number of rounds to play
        GuessLetter secret = new GuessLetter();
        
     for(played=0;played<rounds;played++){//main play game loop

        rectangle.of.fortune.Words newWord = new Words();
        //set word difficulty and choose word
        
        if(played==0){
            Menu.border();
            System.out.println("\t"+GameEnums.ROUNDONE.getValue());
            Menu.border();
        } else{
            Menu.border();
            System.out.println("\t"+GameEnums.NEWROUND.getValue());
            Menu.border();            
        }       
        System.out.println("\n\t*** Setup Round " + (played+1) + " ***");
        word=newWord.selectWord();

        System.out.println("*** Begin round "+(played+1)+" ***");
        
        //play a round
        secret.secretWord(word, players, played);
        
        if(played+1==rounds){
            GameOver wrapUp = new GameOver();
            wrapUp.gameEnd(players);
         }        
     }
 }

  public void keepScore(int playerNumber, int round, int pointForGuess) {//called from the GuessLetter class
      if(playerNumber==1){
          playerOneScores[round]+=pointForGuess;         
          System.out.println("Player one has scored $"+playerOneScores[round]);
      }
      else if(playerNumber==2){
          playerTwoScores[round]+=pointForGuess;
          System.out.println("Player two has scored $"+playerTwoScores[round]);
      }         
      else{
          playerThreeScores[round]+=pointForGuess;
          System.out.println("Player three has scored $"+playerThreeScores[round]);
      }
  }
  
     public int finalScore(int contestant){//called from GameOver class
          switch(contestant){
          
          case 1:
            for(int i:playerOneScores)totalPoints+=i;
              break;
          case 2:
            for(int i:playerTwoScores)totalPoints+=i;
              break; 
          case 3:
            for(int i:playerThreeScores)totalPoints+=i;
              break;
          }
          return totalPoints;   
    }
}
