 
 //-------------------------------------------------------------------------
 /**
  *  The wallAnt dies slowly.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class WallAnt extends Ant
 {
     //~ Fields ................................................................
     
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new WallAnt object.
      */
     public WallAnt()
     {
         super(4, 4);
     }
     
     /**
      * dies slowly.
      */
     public void act()
     {
         this.getStung();
         this.dieAway();
     }
 
     //~ Methods ...............................................................
     
 }
