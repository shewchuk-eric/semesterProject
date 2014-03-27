

package error.handling;

/**
 *
 * @author Eric Shewchuk
 */
public class MenuException {
    public void mainMenuThrow(){
        rectangle.of.fortune.Menu.border();
        System.out.println("Invalid selection. Please choose either (1), or (2), or (3)");
        rectangle.of.fortune.Menu.border();
    }
    
    public void helpMenuThrow(){
        rectangle.of.fortune.Menu.border();
        System.out.println("Invalid selection. Please enter a valid choice from the menu");
        rectangle.of.fortune.Menu.border();
    }
    
}
