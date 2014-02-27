
package rectangle.of.fortune;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class GuessLetter {

    int goodPick, moneyCount, spinAmount, i, correct, eachPass, playerNumber=0, round, letterCounter;
    int[] money = {200,225,250,275,300,325,350,375,400,425,450,500,525,550,575,600,20,10,5};
    String word,secretWord;
    String validLetters="BACDEFGHIJKLMNOPQRSTUVWXYZ";
    String vowels="AEIOU";
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
            if(guesses.indexOf(secretLetter) == -1){ //checks to see what letters that have already been guessed are in the secret word 
            System.out.print("_ "); //prints out underscores with a space between each one to show missing letters
            letterCounter=0; //resets the letter counter to 0
            notDone = true; //Because there are still unguessed letters in the secret word, the game is not yet done.
        }
           
            else{
                System.out.print(secretLetter + " ");// If there are some guessed letters, it will display the guessed letters with a space next to them (for aesthetic purposes)
            }
        }
        if (!notDone){// if the game is not not done (meaning it IS done)
            System.out.println("\nCongratulations Player " + playerNumber + "! You successfully guessed the word \"" + secretWord + "\"!"); //congratulates the last player to guess and tells them the full word.
            playerNumber--;//sets player number back 1 for the next round. <--Not sure this is necessary...
            break;//breaks out of the for loop and starts another round.
        }
        
        //get user's guess
        System.out.println("\nGuesses so far: " + guesses);//shows the guesses so far from each user
        if(spinAmount<10){//checks to see what the randomizer has 
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
        for(int zed =0; zed < secretWord.length(); zed++){
        char countLetters = letter.charAt(0);
        if(secretWord.charAt(zed) == countLetters){
        moneyCount++;
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
           int pointForGuess = spinAmount * moneyCount;
           System.out.println("$" +spinAmount + " x " + moneyCount + " = $" + pointForGuess);
           //add pointForGuess to scoreTracker
           //add score to player - in PlayGame class
           scoreTracker.keepScore(playerNumber, round, pointForGuess);
           playerNumber--;
        }
        
        if(playerNumber==eachPass){
            playerNumber=0;
        }
    }
System.out.println("");
 }        
}

