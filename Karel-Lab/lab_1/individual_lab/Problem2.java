package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        moveToTop();
        figureEight();
        originalPosition();
        //test
    }
    
    public void figureEight() {
        move();
        rightTurn();
        rightTurn();
        leftTurn();
        leftTurn();
        leftTurn();
        leftTurn();
        rightTurn();
    }
    
    public void moveToTop() {
        turnLeft();
        move();
        turnRight();
        moveFour();
        turnRight();
        move();
    }
    public void originalPosition() {
        turnLeft();
        turnLeft();
        moveFour();
        turnLeft();
        move();
        turnLeft();
    }
    
    public void moveFour() {
        move();
        move();
        move();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void leftTurn() {
        turnLeft();
        move();
        move();
    }
    
    public void rightTurn() {
        turnRight();
        move();
        move();
    }  
    
}