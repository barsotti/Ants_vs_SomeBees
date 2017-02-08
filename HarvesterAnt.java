 
 //-------------------------------------------------------------------------
 /**
  *  The harvester ant generates food for the colony.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class HarvesterAnt extends Ant
 {
     //~ Fields ................................................................
     /**
      * the time until the bee can harvest again.
      */
     int timer;
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new HarvesterAnt object.
      */
     public HarvesterAnt()
     {
         super(1, 2);
     }
     
     
     /**
      * harvests and dies
      */
     public void act()
     {
         this.harvest();
         this.getStung();
         this.dieAway();
     }
     //~ Methods ...............................................................
 
     /**
      * adds food to the colony
      */
     public void harvest()
     {
         if (timer == 39)
         {
             this.getWorld().addFood(1);
             timer = 0;
         }
         else
         {
             timer = timer + 1;
         }
     }
     
     /**
      * returns the timer
      * @return timer    the timer
      */
     public int getTimer()
     {
         return timer;
     }
     
     /**
      * sets the timer
      * @param z the timer.
      */
     public void setTimer(int z)
     {
         timer = z;
     }
 }
