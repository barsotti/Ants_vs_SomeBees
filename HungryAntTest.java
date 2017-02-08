 // -------------------------------------------------------------------------
 /**
  *  The HungryAntTest class tests the HungryAnt class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class HungryAntTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new HungryAntTest test object.
      */
     public HungryAntTest()
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
      * tests eat
      */
     public void testEat()
     {
         // 1. Set up initial conditions
         HungryAnt ant = new HungryAnt();
         Bee bee = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 3, 3);
         // 2. Call the method(s) being tested.
         ant.eat();
         // 3. Make assetions capturing your expected outcomes.
             // the be should have been removed.
         assertEquals(0, colony.getObjects(Bee.class).size());
             // the timer should have been set to 0.
         assertEquals(0, ant.getTimer());
     }
     
     /**
      * tests act
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         HungryAnt ant = new HungryAnt();
         Bee bee = new Bee();
         Bee horseknuckle = new Bee();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         colony.add(bee, 4, 3);
         colony.add(horseknuckle, 5, 3);
         ant.setCountdownToSting(0);
         // 2. Call the method(s) being tested.
         run(colony, 150);
         // 3. Make assetions capturing your expected outcomes.
             // 1 bee should have been removed.
         assertEquals(1, colony.getObjects(Bee.class).size());
             // the ant should have been stung and removed
         assertEquals(0, colony.getObjects(HungryAnt.class).size());
     }
     
     /**
      * tests the get timer method
      */
     public void testGetTimer()
     {
         // 1. Set up initial conditions
         HungryAnt ant = new HungryAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.getTimer();
         // 3. Make assetions capturing your expected outcomes.
             // the timer should have be 240.
         assertEquals(240, ant.getTimer());
     }
     
     /**
      * tests the eat method when there is nothing to eat
      */
     public void testEatWithoutFood()
     {
         // 1. Set up initial conditions
         HungryAnt ant = new HungryAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.eat();
         // 3. Make assetions capturing your expected outcomes.
             // bee should have returned null
         assertEquals(null, ant.getOneIntersectingObject(Bee.class));
     }
     
 }
