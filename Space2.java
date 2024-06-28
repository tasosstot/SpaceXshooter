import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space2 extends World
{
    HealthBar healthbar2 = new HealthBar();
    boolean bossLevel = false;
    boolean rockLevel = false;
    public Space2(Rocket rocket)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 650, 1); 
        prepare(rocket);
    }
    
    public HealthBar getHealthBar()
    {
        return healthbar2;
    }
    
    public void act()
    {        
         addRedFire();    
         addRock();
         Boss();
    }
    
    public void Boss()
    {
     
        Rocket rocket = getObjects(Rocket.class).get(0);
     
        if (rocket.getCounter().getScore() == 110 || rocket.getCounter().getScore() == 111 || rocket.getCounter().getScore() == 112)
        {
            if (bossLevel == false)
            {
                addObject(new Boss(), 300, 0);
                //addObject(new Boss(), 100, 0);
                bossLevel = true;
                Greenfoot.playSound("boss.wav");
            }
            
        }
        
        if (rocket.getCounter().getScore() == 160 || rocket.getCounter().getScore() == 161)
        {

                if (rockLevel == false)
                {
                addObject(new Rock(), 100, 0);
                addObject(new Rock(), 100, 0);
                addObject(new Rock(), 100, 0);
                rockLevel = true;
                //Greenfoot.playSound("boss.wav");       
                }
        }

    }
    
    
   
    public void addRedFire()
    {
         if(Greenfoot.getRandomNumber(9)<2)
           {
            // check 1st 22:00
            addObject(new RedFire(), Greenfoot.getRandomNumber(400),  0);
           }    
    }
    
        public void addRock()
    {
         if(Greenfoot.getRandomNumber(65)<2)
        {
           // check 1st 22:00
           addObject(new Rock(), Greenfoot.getRandomNumber(400),  0);
        } 
    }

    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(Rocket rocket)
    {
        HealthBar healthBar2 = new HealthBar();
        addObject(rocket, 189, 600);
        addObject(healthbar2,50,20);
        addObject(getObjects(Rocket.class).get(0).getCounter(),109,55);
        healthBar2.setLocation(49,90);
    }
}
