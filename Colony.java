 
 //-------------------------------------------------------------------------
 /**
  *  The colony is the world that the
  *  game willl be played in.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.30)
  */
 public class Colony extends HomeBase
 {
     //~ Fields ................................................................
     /**
      * the amount of food the colony has.
      */
     int food;
 
     //~ Constructor ...........................................................
     /**
      * Creates a new Colony object.
      * @param worldWidth    The width of the world
      * @param worldHeight   The height of the world
      * @param cellSize      The cellSize of the world.
      */
     public Colony(int worldWidth, int worldHeight, int cellSize)
     {
         worldWidth = 10;
         worldHeight = 6;
         cellSize = 80;
     }
     
     // ----------------------------------------------------------
     /**
      * Creates a new Colony object.
      */
     public Colony()
     {
         super();
         // Add the queen's chamber and hive to the world here
         QueensChamber chamber = new QueensChamber();
         Hive hive = new Hive();
         this.add(chamber, 0, 3);
         this.add(hive, 9, 3);
         food = 10;
         // Lay out the ant choices the player can click on in the
         // method call commented out below.  As you add ants, you
         // can add them to this list, so you have a playable
         // version of your game to try out, no matter how much
         // you have left to finish.
         setActorChoices(
              HarvesterAnt.class,
              ThrowerAnt.class,
              WallAnt.class,
              FireAnt.class,
              HungryAnt.class);
     }
 
 
     //~ Methods ...............................................................
     /**
      * decides who wins.
      */
     public void act()
     {
         super.act();
         this.antsWin();
         this.beesWin();
     }
     
     /**
      * calls win when the ants win.
      */
     public void antsWin()
     {
         Hive hive = getOneObjectAt(9, 3, Hive.class);
         if (hive.getBees() <= 0 && getObjects(Bee.class).size() <= 0)
         {
             this.win();
         }
     }
     
     
     /**
      * calls lose when the bees win.
      */
     public void beesWin()
     {
         QueensChamber chamber = getOneObjectAt(0, 3, QueensChamber.class);
         if (chamber.getOneIntersectingObject(Bee.class) != null)
         {
             this.lose();
         }
     }
     // ----------------------------------------------------------
     /**
      * Add an ant to the screen when a specific location is clicked.
      * This method is automatically called while the simulation is
      * running, whenever the user clicks on (or taps on) a location
      * in the colony (one that isn't covered by an actor already).
      * 
      * @param x The x-coordinate of the click
      * @param y The y-coordinate of the click
      */
     public void onTouchDown(int x, int y)
     {
         Ant selectedAnt = ((Ant) newActorOfSelectedType());                
         int foodCost = selectedAnt.getFoodCost();
         if (food >= foodCost)
         {
             if ((x >= 1 && x <= 8) && (y >= 1 && y <= 5))
             {
                 this.add(selectedAnt, x, y);
             }
             this.consumeFood(foodCost);
         }
     }
     
     /**
      * returns the amount of food the colony has
      * @return food  the food.
      */
     public int getFood()
     {
         return food;
     }
     
     /**
      * adds food to the colony
      * @param n  the amount of food to be added.
      */
     public void addFood(int n)
     {
         food = food + n;
     }
 
     /**
      * consumes food
      * @param foodCost   the cost of the actor.
      */
     public void consumeFood(int foodCost)
     {
         food = food - foodCost;
     }
     
 }
