 
 // -------------------------------------------------------------------------
 /**
  *  The HiveTest class tests the Hive class..
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class HiveTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new HiveTest test object.
      */
     public HiveTest()
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
         Hive hive = new Hive();      
         Colony colony = new Colony();
         colony.add(hive, 9, 3);
         hive.setBees(1);
         hive.setCounter(400);
         // 2. Call the method(s) being tested.
         hive.act();
         // 3. Make assetions capturing your expected outcomes.
             // The counter should now be 401.
         assertEquals(401, hive.getCounter());
             // 1 bee should have been spawned.
         assertEquals(1, colony.getObjects(Bee.class).size());
     }
     
     /**
      * tests the act method without bees
      */
     public void testActWithoutBees()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         Colony colony = new Colony();
         colony.add(hive, 9, 3);
         hive.setBees(0);
         // 2. Call the method(s) being tested.
         hive.act();
         // 3. Make assetions capturing your expected outcomes.
             // 1 bee should have been spawned.
         assertEquals(0, colony.getObjects(Bee.class).size());
     }
     
     /**
      * tests the spawnfirst bee method
      */
     public void testSpawnFirstBee()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         Colony colony = new Colony(); 
         colony.add(hive, 9, 3);
         hive.setCounter(400);
         // 2. Call the method(s) being tested.
         hive.spawnFirstBee();
         // 3. Make assetions capturing your expected outcomes.
             // 1 bee should have been spawned.
         assertEquals(1, colony.getObjects(Bee.class).size());
     }
     
     /**
      * tests the spawnNextwave method
      */
     public void testSpawnNextWave()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         Colony colony = new Colony();
         colony.add(hive, 9, 3);
         hive.setCounter(401);
         hive.setTimer(5);
         hive.setDelay(1);
         // 2. Call the method(s) being tested.
         hive.spawnNextWave();
         // 3. Make assetions capturing your expected outcomes.
             // The timer should now be 0.
         assertEquals(0, hive.getTimer());
             // 1 bee should have been spawned.
         assertEquals(1, colony.getObjects(Bee.class).size());
         // after resetting the timer and running the method again,
         hive.setTimer(0);
         hive.spawnNextWave();
             // the timer should now be 1.
         assertEquals(1, hive.getTimer());
     }
     
     /**
      * tests the spawnbee method
      */
     public void testSpawnBee()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         Colony colony = new Colony();
         colony.add(hive, 9, 3);
         hive.setLocation(1);
         // 2. Call the method(s) being tested.
         hive.spawnBee();
         // 3. Make assetions capturing your expected outcomes.
             // There should now be 1 bee.
         assertEquals(1, colony.getObjects(Bee.class).size());
             // the bee should be at (9, 2) so check that spot.
         assertEquals(1, colony.getObjectsAt(9, 2, Bee.class).size());
     }
     
     /**
      * tests the getBees method
      */
     public void testGetBees()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         // 2. Call the method(s) being tested.
         hive.getBees();
         // 3. Make assetions capturing your expected outcomes.
             // there should be 30 bees left.
         assertEquals(30, hive.getBees());
     }
     
     /**
      * tests the setBees method
      */
     public void testSetBees()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         // 2. Call the method(s) being tested.
         hive.setBees(5);
         // 3. Make assetions capturing your expected outcomes.
             // there should be 5 bees left.
         assertEquals(5, hive.getBees());
     }
     
     /**
      * tests the getDelay method
      */
     public void testGetDelay()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive(); 
         hive.setDelay(99);
         // 2. Call the method(s) being tested.
         hive.getDelay();
         // 3. Make assetions capturing your expected outcomes.
             // the delay should be 99.
         assertEquals(99, hive.getDelay());
     }
     
     /**
      * tests the setDelay method
      */
     public void testSetDelay()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         // 2. Call the method(s) being tested.
         hive.setDelay(69);
         // 3. Make assetions capturing your expected outcomes.
             // the delay should be 69.
         assertEquals(69, hive.getDelay());
     }
     
     /**
      * tests the gettimer method
      */
     public void testGetTimer()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();
         hive.setTimer(8);
         // 2. Call the method(s) being tested.
         hive.getTimer();
         // 3. Make assetions capturing your expected outcomes.
             // the timer should be 8.
         assertEquals(8, hive.getTimer());
     }
     
     /**
      * tests the settimer method
      */
     public void testSetTimer()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         // 2. Call the method(s) being tested.
         hive.setTimer(69);
         // 3. Make assetions capturing your expected outcomes.
             // the timer should be 69.
         assertEquals(69, hive.getTimer());
     }
     
     /**
      * tests the getCounter method
      */
     public void testGetCounter()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();
         hive.setCounter(8);
         // 2. Call the method(s) being tested.
         hive.getCounter();
         // 3. Make assetions capturing your expected outcomes.
             // the counter should be 8.
         assertEquals(8, hive.getCounter());
     }
     
     /**
      * setCounter method
      */
     public void testSetCounter()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();      
         // 2. Call the method(s) being tested.
         hive.setCounter(34);
         // 3. Make assetions capturing your expected outcomes.
             // the counter should be 34.
         assertEquals(34, hive.getCounter());
     }
     
     /**
      * tests the getLocation method
      */
     public void testGetLocation()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();
         hive.setLocation(2);
         // 2. Call the method(s) being tested.
         hive.getLocation();
         // 3. Make assetions capturing your expected outcomes.
             // the location should be 2.
         assertEquals(2, hive.getLocation());
     }
     
     /**
      * tests the setLocation method
      */
     public void testSetLocation()
     {
         // 1. Set up initial conditions
         Hive hive = new Hive();
         // 2. Call the method(s) being tested.
         hive.setLocation(2);
         // 3. Make assetions capturing your expected outcomes.
             // the location should be 2.
         assertEquals(2, hive.getLocation());
     }
 }
