 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fireShot();
        removeFromWorld();        
    }
    
    public void fireShot()
    {
        setLocation(getX(), getY() - 19);
        
    }
    
    public void removeFromWorld()
    {        
        if(getY() == 0)
         {
             getWorld().removeObject(this);
         }
    }   
}
