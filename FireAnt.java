 //-------------------------------------------------------------------------
 /**
  *  The FireAnt is an ant that explodes when it dies.
  *  
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class FireAnt extends Ant
 {
     //~ Fields ................................................................
 
     
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new FireAnt object.
      */
     public FireAnt()
     {
         super(1, 4);
     }
     
     //~ Methods ...............................................................
     /**
      * takes away health, explodes, and removes when necessary.
      */
     public void act()
     {
         this.explode();
         this.getStung();
         this.dieAway();
     }
     
     /**
      * kills surrounding bees when its health reaches 0.
      */
     public void explode()
     {
         if (this.getHealth() <= 0)
         {
             for (Bee bees: this.getNeighbors(1, true, Bee.class))
             {
                 bees.injure(3);
             }
             Bee bee = this.getIntersectingObjects(Bee.class).get(0);
             bee.injure(3);
         }
     }
 }
