import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    
    public void moveRedFire()
    {
        setLocation(getX(), getY() +13);
    }
    
        public void moveRock()
    {
        setLocation(getX(), getY() +9);
    }
    
    
        public void moveBoss()
    {
        setLocation(getX(), getY() +5);
    }
    
    


}
