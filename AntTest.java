 // -------------------------------------------------------------------------
 /**
  *  The AntTest class tests the Ant class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.30)
  */
 public class AntTest extends TestCase
 {
     //~ Fields ................................................................
 
     
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new AntTest test object.
      */
     public AntTest()
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
     
     /**
      * tests the dieaway method.
      */
     public void testDieAway()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(0, 0);      
         Colony colony = new Colony(); 
         colony.add(ant, 5, 5);
         // 2. Call the method(s) being tested.
         ant.dieAway();
         // 3. Make assetions capturing your expected outcomes.
             // The ant should not be on the colony.
         assertEquals(0, colony.getObjects(Ant.class).size());
     }
     
     /**
      * tests the get foodcost method
      */
     public void testGetFoodCost()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(1, 10);      
         Colony colony = new Colony(); 
         colony.add(ant, 5, 5);
         // 2. Call the method(s) being tested.
         ant.getFoodCost();
         // 3. Make assetions capturing your expected outcomes.
             // The food cost was set to be 10, so check the food cost.
         assertEquals(10, ant.getFoodCost());
     }
     
     /**
      * tests the get health method
      */
     public void testGetHealth()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(10, 0);
         Colony colony = new Colony(); 
         colony.add(ant, 5, 5);
         // 2. Call the method(s) being tested.
         ant.getHealth();
         // 3. Make assetions capturing your expected outcomes.
             // The health was set to be 10 so check that getHealth returns 10.
         assertEquals(10, ant.getHealth());
     }
     
     /**
      * tests the getstung method.
      */
     public void testGetStung()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(10, 0);
         Bee bee = new Bee();
         Colony colony = new Colony();
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         ant.setCountdownToSting(0);
         // 2. Call the method(s) being tested.
         ant.getStung();
         // 3. Make assetions capturing your expected outcomes.
             // The ant should have 9 health after waiting 40 turns
         assertEquals(9, ant.getHealth());
     }
     
     /**
      * tests the getcountdowntosting method
      */
     public void testGetCountdownToSting()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(10, 0);
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         ant.getStung();
         // 2. Call the method(s) being tested.
         // 3. Make assetions capturing your expected outcomes.
             // the countdowntosting should now be at 39.
         assertEquals(39, ant.getCountdownToSting());
     }
     
     /**
      * tests the setcountdowntosting method
      */
     public void testSetCountdownToSting()
     {
         // 1. Set up initial conditions
         Ant ant = new Ant(10, 0);
         // 2. Call the method(s) being tested.
         ant.setCountdownToSting(6);
         // 3. Make assetions capturing your expected outcomes.
             // the countdowntosting should now be at 39.
         assertEquals(6, ant.getCountdownToSting());
     }
         
 }
