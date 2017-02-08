 
 // -------------------------------------------------------------------------
 /**
  *  The FireAntTest class tests the FireAnt class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class FireAntTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new FireAntTest test object.
      */
     public FireAntTest()
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
         FireAnt ant = new FireAnt();
         Bee bee = new Bee();
         Colony colony = new Colony();
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         ant.setHealth(0);
         ant.setCountdownToSting(0);
         // 2. Call the method(s) being tested.
         ant.act();
         // 3. Make assetions capturing your expected outcomes.
             // The bee should have 0 health.
         assertEquals(0, bee.getHealth());
             // The fireant should be removed from the world.
         assertEquals(0, colony.getObjects(FireAnt.class).size());
     }
     
     /**
      * tests the explode method
      */
     public void testExplode()
     {
         // 1. Set up initial conditions
         FireAnt ant = new FireAnt();
         Bee bee = new Bee();
         Bee otherBee = new Bee();
         Colony colony = new Colony();
         colony.add(ant, 3, 3);
         colony.add(bee, 4, 3);
         colony.add(otherBee, 3, 3);
         ant.setHealth(0);
         // 2. Call the method(s) being tested.
         ant.explode();
         // 3. Make assetions capturing your expected outcomes.
             // both bees should have 0 health.
         assertEquals(0, bee.getHealth());
         assertEquals(0, otherBee.getHealth());
     }
 
     /**
      * tests the explode method when health is not 0
      */
     public void testExplodePrematurely()
     {
         // 1. Set up initial conditions
         FireAnt ant = new FireAnt();
         Bee bee = new Bee();
         Colony colony = new Colony();
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         ant.setHealth(10);
         // 2. Call the method(s) being tested.
         ant.explode();
         // 3. Make assetions capturing your expected outcomes.
             // The bee should have 10 health.
         assertEquals(3, bee.getHealth());
     }
 }
