import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    HealthBar healthbar = new HealthBar();

    
    public Space()  
    {    
        
        super(400, 650, 1); 
       
        prepare();
    }
    

    
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
    
    public void act()
    {        
         addRedFire();    
         addRock();

    }
    

   
    public void addRedFire()
    {
         if(Greenfoot.getRandomNumber(12)<2)
        {
            // check 1st 22:00
            addObject(new RedFire(), Greenfoot.getRandomNumber(400),  0);
            
        }    
    }
    
        public void addRock()
    {
         if(Greenfoot.getRandomNumber(70)<2)
        {
           // check 1st 22:00
           addObject(new Rock(), Greenfoot.getRandomNumber(400),  0);
        } 
    }

    private void createStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for(int i=0; i < number; i++) 
        {
            int x = Greenfoot.getRandomNumber( getWidth());
            int y = Greenfoot.getRandomNumber( getHeight());
            int color = 120 - Greenfoot.getRandomNumber(100);
            background.setColor(new Color(color,color,color));
            background.fillOval(x, y, 2, 2);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(healthbar,50,20);
        Rocket rocket = new Rocket();
        
        addObject(rocket,189,600);
        //Counter counter = new Counter();
        HealthBar healthBar = new HealthBar();
        healthBar.setLocation(54,97);
        //counter.setLocation(44,21);
        removeObject(healthBar);
        healthBar.setLocation(49,90);
        //counter.setLocation(55,94);
        addObject(getObjects(Rocket.class).get(0).getCounter(),109,55);
        
}
}

