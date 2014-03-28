package rectangle.of.fortune;

import rectangle.of.fortune.menus.MainMenuView;
import error.handling.MenuException;
import java.util.InputMismatchException;
import java.util.Scanner;
import rectangle.of.fortune.menus.Menu;

/**
 * @author Eric Shewchuk
 */
public class RectangleOfFortune {
       
    public static void main(String[] args) {
           
            int i=0;
            Scanner scan = new Scanner(System.in);
    
            try{
                System.out.println("For testing purposes only, please enter any number to begin.");
                i=scan.nextInt();
                MainMenuView.mainMenu();
                    }
            catch(InputMismatchException ex){
                error.handling.MenuException error = new MenuException();
                error.mainException();
                    }
            finally{
                System.out.println(" Goodbye!"); 
                Menu.border();
                System.exit(0);
                        
                        

        }
    }
}