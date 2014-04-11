
package rectangle.of.fortune.gameFunctions;
import gui.frames.MainFrame;
import java.io.Serializable;
import rectangle.of.fortune.menus.Menu;

/**
 *
 * @author Eric Shewchuk
 */
public class GameOver implements Serializable {
    
    GameOver() {
    }
    
    PlayGame finalTotal1 = new PlayGame();        
    PlayGame finalTotal2 = new PlayGame();  
    PlayGame finalTotal3 = new PlayGame();
    Player pOne = new Player();
    Player pTwo = new Player();
    Player pThree = new Player();
    
    int p1, p2, p3;
    String player1, player2, player3;
    
    public void gameEnd(int players){//called from PlayGame class

             p1=finalTotal1.finalScore(1);//these call back to the PlayGame class
             p2=finalTotal2.finalScore(2);
             p3=finalTotal3.finalScore(3);
             player1=pOne.sendName(0);
             player2=pTwo.sendName(1);
             player3=pThree.sendName(2);
             
             Menu.border();
             System.out.println("\t"+GameEnums.GAMEOVER.getValue());
             Menu.border();
            
            if (players==2){
                if(p1>p2){//first test
                System.out.println("Congratulations "+player1+", you win with a score of "+p1+" which is "+(p1-p2)+" points higher than second place.\n"
                 +"Second place is "+player2+" with a score of "+p2+".");
              }
            
                else{//second test
                System.out.println("Congratulations "+player2+", you win with a score of "+p2+" which is "+(p2-p1)+" points higher than second place.\n"
                 +"Second place is "+player1+" with a score of "+p1+".");
              }}
            
            else{
                
                if(p1>p2&&p2>p3){//first test
                    System.out.println("Congratulations "+player1+", you win with a score of "+p1+" which is "+(p1-p2)+" points higher than second place.\n"
                    +"Second place is "+player2+" with a score of "+p2+" which is "+(p2-p3)+" points higher than third place.\n"
                    +"Sorry "+player3+", but you lost with a score of "+p3+".");
                }
                    
                else if(p1>p3&&p3>p2){//second test
                    System.out.println("Congratulations "+player1+", you win with a score of "+p1+" which is "+(p1-p3)+" points higher than second place.\n"
                    +"Second place is "+player3+" with a score of "+p3+" which is "+(p3-p2)+" points higher than third place.\n"
                    +"Sorry "+player2+", but you lost with a score of "+p2+".");
                }
                    
                else if(p2>p1&&p1>p3){//third test
                System.out.println("Congratulations "+player2+", you win with a score of "+p2+" which is "+(p2-p1)+" points higher than second place.\n"
                +"Second place is "+player1+" with a score of "+p1+" which is "+(p1-p3)+" points higher than third place.\n"
                +"Sorry "+player3+", but you lost with a score of "+p3+".");
                }
            
                else if(p2>p3&&p3>p1){//fourth test
                System.out.println("Congratulations "+player2+", you win with a score of "+p2+" which is "+(p2-p3)+" points higher than second place.\n"
                +"Second place is "+player3+" with a score of "+p3+" which is "+(p3-p1)+" points higher than third place.\n"
                +"Sorry "+player1+", but you lost with a score of "+p1+".");
                }
            
                else if(p3>p1&&p1>p2){//fifth test
                System.out.println("Congratulations "+player3+", you win with a score of "+p3+" which is "+(p3-p1)+" points higher than second place.\n"
                +"Second place is "+player1+" with a score of "+p1+" which is "+(p1-p2)+" points higher than third place.\n"
                +"Sorry "+player2+", but you lost with a score of "+p2+".");
                }
            
                else{//default condition
                System.out.println("Congratulations "+player3+", you win with a score of "+p3+" which is "+(p3-p2)+" points higher than second place.\n"
                +"Second place is "+player2+" with a score of "+p2+" which is "+(p2-p1)+" points higher than third place.\n"
                +"Sorry "+player1+", but you lost with a score of "+p1+".");
            }           
       }
        MainFrame startOver = new MainFrame();
        startOver.setVisible(true);
   }
}
