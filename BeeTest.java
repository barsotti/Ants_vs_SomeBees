 
 // -------------------------------------------------------------------------
 /**
  *  The BeeTest class tests the Bee class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.30)
  */
 public class BeeTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new BeeTest test object.
      */
     public BeeTest()
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
      * tests act
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();      
         Colony colony = new Colony(); 
         colony.add(bee, 3, 3);
         bee.setSpeed(1.0);
         // 2. Call the method(s) being tested.
         bee.act();
         // 3. Make assetions capturing your expected outcomes.
             // the bee should now be at (2, 3) so check that spot
         assertEquals(1, colony.getObjectsAt(2, 3, Bee.class).size());
     }
 
     /**
      * tests the getshot method
      */
     public void testGetShot()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         Leaf leaf = new Leaf();
         Colony colony = new Colony();
         colony.add(bee, 3, 3);
         colony.add(leaf, 3, 3);
         // 2. Call the method(s) being tested.
         bee.getShot();
         // 3. Make assetions capturing your expected outcomes.
             // The bee's health should now be 2.
         assertEquals(2, bee.getHealth());
             // The leaf should now be removed.
         assertEquals(0, colony.getObjects(Leaf.class).size());
     }
     
     /**
      * tests the gethealth method
      */
     public void testGetHealth()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         // 2. Call the method(s) being tested.
         bee.getHealth();
         // 3. Make assetions capturing your expected outcomes.
             // The bee's health should now be 3.
         assertEquals(3, bee.getHealth());
     }
     
     /**
      * tests the injure method
      */
     public void testInjure()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         // 2. Call the method(s) being tested.
         bee.injure(4);
         // 3. Make assetions capturing your expected outcomes.
             // The bee's health should now be -1.
         assertEquals(-1, bee.getHealth());
     }
     
     /**
      * tests the move if clear method
      */
     public void testMoveIfClear()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         WallAnt ant = new WallAnt();
         Colony colony = new Colony();
         colony.add(bee, 5, 3);
         colony.add(ant, 3, 3);
         bee.setSpeed(1);
         // 2. Call the method(s) being tested.
         bee.moveIfClear();
         // 3. Make assetions capturing your expected outcomes.
             // The bee's health should now be (4,3) so check x coord.
         assertEquals(4, bee.getGridX());
             // The bee should now be approach the ant and not 
             // move until the ant dies..
             // so check that the bee's x coord remains 3 after 2 turns.
         run(colony, 2);
         assertEquals(3, bee.getGridX());
     }
     
     /**
      * tests the gotomeetthisonesmaker method
      */
     public void testGoToMeetThisOnesMaker()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         Colony colony = new Colony();
         colony.add(bee, 3, 3);
         bee.setHealth(0);
         // 2. Call the method(s) being tested.
         bee.goToMeetThisOnesMaker();
         // 3. Make assetions capturing your expected outcomes.
             // The bee's should have been removed.
         assertEquals(0, colony.getObjects(Bee.class).size());
     }
     
     /**
      * tests the sethealth method
      */
     public void testSetHealth()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         // 2. Call the method(s) being tested.
         bee.setHealth(109);
         // 3. Make assetions capturing your expected outcomes.
             // the health should have been set to 109.
         assertEquals(109, bee.getHealth());
     }
     
     /**
      * tests the setspeed method
      */
     public void testSetSpeed()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         // 2. Call the method(s) being tested.
         bee.setSpeed(1.0);
         // 3. Make assetions capturing your expected outcomes.
             // the speed should have been set to 109.
         assertEquals(1.0, bee.getSpeed(), 0.0001);
     }
     
     /**
      * tests the getspeed method
      */
     public void testGetSpeed()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         bee.setSpeed(1.0);
         // 2. Call the method(s) being tested.
         bee.getSpeed();
         // 3. Make assetions capturing your expected outcomes.
             // the getspeed should return 1.
         assertEquals(1.0, bee.getSpeed(), 0.0001);
     }
 }
