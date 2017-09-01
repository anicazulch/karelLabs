package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        
    }
    //your methods go below
    /**
     * Precondition: Robot facing east one block away from a row of beepers
     * Postcondition: Robot facing east, two streets about where it started, one block away from a beeper
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    public void harvestOneRow() {
        movePickBeeper();
    }
    public void repositionRight() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionLeft(){
        move();
        turnRight();
        move();
        turnRight();
    }
    
    public void movePickBeeper(){
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
    }
    public void harvestCorner(){
        pickBeeper();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

