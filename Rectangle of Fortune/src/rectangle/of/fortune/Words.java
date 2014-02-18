

package rectangle.of.fortune;

import java.util.Random;
import java.util.Vector;
import java.util.Arrays;

/**
 *
 * @author Eric Shewchuk & Kevin Phair
 */
public class Words {
    String word;
    int level, i=0, rnd;
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

  
        
    
}
