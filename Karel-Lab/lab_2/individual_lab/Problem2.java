package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        repositionHalf();
        setBField();
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
    public void setBField() {
        rowFive();
        repositionLeft();
        rowSix();
        repositionRight();
        rowSeven();
        repositionFinal();
    }
    public void rowFive(){
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void rowSix(){
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void rowSeven(){
        move();
        putBeeper();
    }
    public void repositionFinal(){
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
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
    }
    public void repositionHalf() {
        move();
        turnRight();
        move();
        move();
        move();
        move();
        turnRight();
        move();
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
