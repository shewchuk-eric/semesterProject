

package error.handling;
 
import citbyui.cit260.rectangleoffortune.views.Menu;
/**
 *
 * @author Eric Shewchuk
 */
public class MenuException {
    public void mainMenuThrow(){
        Menu.border();
        System.out.println("Invalid selection. Please choose either (1), or (2), or (3)");
        Menu.border();
    }
    
    public void helpMenuThrow(){
        Menu.border();
        System.out.println("Invalid selection. Please enter a valid choice from the menu");
        Menu.border();
    }
    
}
