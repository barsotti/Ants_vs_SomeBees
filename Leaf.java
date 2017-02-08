 import sofia.util.*;
 
 //-------------------------------------------------------------------------
 /**
  *  The leaf travels across the world until 
  *  it comes into contact with a bee.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class Leaf extends Actor
 {
     //~ Fields ................................................................
     /**
      * the speed of the leaf
      */
     double speed;
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new Leaf object.
      */
     public Leaf()
     {
         speed = 0.025;
     }
     
     /**
      * moves until it falls off the map
      */
     public void act()
     {
         this.move(speed);
         this.leaveMap();
     }
 
 
     //~ Methods ...............................................................
     
     /**
      * gets removed when it moves too far.
      */
     public void leaveMap()
     {
         if (this.getGridX() >= getWorld().getWidth() - 1)
         {
             this.remove();
         }
     }
     
     /**
      * sets speed
      * @param b   the speed
      */
     public void setSpeed(int b)
     {
         speed = b;
     }
     
     /**
      * returns speed.
      * @return speed    the speed of the leaf
      */
     public double getSpeed()
     {
         return speed;
     }
 }
