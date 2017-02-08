 // -------------------------------------------------------------------------
 /**
  *  The QueensChamberTest class tests the QueensChamber class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class QueensChamberTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new QueensChamberTest test object.
      */
     public QueensChamberTest()
     {
         // The constructor is usually empty in unit tests, since it runs
         // once for the whole class, not once for each test method.
         // Per-test initialization should be placed in setUp() instead.
     }
 
 
     //~ Methods ...............................................................
     
     /**
      * tests the queens chamber to see if it exists when called
      * by the world class
      */
     public void testQueensChamber()
     {
         // 1. Set up initial conditions
         Colony colony = new Colony(); 
         // 3. Make assetions capturing your expected outcomes.
             // There should be a queenschamber at (0, 3)
         assertEquals(1, colony.getObjectsAt(0, 3, QueensChamber.class).size());
     }
 }
