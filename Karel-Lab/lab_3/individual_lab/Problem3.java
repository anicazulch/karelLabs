package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void enterRoom(){
        turnLeft();
        for (int i = 0; i <4; i++) {
        if (frontIsClear()){
           move();
           checkRoom();
           if (checkLeftWall() && checkRightWall() && checkCeiling()){
            carpet();
           }
        }
    
    }
   } 
   public void exitRoom(){
        faceSouth();
        while (frontIsClear()){
            move();
        }
    }
   public void checkRoom(){
       checkLeftWall();
       checkRightWall();
       checkCeiling(); 
   }
}

