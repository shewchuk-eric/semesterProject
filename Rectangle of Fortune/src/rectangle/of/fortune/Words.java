

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
    
    public Words() {  
    }

    static Scanner inFile = new Scanner(System.in);
    static String word, choice;
    static int level;
    int i=0, rnd, list=0;
    
    Vector<String> vault = new Vector<String>();
    
    static final String[] easyWords = {"SHOUT","LOVE","BEST","BOOK","WATER","LABEL","EAST","FROG","TWIST","WRAP","PARK","SMALL","TRAP","SLIP","SCOOTER","TRUCK","WRITE","FACE","FENCE","BLOCK"};
    static final String[] medWords = {"EDIBLE","PEANUT","SPIDER","SLANTED","SCANNER","QUIETLY","AMAZING","PICKLED","OMELET","AVOCADO","JAZZED","STUPOR","FALLEN","TRIFLE","PEPPER","SNOWING","BICYCLE","WEASEL","FAILURE","FLATBED"};
    static final String[] hardWords = {"ALPHABET","JEALOUS","ENORMITY","BRANDING","IGNORANT","JUICEBOX","STUPENDOUS","COMPENSATE","MOSQUITOS","CATERPILLAR","INTERNET","SPELLING","SUITCASES","MUSHROOMS","TRANSPORTER","BACKPACK","SLOTHFUL","BEDRIDDEN","ACCELERATE","GARGANTUAN"};

    public String selectWord() {// gets called from the PlayGame class
        level=rectangle.of.fortune.gameFunctions.StartGame.difficulty();
        switch(level){
            case 1:
                do{
                 rnd = new Random().nextInt(easyWords.length);
                 word = easyWords[rnd];
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
                 word = medWords[rnd];
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
                 word = hardWords[rnd];
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
    
    public static void printWords() {
        System.out.println("\tPlease choose the difficulty level of the words you want to list.\n"
                + "\t1 - Easy\n"
                + "\t2 - Medium\n"
                + "\t3 - Hard\n"
                + "\t4 - Go back to Help Menu");
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch(choice){
                case "1":
                    Menu.border();
                    Arrays.sort(easyWords);
        for (String easyWord : easyWords) {
            System.out.println("\t" + easyWord);
        }
                    Menu.border();
                    printWords();
                    break;
                case "2":
                    Menu.border();
                    Arrays.sort(medWords);
        for (String medWord : medWords) {
            System.out.println("\t" + medWord);
        }
                    Menu.border();
                    printWords();        
                    break;
                case "3":
                    Menu.border();
                    Arrays.sort(hardWords);
        for (String hardWord : hardWords) {
            System.out.println("\t" + hardWord);
        }
                    Menu.border();
                    printWords();        
                    break;
                case "4":
                    HelpMenuView.helpMenu();
                    break;
                default:
                    System.out.println("That is not a valid selection.  Try again.");
            }while(!choice.equals("4"));
      }
}
