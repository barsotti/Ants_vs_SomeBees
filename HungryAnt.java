 
 //-------------------------------------------------------------------------
 /**
  *  The hungry ant eats bees.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class HungryAnt extends Ant
 {
     //~ Fields ................................................................
     /**
      * the timer until eat again
      */
     int timer;
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new HungryAnt object.
      */
     public HungryAnt()
     {
         super(1, 5);
         timer = 240;
     }
 
     /**
      * eats, increases timer, and dies
      */
     public void act()
     {
         this.eat();
         timer = timer + 1;
         this.getStung();
         this.dieAway();
     }
     
     //~ Methods ...............................................................
     /**
      * eats when it can
      */
     public void eat()
     {
         if (timer >= 240)
         {
             Actor bee = getOneIntersectingObject(Bee.class);
             if (bee != null)
             {
                 bee.remove();
                 timer = 0;
             }
         }
     }
     
     /**
      * returns the timer
      * @return timer    the timer until it can eat again
      */
     public int getTimer()
     {
         return timer;
     }
     
 }
