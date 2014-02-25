
package rectangle.of.fortune;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class GuessLetter {

    int goodPick, count, spinAmount, i, correct, eachPass, playerNumber=0, round;
    int[] money = {1000,250,300,350,400,450,500,550,600,650,750,800,900,1250,1500,20,10,5};
    String word,secretWord;
    String validLetters="BACDEFGHIJKLMNOPQRSTUVWXYZ";
    PlayGame scoreTracker = new PlayGame();
    
    public void secretWord(String s, int players, int played) {
        String guesses="";
        secretWord = s;//comes from Words.selectWord() - passed in by PlayGame class
        eachPass=players;
        round=played;

    Scanner keyboard = new Scanner (System.in);

    boolean notDone;     
    while (true){
        playerNumber++;        
        //print out the board
        notDone = false;
        int rnd = new Random().nextInt(money.length);
        spinAmount=money[rnd];
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHere's your word:");
            for (char secretLetter : secretWord.toCharArray()){//iterates over the letters
            if(guesses.indexOf(secretLetter) == -1){
            System.out.print("_ ");
            count=0;
            notDone = true;
        }
           
            else{
                System.out.print(secretLetter + " ");
            }
        }
        if (!notDone){
            System.out.println("\nCongratulations Player " + playerNumber + "! You successfully guessed the word \"" + secretWord + "\"!");
            playerNumber--;
            break;
        }
        
        //get user's guess
        System.out.println("\nGuesses so far: " + guesses);
        if(spinAmount<10){
            System.out.println("Bankrupt! You lose all your money!");
            //scoreTracker multiply score by 0.
            continue;
        }
            else if(spinAmount<100){
                System.out.println("Sorry! You lose your turn!");
                continue;
            }
            else{
                System.out.println("Each correct guess gets you $" + spinAmount + " per letter.");
        }
        System.out.print("Player number "+playerNumber+", enter a letter:");
        String letter = keyboard.next();
        letter = letter.toUpperCase();
        if(letter.length() != 1){
                if (letter.equals(secretWord)) {
                    guesses += letter;
                    continue;
                }else{
                    System.out.println("You can only guess one letter at a time. Please try again.");
                    playerNumber--;
                    continue;
                }
        }
        if(validLetters.indexOf(letter) == -1){
            System.out.println("\"" + letter + "\" is not a letter. Please enter a valid letter.");
            playerNumber--;
            continue;
        }
        if(guesses.indexOf(letter)<0){
        guesses += letter;
        char c = letter.charAt(0);
        for(int i =0; i < secretWord.length(); i++){
        if(secretWord.charAt(i) == c){
        count++;
                }
            }
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
           int pointForGuess = spinAmount * count;
           System.out.println("$" +spinAmount + " x " + count + " = $" + pointForGuess);
           //add pointForGuess to scoreTracker
           //add score to player - in PlayGame class
           scoreTracker.keepScore(playerNumber, round);
           playerNumber--;
        }
        
        if(playerNumber==eachPass){
            playerNumber=0;
        }
    }
System.out.println("");
 }        
}

