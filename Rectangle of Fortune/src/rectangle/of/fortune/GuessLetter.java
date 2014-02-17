
package rectangle.of.fortune;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class GuessLetter {
    char newLet1, newLet2, oldLet1, oldLet2;
    int playerScore, goodPick, i, correct, flag=0, eachPass, playerNumber=0;
    String word, guesses="", secretWord;
    String validLetters="BACDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public void secretWord(String s, int players) {
        secretWord = s;//comes from Words.selectWord() - passed in by PlayGame class
        eachPass=players;

    Scanner keyboard = new Scanner (System.in);

    boolean notDone;     
    while (true){
        playerNumber++;        
        //print out the board
        notDone = false;
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHere's your word:");
            for (char secretLetter : secretWord.toCharArray()){//iterates over the letters
            if(guesses.indexOf(secretLetter) == -1){
            System.out.print("_ ");
            notDone = true;
        }
           
            else{
                System.out.print(secretLetter + " ");
            }
    }
        if (!notDone){
            break;
        }
        //get user's guess
       
        System.out.print("\nGuesses so far: " + guesses);
        System.out.print("\nPlayer number "+playerNumber+", enter a letter:");
        String letter = keyboard.next();
        letter = letter.toUpperCase();
        if(letter.length() != 1 && secretWord.indexOf(letter) == -1){
            System.out.println("You can only guess one letter at a time. Please try again.");
            continue;
        }
        if(validLetters.indexOf(letter) == -1){
            System.out.println("\"" + letter + "\" is not a letter. Please enter a valid letter.");
            playerNumber--;
            continue;
        }
        if(guesses.indexOf(letter)<0){
        guesses += letter;    
        }
        else{
        System.out.println("That letter has already been guessed. Try again.");
        playerNumber--;
        continue;    
        }
        
        if(secretWord.indexOf(letter)<0){
            System.out.println("Bad Guess");
        }
        else{
           System.out.println("Great Guess!"); 
        
    }
        if(playerNumber==eachPass){
            playerNumber=0;
        }
    }
System.out.println("");
 }        
}
/*
    
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
            System.out.println("\tThat letter has already been used.\n\tPlease select another letter.");
        }
        else {
            for(i=0; i<word.length(); i++){
             if(newLet1==word.charAt(i)){
                 playerScore+=goodPick;
                 correct++;
                 System.out.println("\tYou found the letter in position "+(i+1)+
                         "\n\tYour score is now "+playerScore+" points.");
                 if(correct==word.length()){
                     System.out.println("\tYou Win!!!");
                     GameOver gameOver=new GameOver();
                     gameOver.gameEnd();
                 }
             }
        }
    }  
}

}*/
