 // -------------------------------------------------------------------------
 /**
  *  Tests the colony world.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.30)
  *  
  */
 
 public class ColonyTest extends TestCase
 {
     //~ Fields ................................................................
     /**
      * the x coord
      */
     float x;
     
     /**
      * the y coord
      */
     float y;
     
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new ColonyTest test object.
      */
     public ColonyTest()
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
      * tests the constructor of the colony
      */
     public void testColonyConstructor()
     {
         // 1. Set up initial conditions
         Colony colony = new Colony(10, 6, 80); 
         // 2. Make assetions capturing your expected outcomes.
             // the colony should be 10 cells high.
         assertEquals(6, colony.getHeight());
             // the colony should be 10 cells wide.
         assertEquals(10, colony.getWidth());
     }
     
     /**
      * tests act
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(bee, 0, 3);
         // 2. Call the method(s) being tested.
         colony.act();
         // 3. Make assetions capturing your expected outcomes.
             // the countdowntosting should now be at 39.
         assertTrue(colony.isGameOver());
     }
 
     /**
      * tests the ants win method.
      */
     public void testAntsWin()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         Hive hive =  colony.getObjects(Hive.class).get(0);
         colony.add(hive, 9, 3);
         hive.setBees(0);
         // 2. Call the method(s) being tested.
         colony.antsWin();
         // 3. Make assetions capturing your expected outcomes.
             // The game should be won.
         assertTrue(colony.isGameWon());
     }
     
     /**
      * tests if win doesn't call when it's not supposed to.
      */
     public void testAntsWinRight()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         Hive hive =  colony.getObjects(Hive.class).get(0);
         colony.add(hive, 9, 3);
         hive.setBees(10);
         // 2. Call the method(s) being tested.
         colony.antsWin();
         // 3. Make assetions capturing your expected outcomes.
             // The game should be won.
         assertFalse(colony.isGameWon());
     }
     
     /**
      * tests the beeswin method
      */
     public void testBeesWin()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         Bee bee = new Bee();
         colony.add(bee, 0, 3);
         //colony.add(chamber, 0, 3);
         // 2. Call the method(s) being tested.
         colony.beesWin();
         // 3. Make assetions capturing your expected outcomes.
             // the game should not be won.
         assertFalse(colony.isGameWon());
             // the game should be over.
         assertTrue(colony.isGameOver());
     }
     
     /**
      * tests the onTouchDown method
      */
     public void testOnTouchDown()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         colony.setSelectedActor(HarvesterAnt.class);
         // 2. Call the method(s) being tested.
         colony.onTouchDown(2, 2);
         // 3. Make assetions capturing your expected outcomes.
             // 8 food shuould be left.
         assertEquals(8, colony.getFood());
             // there should be a harvester ant at (2, 2) so check that location.
         assertEquals(1, colony.getObjectsAt(2, 2, HarvesterAnt.class).size());
     }
     
     /**
      * tests the ontouchdown when there is not enough food
      */
     public void testOnTouchDownWithoutEnoughFood()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         colony.setSelectedActor(HarvesterAnt.class);
         colony.addFood(-10);
         // 2. Call the method(s) being tested.
         colony.onTouchDown(2, 2);
         // 3. Make assetions capturing your expected outcomes.
             // There should not have been an an added
         assertEquals(0, colony.getObjectsAt(2, 2, HarvesterAnt.class).size());
     }
     
     /**
      * tests the ontouchdownmethod when the actor is placed out of bounds
      */
     public void testOnTouchDownOutOfBounds()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         colony.setSelectedActor(HarvesterAnt.class);
         // 2. Call the method(s) being tested.
         colony.onTouchDown(10, 10);
         // 3. Make assetions capturing your expected outcomes.
             // There should not have been an an added
         assertEquals(0, colony.getObjects(HarvesterAnt.class).size());
     }
     
     /**
      * tests the get food method
      */
     public void testGetFood()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         // 2. Call the method(s) being tested.
         colony.getFood();
         // 3. Make assetions capturing your expected outcomes.
             // 10 food shuould be returned.
         assertEquals(10, colony.getFood());
     }
     
     /**
      * tests the addFood method
      */
     public void testAddFood()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         // 2. Call the method(s) being tested.
         colony.addFood(101);
         // 3. Make assetions capturing your expected outcomes.
             // 111 food shuould be returned.
         assertEquals(111, colony.getFood());
     }
     
     /**
      * tests the consumefood method
      */
     public void testConsumeFood()
     {
         // 1. Set up initial conditions        
         Colony colony = new Colony();
         // 2. Call the method(s) being tested.
         colony.consumeFood(9);
         // 3. Make assetions capturing your expected outcomes.
             // 1 food shuould be returned.
         assertEquals(1, colony.getFood());
     }
 }
