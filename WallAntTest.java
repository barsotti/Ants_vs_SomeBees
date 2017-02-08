 // -------------------------------------------------------------------------
 /**
  *  The WallAntTest class tests the WallAnt class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.02.29)
  */
 public class WallAntTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new WallAntTest test object.
      */
     public WallAntTest()
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
     /*# Insert your own test methods here */
     
     /**
      * tests the act method
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         WallAnt ant = new WallAnt();
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         ant.setCountdownToSting(0);
         // 2. Call the method(s) being tested.
         ant.act();
         // 3. Make assetions capturing your expected outcomes.
             // ant's health should now be 3.
         assertEquals(3, ant.getHealth());
     }
     
     /**
      * tests that the wallant dies after 160 turns. 
      */
     public void testDurability()
     {
         // 1. Set up initial conditions
         WallAnt ant = new WallAnt();
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         // 2. Call the method(s) being tested.
         run(colony, 160);
         // 3. Make assetions capturing your expected outcomes.
             // ant's health should now be 3.
         assertEquals(0, colony.getObjectsAt(3, 3, WallAnt.class).size());
     }
     
     /**
      * tests that the wall ant does it's injuring right.
      */
     public void testBeTough()
     {
         // 1. Set up initial conditions
         WallAnt ant = new WallAnt();
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         // 2. Call the method(s) being tested.
         run(colony, 121);
         // 3. Make assetions capturing your expected outcomes.
             // ant's health should now be 3.
         assertEquals(1, ant.getHealth());
     }
 }
