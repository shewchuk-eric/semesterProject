/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

import java.util.Random;

/**
 *
 * @author kevinphair
 */
public class Words {
    String Word;
    public String[] hardWords = {"ALPHABET","JEALOUS","ENORMITY","HAIKU","JAZZED","JUICEBOX","STUPENDOUS","STIPEND","HAJJ"};
    public String[] easyWords = {"SAMPLE","LOVE","BETTER","INTERNET","SPIDER","WATER","NEST","EAST","SLANTED","SCANNER"};
    public String[] medWords = {"EDIBLE","PEANUT","BRANDING","SPELLING","QUIETLY","AMAZING","AFTER","YUMMY"};

    public void getRandom(String[] array) {
    int rnd = new Random().nextInt(hardWords.length);
        this.Word = hardWords[rnd];
        
    }
    public void selectWord() {
            System.out.println(this.Word);
    }
}
