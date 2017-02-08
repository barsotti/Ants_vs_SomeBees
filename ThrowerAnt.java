 //-------------------------------------------------------------------------
 /**
  *  The thrower ant throws leaves at the bees.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class ThrowerAnt extends Ant
 {
     //~ Fields ................................................................
     
     /**
      * the timer until throw again.
      */
     int throwTimer;
 
 
     //~ Constructor ...........................................................
   
     // ----------------------------------------------------------
     /**
      * Creates a new ThrowerAnt object.
      */
     public ThrowerAnt()
     {
         super(1, 4);
         throwTimer = 1;
     }
     
     /**
      * throws when time is ready, die when die is ready.
      */
     public void act()
     {
         if (throwTimer == 120)
         {
             this.shoot();
             throwTimer = 1;
         }
         else
         {
             throwTimer = throwTimer + 1;
         }
         this.getStung();
         this.dieAway();
     }
 
 
     //~ Methods ...............................................................
     
     /**
      * adds a leaf
      */
     public void shoot()
     {
         World world = getWorld();
         world.add(new Leaf(), this.getGridX(), this.getGridY());
     }
     
     /**
      * returns throwtimer
      * @return throwtimer    throwtimer
      */
     public int getThrowTimer()
     {
         return throwTimer;
     }
     
     /**
      * sets throwtimer
      * @param n     the throwtimer
      */
     public void setThrowTimer(int n)
     {
         throwTimer = n;
     }
 }
