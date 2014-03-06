

package rectangle.of.fortune;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class Words implements Serializable{
    
    Words() {
        
    }

    Scanner inFile = new Scanner(System.in);
    String word, choice;
    int level, i=0, rnd, list=0;
    public Vector<String> vault = new Vector<String>();
    public String[] easyWords = {"SHOUT","LOVE","BEST","BOOK","WATER","LABEL","EAST","FROG","TWIST","WRAP","PARK","SMALL","TRAP","SLIP","SCOOTER","TRUCK","WRITE","FACE","FENCE","BLOCK"};
    public String[] medWords = {"EDIBLE","PEANUT","SPIDER","SLANTED","SCANNER","QUIETLY","AMAZING","PICKLED","OMELET","AVOCADO","JAZZED","STUPOR","FALLEN","TRIFLE","PEPPER","SNOWING","BICYCLE","WEASEL","FAILURE","FLATBED"};
    public String[] hardWords = {"ALPHABET","JEALOUS","ENORMITY","BRANDING","IGNORANT","JUICEBOX","STUPENDOUS","COMPENSATE","MOSQUITOS","CATERPILLAR","INTERNET","SPELLING","SUITCASES","MUSHROOMS","TRANSPORTER","BACKPACK","SLOTHFUL","BEDRIDDEN","ACCELERATE","GARGANTUAN"};

    String selectWord() {// gets called from the PlayGame class
        StartGame difficulty = new StartGame();
        level=difficulty.difficulty();
        switch(level){
            case 1:
                do{
                 rnd = new Random().nextInt(easyWords.length);
                 this.word = easyWords[rnd];
              for(String test:vault)
                  if(test.equals(word)){
                      i=1;
                      }
                }
                  while(i==1);
                      vault.add(word);
                      return word;
            case 2:
                do{
                 rnd = new Random().nextInt(medWords.length);
                 this.word = medWords[rnd];
                 for(String test:vault)
                  if(word.equals(test)){
                      i=1;
                  }
                }
                  while(i==1);
                      vault.add(word); 
                      return word;
            case 3:
                do{
                 rnd = new Random().nextInt(hardWords.length);
                 this.word = hardWords[rnd];
                 for(String test:vault)
                  if(word.equals(test)){
                      i=1;
                    }
                  }
                  while(i==1);
                      vault.add(word);
                      return word;
                  }
          return word;
    }
    
    void printWords() {
        System.out.println("\tPlease choose the difficulty level of the words you want to list.\n"
                + "\t1 - Easy\n"
                + "\t2 - Medium\n"
                + "\t3 - Hard\n"
                + "\t4 - Go back to Help Menu");
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch(choice){
                case "1":
                    border();
                    Arrays.sort(easyWords);
        for (String easyWord : easyWords) {
            System.out.println("\t" + easyWord);
        }
                    border();
                    this.printWords();
                    break;
                case "2":
                    border();
                    Arrays.sort(medWords);
        for (String medWord : medWords) {
            System.out.println("\t" + medWord);
        }
                    border();
                    this.printWords();        
                    break;
                case "3":
                    border();
                    Arrays.sort(hardWords);
        for (String hardWord : hardWords) {
            System.out.println("\t" + hardWord);
        }
                    border();
                    this.printWords();        
                    break;
                case "4":
                    HelpMenuView goHelp = new HelpMenuView();
                    goHelp.getChoice();
                    break;
                default:
                    System.out.println("That is not a valid selection.  Try again.");
            }while(!choice.equals("4"));
      }
private void border() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }        
}
