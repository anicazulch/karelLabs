package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(5, 1, North, 10);
        karel.setPins();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("hello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(20);  
        World.setVisible(true);
    }
}