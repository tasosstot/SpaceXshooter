
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemies
{
    int timesHit = 10;
    public Boss()
    {
        setRotation(90);
    }
    public void act() 
    {
        moveBoss();
        hitPro();
    }
    public void hitPro()
    {
    Actor act = getOneIntersectingObject(Fire.class);
        if (act != null)
        {   
            getWorld().removeObject(act);
            timesHit--;
        }
        else if (timesHit == 0) 
        {
            Rocket rocket = getWorld().getObjects(Rocket.class).get(0);  
            //rocket.getCounter().addBoss();
            getWorld().removeObject(this);
            
        }
        
        else if(getY() == 649)
        {
            HealthBar health = getWorld().getObjects(HealthBar.class).get(0);
            health.loseHealthBoss();
            Greenfoot.playSound("lose_life.wav");
            getWorld().removeObject(this);
        }
    }
}
