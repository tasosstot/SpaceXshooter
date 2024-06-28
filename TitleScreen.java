import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    
        
    
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //image12 = new GreenfootImage("withLight-removebg-preview.png");
        //setImage(image12);
        Greenfoot.playSound("intro.wav"); 
        Greenfoot.start();
        prepare();
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new Space());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
