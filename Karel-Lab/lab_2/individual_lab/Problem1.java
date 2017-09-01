package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        rowOne();
        repositionRight();
        rowTwo();
        repositionLeft();
        rowThree();
        repositionRight();
        rowFour();
    }
    public void rowOne() {
        turnRight();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void rowTwo() {
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        
    }
    public void rowThree(){
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        
    }
    public void rowFour() {
        move();
        putBeeper();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void repositionLeft(){
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionRight(){
        turnRight();
        move();
        turnRight();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
