package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Planter extends Harvester
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvestCorner(){
        putBeeper();
    
}
}
