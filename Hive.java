 import sofia.util.*;
 
 //-------------------------------------------------------------------------
 /**
  *  The hive spawns bees in random y locations
  *  in random times.
  *
  *  @author Brandon Barsotti (barsotti)
  *  @version (2016.03.29)
  */
 public class Hive extends Actor
 {
     //~ Fields ................................................................
     /**
      * the counter is used for spawning first wave.
      */
     int counter;
     /**
      * the delay is randmoly set to spawn the second wave.
      */
     int delay;
     /**
      * the timer is used to decide when to spawn the second wave.
      */
     int timer;
     /**
      * the amount of bees left in the hive.
      */
     int bees;
     /**
      * the y location of where the bee will be spawned.
      */
     int location;
     //~ Constructor ...........................................................
 
     // ----------------------------------------------------------
     /**
      * Creates a new Hive object.
      */
     public Hive()
     {
         counter = 0;
         timer = 0;
         bees = 30;
         delay = Random.generator().nextInt(320) + 80;
         //location = Random.generator().nextInt(5) + 1;
     }
 
 
     //~ Methods ...............................................................
     /**
      * spawns bees
      */
     public void act()
     {
         if (bees > 0)
         {
             this.spawnFirstBee();
             this.spawnNextWave();
             counter = counter + 1;
         }
     }
     
     /**
      * spawns the first bee
      */
     public void spawnFirstBee()
     {     
         if (counter == 400)
         {
             spawnBee();
             delay = Random.generator().nextInt(320) + 80;
             location = Random.generator().nextInt(5);
         }
     }
     
     /**
      * spawns the 2nd 29 bees
      */
     public void spawnNextWave()
     {
         if (counter > 400)
         {
             if (timer >= delay + 1)
             {
                 this.spawnBee();
                 timer = 0;
                 delay = Random.generator().nextInt(320) + 80;
                 location = Random.generator().nextInt(5);
             }
             else
             {
                 timer = timer + 1;
             }
         }
     }
     
     /**
      * spawns a bee at location
      */
     public void spawnBee()
     {
         this.getWorld().add(new Bee(), 9, location + 1);
         bees = bees - 1;
     }
     
     /**
      * returns the number of bees left
      * @return bees   the beesleft
      */
     public int getBees()
     {
         return bees;
     }
     
     /**
      * sets the number of bees left
      * @param u   the nuber of bees left
      */
     public void setBees(int u)
     {
         bees = u;
     }
     
     
     /**
      * return the delay
      * @return delay    the delay
      */
     public int getDelay()
     {
         return delay;
     }
     
     /**
      * sets the delay
      * @param j     the delay.
      */
     public void setDelay(int j)
     {
         delay = j;
     }
     
     /**
      * returns the timer
      * @return timer    the timer
      */
     public int getTimer()
     {
         return timer;
     }
     
     /**
      * sets the timer
      * @param y     the timer
      */
     public void setTimer(int y)
     {
         timer = y;
     }
     
     /**
      * returns the counter
      * @return counter    the counter
      */
     public int getCounter()
     {
         return counter;
     }
     
     /**
      * sets the counter
      * @param d   the counter
      */
     public void setCounter(int d)
     {
         counter = d;
     }
     
     /**
      * returns the location
      * @return location   the location
      */
     public int getLocation()
     {
         return location;
     }
     
     /**
      * sets the location
      * @param s     the location
      */
     public void setLocation(int s)
     {
         location = s;
     }
 }
