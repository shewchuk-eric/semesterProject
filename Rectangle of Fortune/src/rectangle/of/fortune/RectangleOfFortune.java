package rectangle.of.fortune;

import gui.frames.MainFrame;
import rectangle.of.fortune.menus.MainMenuView;



/**
 * @author Eric Shewchuk
 */
public class RectangleOfFortune {
       
    public static void main(String[] args) {

               
                
  java.awt.EventQueue.invokeLater(new Runnable() {
    public void run(){
      new MainFrame().setVisible(true);
            }
        });
  
    MainMenuView.mainMenu(); 
}
}