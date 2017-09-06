package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{ /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void sayHello(){
        setH();
        setE();
        setL();
        setLTwo();
        setO();
    }
    
    
    public void setH(){
        verticalLine();
        hLine();
        verticalLine();
        repositionH();
    }
    public void setE(){
        
    }
    publi
    public void repositionH(){
        turnRight();
        turnRight();
        move();
        move();
        turnRight();
    }
    public void verticalLine(){
       putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper(); 
    }
    public void hLine(){
        turnRight();
        move();
        turnRight();
        move();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
   
