import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedFire extends Enemies
{
    //Counter counter = new Counter();
    
    public void act() 
    {
        //moveEnemies();
        //removeEnemies();
        moveRedFire();
        hitByFire();

    }

    public void hitByFire()
    {
        Actor action = getOneIntersectingObject(Fire.class);
        if (action != null)
        {   
            getWorld().removeObject(action);
            Rocket rocket = getWorld().getObjects(Rocket.class).get(0);
            rocket.getCounter().addScore();
            getWorld().removeObject(this);
        }
        else if(getY() == 649)
        {
            HealthBar health = getWorld().getObjects(HealthBar.class).get(0);
            health.loseHealth();
            getWorld().removeObject(this);
            Greenfoot.playSound("lose_life.wav");
        }
    }
    

       
}

