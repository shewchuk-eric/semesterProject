/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.of.fortune;

/**
 *
 * @author Eric
 */
public class GameOver {
    public void gameEnd(){
        double pOneRound1=500, pOneRound2=100, pOneRound3=300;
        double pTwoRound1=400, pTwoRound2=400, pTwoRound3=300;
        double pThreeRound1=100, pThreeRound2=600, pThreeRound3=100;
        double playerOneScore, playerTwoScore, playerThreeScore;
        int p1, p2, p3;
        String player1="Kevin", player2="Eric", player3="Terry";
        playerOneScore=pOneRound1+pOneRound2+pOneRound3;
            p1=(int)playerOneScore;
        playerTwoScore=pTwoRound1+pTwoRound2+pTwoRound3;
            p2=(int)playerTwoScore;
        playerThreeScore=pThreeRound1+pThreeRound2+pThreeRound3;
            p3=(int)playerThreeScore;
            
            if(p1>p2&&p2>p3){//first test
                System.out.println("Congratulations "+player1+", you win with a score of "+p1+" which is "+(p1-p2)+" points higher than second place.\n"
            +"Second place is "+player2+" with a score of "+p2+" which is "+(p2-p3)+" points higher than third place.\n"
            +"Sorry "+player3+", but you lost.");
            }
            
            else if(p1>p3&&p3>p2){//second test
                System.out.println("Congratulations "+player1+", you win with a score of "+p1+" which is "+(p1-p3)+" points higher than second place.\n"
            +"Second place is "+player3+" with a score of "+p3+" which is "+(p3-p2)+" points higher than third place.\n"
            +"Sorry "+player2+", but you lost.");
            }
            
            else if(p2>p1&&p1>p3){//third test
                System.out.println("Congratulations "+player2+", you win with a score of "+p2+" which is "+(p2-p1)+" points higher than second place.\n"
            +"Second place is "+player1+" with a score of "+p1+" which is "+(p1-p3)+" points higher than third place.\n"
            +"Sorry "+player3+", but you lost.");
            }
            
            else if(p2>p3&&p3>p1){//fourth test
                System.out.println("Congratulations "+player2+", you win with a score of "+p2+" which is "+(p2-p3)+" points higher than second place.\n"
            +"Second place is "+player3+" with a score of "+p3+" which is "+(p3-p1)+" points higher than third place.\n"
            +"Sorry "+player1+", but you lost.");
            }
            
            else if(p3>p1&&p1>p2){//fifth test
                System.out.println("Congratulations "+player3+", you win with a score of "+p3+" which is "+(p3-p1)+" points higher than second place.\n"
            +"Second place is "+player1+" with a score of "+p1+" which is "+(p1-p2)+" points higher than third place.\n"
            +"Sorry "+player2+", but you lost.");
            }
            
            else{//default condition
                System.out.println("Congratulations "+player3+", you win with a score of "+p3+" which is "+(p3-p2)+" points higher than second place.\n"
            +"Second place is "+player2+" with a score of "+p2+" which is "+(p2-p1)+" points higher than third place.\n"
            +"Sorry "+player1+", but you lost.");
            }
            
    }    
}
