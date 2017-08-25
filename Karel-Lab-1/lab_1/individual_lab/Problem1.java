package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  A. Zulch
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        findBeepers();
        pickUpBeepers();
        reposition();
        putDownBeepers();
        finalPosition();
    }
    public void findBeepers() {
        moveTwo();
        turnLeft();
    }
    public void reposition() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
    }
    public void putDownBeepers() {
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
        putBeeper();
    }
    public void finalPosition() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
    }
    public void pickUpBeepers() {
        moveBeeper();
        moveBeeper();
        turnLeft();
        turnLeft();
        moveThree();
        pickBeeper();
        moveBeeper();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void moveBeeper() {
        move();
        pickBeeper();
        
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveThree() {
        move();
        move();
        move();
    }
    
        
}