 // -------------------------------------------------------------------------
 /**
  *  Tests the harveter ant class and it's methods.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.30)
  */
 public class HarvesterAntTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new HarvesterAntTest test object.
      */
     public HarvesterAntTest()
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
         HarvesterAnt ant = new HarvesterAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.act();
         // 3. Make assetions capturing your expected outcomes.
             // the timer should now be at 1.
         assertEquals(1, ant.getTimer());
         ant.setTimer(39);
         ant.act();
             // the colony should now have 11 food
         assertEquals(11, colony.getFood());
     }
     
     /**
      * tests if food is added correctly.
      */
     public void testActTiming()
     {
         // 1. Set up initial conditions
         HarvesterAnt ant = new HarvesterAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         // 3. Make assetions capturing your expected outcomes.
         run(colony, 80);
             // the colony should now have 11 food
         assertEquals(12, colony.getFood());
     }
     
     /**
      * tests the harvest method
      */
     public void testHarvest()
     {
         // 1. Set up initial conditions
         HarvesterAnt ant = new HarvesterAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         ant.setTimer(39);
         // 2. Call the method(s) being tested.
         ant.harvest();
         // 3. Make assetions capturing your expected outcomes.
             // the timer should now be at 0.
         assertEquals(0, ant.getTimer());
             // the colony should now have 11 food
         assertEquals(11, colony.getFood());
     }
     
     /**
      * tests the gettimer method
      */
     public void testGetTimer()
     {
         // 1. Set up initial conditions
         HarvesterAnt ant = new HarvesterAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.getTimer();
         // 3. Make assetions capturing your expected outcomes.
             // the timer should now be at 0.
         assertEquals(0, ant.getTimer());
     }
     
     /**
      * tests the settimer method
      */
     public void testSetTimer()
     {
         // 1. Set up initial conditions
         HarvesterAnt ant = new HarvesterAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.setTimer(5900);
         // 3. Make assetions capturing your expected outcomes.
             // the timer should now be at 5900.
         assertEquals(5900, ant.getTimer());
     }
 }
