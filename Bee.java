 import static sofia.micro.jeroo.CompassDirection.*;     
 
 //-------------------------------------------------------------------------
 /**
  *  The Bee travels across the screen, trying to reach
  *  the queens hive.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class Bee extends Actor
 {
     //~ Fields ................................................................
     
     /**
      * the health of this actor
      */
     int health;
     /**
      * the speed of movement
      */
     double speed;
     //~ Constructor ...........................................................
    
     // ----------------------------------------------------------
     /**
      * Creates a new Bee object.
      */
     public Bee()
     {
         health = 3;
         this.turn(180);
         speed = 0.0125;
     }
     
     //~ Methods ...............................................................
     /**
      * called by pressing run
      */
     public void act()
     {
         this.getShot();
         this.moveIfClear();
         this.goToMeetThisOnesMaker();
     }
     
     /**
      * returns the health of the actor
      * @return health   the health
      */
     public int getHealth()
     {
         return health;
     }
     
     /**
      * gets the actor shot if it meets the restrictions.
      */
     public void getShot()
     {
         Actor leaf = getOneIntersectingObject(Leaf.class);
         if (leaf != null)
         {
             leaf.remove();
             health = health - 1;
         }
     }
     
     /**
      * lowers the actors health
      * @param q the amount of which health is lowered.
      */
     public void injure(int q)
     {
         health = health - q;
     }
     
     /**
      * moves the actor if it's not blocked by an ant.
      */
     public void moveIfClear()
     {
         Actor ant = getOneIntersectingObject(Ant.class);
         if (ant == null)
         {
             this.move(speed);
         }
     }
     
     /**
      * removes the actor if it's health reaches 0.
      */
     public void goToMeetThisOnesMaker()
     {
         if (health <= 0)
         {
             this.remove();
         }
     }
     
     /**
      * sets the health to e
      * @param e the health set.
      */
     public void setHealth(int e)
     {
         health = e;
     }
     
     /**
      * sets the speed to w
      * @param w the speed of the actor
      */
     public void setSpeed(double w)
     {
         speed = w;
     }
     
     /**
      * returns the speed of the actor
      * @return speed    the speed
      */
     public double getSpeed()
     {
         return speed;
     }
 }
