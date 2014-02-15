
package rectangle.of.fortune;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class GuessLetter {
    char newLet1, newLet2, oldLet1, oldLet2;
    int playerScore=200, goodPick, i, correct;
    String word;
    
public void guessWord(String s) {
        String secretWord = s;//In the future, this will be replaced with an array of words. We will also need to differentiate between upper and lowercase.
        String guesses = ""; //the user's guesses.
    Scanner keyboard = new Scanner (System.in);
    boolean notDone;
    while (true){
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
        System.out.print("\nEnter Your letter:");
        String letter = keyboard.next();
        if(letter.length() != 1 && secretWord.indexOf(letter) == -1){
            System.out.println("You can only guess one letter at a time. Please try again.");
            continue;
        }
        if(guesses.indexOf(letter)<0){
        guesses += letter;    
        }
        else{
        System.out.println("That letter has already been guessed. Try again.");
        continue;    
        }
        
        if(secretWord.indexOf(letter)<0){
            System.out.println("Bad Guess");
        }
        else{
           System.out.println("Great Guess!"); 
        
    }
    } 
    System.out.println("\nCongratulations! You win!");

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
