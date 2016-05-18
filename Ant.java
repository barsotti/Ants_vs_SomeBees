 import sofia.micro.*;
 
 //-------------------------------------------------------------------------
 /**
  *  The ant is the parent class of all the other ants.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (20116.03.29)
  */
 public class Ant extends Actor
 {
     //~ Fields ................................................................
     /**
      * the cost represents the cost of using this actor
      */
     int cost;
     /**
      * the health represents how many times the class can be stung.
      */
     int health;
     /**
      * the conuntdownToSting represents how many more turns until the
      * actor gets stung
      */
     int countdownToSting;

     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new Ant object.
      * @param health    the health of the actor
      * @param cost      the cost of the actor
      */
     public Ant(int health, int cost)
     {
         this.health = health;
         this.cost = cost;
         countdownToSting = 40;
     }
     
     /**
      * typecasts the colony.
      * @return Colony.
      */
     public Colony getWorld()
     {
         return (Colony)super.getWorld();
     }

     //~ Methods ...............................................................
     /**
      * removes the actor when it's health reaches 0.
      */    
     public void dieAway()
     {
         if (health <= 0)
         {
             this.remove();
         }
     }
     
     /**
      * returns the cost of the unit.
      * @return cost
      */
     public int getFoodCost()
     {
         return this.cost;
     }
     
     /**
      * returns the health.
      * @return health
      */
     public int getHealth()
     {
         return this.health;
     }
     
     /**
      * if the ant is touching a bee for 40 turns, it gets stung.
      */
     public void getStung()
     {
         Actor bee = getOneIntersectingObject(Bee.class);
         if (bee != null)
         {
             countdownToSting = countdownToSting - 1;
             if (countdownToSting <= 0)
             {
                 this.injure(1);
                 countdownToSting = 40;
             }
         }
     }
     
     /**
      * injures the ant
      * @param n     the amount that health will fall.
      */
     public void injure(int n)
     {
         health = health - n;
     }
     
     /**
      * returns the countdown
      * @return countdowntosting
      */
     public int getCountdownToSting()
     {
         return countdownToSting;
     }
     
     /**
      * sets the health
      * @param g the health of the actor.
      */
     public void setHealth(int g)
     {
         health = g;
     }
     
     /**
      * sets the countdown
      * @param i the countdown.
      */
     public void setCountdownToSting(int i)
     {
         countdownToSting = i;
     }
 }
