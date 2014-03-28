/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune.menus;

/**
 *
 * @author kevinphair
 */
public enum MainMenuControlEnums {
    QUIT("Goodbye!"),
    INVALID("Invalid selection. Please enter a valid selection.");
    
    
    String value;
    MainMenuControlEnums (String v){
        value = v;
    }
    public String getValue(){
        return value;
    }    
    
}
