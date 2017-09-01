package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  A. Zulch
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnRight();
        turnRight();
        move();
        move();
        beeperRight();
        beeperleftFour();
        move();
        move();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
  
        
    }
    
    public void beeperLeft() {
       pickBeeper();
       turnLeft();
       moveThree();
        
    }
    public void beeperleftFour() {
        beeperLeft();
        beeperLeft();
        beeperLeft();
        beeperLeft();
        
    } 
    public void beeperRight() {
        pickBeeper();
        turnRight();
        moveThree();
        
        
    } 
    public void moveThree() {
       move();
       move();
       move();
        
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

