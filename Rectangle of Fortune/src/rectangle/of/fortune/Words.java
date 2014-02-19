

package rectangle.of.fortune;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class Words {

    Scanner inFile = new Scanner(System.in);
    String word, choice;
    int level, i=0, rnd, list=0;
    public Vector<String> vault = new Vector<String>();
    public String[] easyWords = {"SHOUT","LOVE","BEST","BOOK","WATER","LABEL","EAST","FROG","TWIST","WRAP","PARK","SMALL","WATER","SLIP","SCOOTER","TRUCK","WRITE","FACE","FENCE","BLOCK"};
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
    
    public void printWords() {
        System.out.println("\tPlease choose the difficulty level of the words you want to list.\n"
                + "\t1 - Easy\n"
                + "\t2 - Medium\n"
                + "\t3 - Hard\n"
                + "\t4 - Go back to Help Menu");
            choice = inFile.nextLine();
            choice = choice.trim().toUpperCase();
            
            switch(choice){
                case "1":
                    list=1;
                    break;
                case "2":
                    list=2;
                    break;
                case "3":
                    list=3;
                    break;
                case "4":
                    HelpMenuView goHelp = new HelpMenuView();
                    goHelp.getChoice();
                    break;
                default:
                    System.out.println("That is not a valid selection.  Try again.");
            }while(!choice.equals("4"));
            
            /*put for loops and display code here
            use if tests to check the 'list' variable to determine which array to print*/
    }
}
