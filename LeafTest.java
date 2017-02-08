 // -------------------------------------------------------------------------
 /**
  *  The LeafTest class tests the Leaf class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class LeafTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new LeafTest test object.
      */
     public LeafTest()
     {
         // The constructor is usually empty in unit tests, since it runs
         // once for the whole class, not once for each test method.
         // Per-test initialization should be placed in setUp() instead.
     }
 
 
     //~ Methods ...............................................................
 
     // ----------------------------------------------------------
     /**
      * Sets up the test fixture.
      * Called before every test case method.
      */
     public void setUp()
     {
         /*# Insert your own setup code here */
     }
 
 
     // ----------------------------------------------------------
     /**
      * tests the act method
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         Leaf leaf = new Leaf();
         Colony colony = new Colony(); 
         colony.add(leaf, 3, 3);
         leaf.setSpeed(1);
         // 2. Call the method(s) being tested.
         leaf.act();
         // 3. Make assetions capturing your expected outcomes.
             // The leaf should now be at (4, 3) so check x coordinate.
         assertEquals(4, leaf.getGridX());
     }
     /**
      * tests the leave map method
      */
     public void testLeaveMap()
     {
         // 1. Set up initial conditions
         Leaf leaf = new Leaf();
         Colony colony = new Colony(); 
         colony.add(leaf, 9, 3);
         // 2. Call the method(s) being tested.
         leaf.leaveMap();
         // 3. Make assetions capturing your expected outcomes.
             // The health was set to be 10 so check that getHealth returns 10.
         assertEquals(0, colony.getObjects(Leaf.class).size());
     }
     
     /**
      * tests the set speed method
      */
     public void testSetSpeed()
     {
         // 1. Set up initial conditions
         Leaf leaf = new Leaf();
         Colony colony = new Colony(); 
         colony.add(leaf, 3, 3);
         // 2. Call the method(s) being tested.
         leaf.setSpeed(1);
         // 3. Make assetions capturing your expected outcomes.
             // The leaf should now be at (4, 3) so check x coordinate.
         assertEquals(1.0, leaf.getSpeed(), 0.0001);
     }
     
     /**
      * tests the getspeed method
      */
     public void testGetSpeed()
     {
         // 1. Set up initial conditions
         Leaf leaf = new Leaf();
         Colony colony = new Colony(); 
         colony.add(leaf, 3, 3);
         leaf.setSpeed(1);
         // 2. Call the method(s) being tested.
         leaf.getSpeed();
         // 3. Make assetions capturing your expected outcomes.
             // The leaf should now be at (4, 3) so check x coordinate.
         assertEquals(1.0, leaf.getSpeed(), 0.0001);
     }
 }
