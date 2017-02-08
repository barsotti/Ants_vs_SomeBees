 // -------------------------------------------------------------------------
 /**
  *  The ThrowerAntTest class tests the ThrowerAnt class.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class ThrowerAntTest extends TestCase
 {
     //~ Fields ................................................................
 
 
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new ThrowerAntTest test object.
      */
     public ThrowerAntTest()
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
      * tests act
      */
     public void testAct()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         ant.setThrowTimer(120);
         // 2. Call the method(s) being tested.
         ant.act();
         // 3. Make assetions capturing your expected outcomes.
             // There should be a leaf on the island so check.
         assertEquals(1, colony.getObjects(Leaf.class).size());
             // The throw timer should be 0
         assertEquals(1, ant.getThrowTimer());
     }
     
     /**
      * tests the timing of act
      */
     public void testActTiming()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         run(colony, 240);
         // 3. Make assetions capturing your expected outcomes.
             // There should be a leaf on the island so check.
         assertEquals(2, colony.getObjects(Leaf.class).size());
     }
     
     /**
      * tests act when the throwtimer is not 120.
      */
     public void testActlessthan120()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         ant.setThrowTimer(100);
         // 2. Call the method(s) being tested.
         ant.act();
         // 3. Make assetions capturing your expected outcomes.
             // There throw timer should be 101.
         assertEquals(101, ant.getThrowTimer());
     }
     
     /**
      * tests shoot
      */
     public void testShoot()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         ant.setThrowTimer(120);
         // 2. Call the method(s) being tested.
         ant.shoot();
         // 3. Make assetions capturing your expected outcomes.
             // There should be a leaf on the island so check.
         assertEquals(1, colony.getObjects(Leaf.class).size());
     }
     
     /**
      * tests getthrow timer
      */
     public void testGetThrowTimer()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         ant.setThrowTimer(19);
         // 2. Call the method(s) being tested.
         ant.getThrowTimer();
         // 3. Make assetions capturing your expected outcomes.
             // The throw timer should return the number 19.
         assertEquals(19, ant.getThrowTimer());
     }
     
     
     /**
      * tests setthrowtimer
      */
     public void testSetThrowTimer()
     {
         // 1. Set up initial conditions
         ThrowerAnt ant = new ThrowerAnt();
         Colony colony = new Colony(); 
         colony.add(ant, 3, 3);
         // 2. Call the method(s) being tested.
         ant.setThrowTimer(3);
         // 3. Make assetions capturing your expected outcomes.
             // The throw timer should return the number 3.
         assertEquals(3, ant.getThrowTimer());
     }
 }
