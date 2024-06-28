import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space3 extends World
{

    HealthBar healthbar2 = new HealthBar();
    boolean bossLevel = false;
    boolean rockLevel = false;
    boolean bossLevelSpace2 = false;
    public Space3(Rocket rocket)
    {   
        super(400, 650, 1); 
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
         BossSpace2();
    }
    
    public void BossSpace2()
    {
        Rocket rocket = getObjects(Rocket.class).get(0);
        if (rocket.getCounter().getScore() > 250)
        {
            if (bossLevelSpace2 == false)
            {
                addObject(new BossSpace2(), 300, 0);
                //addObject(new BossSpace2(), 200, 0);
                bossLevelSpace2 = true;
                Greenfoot.playSound("boss.wav");
            }
            
        }
        
        if (rocket.getCounter().getScore() == 260 || rocket.getCounter().getScore() == 261)
        {

                if (rockLevel == false)
                {
                //addObject(new Rock(), 100, 0);
                //rockLevel = true;
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
         if(Greenfoot.getRandomNumber(60)<2)
        {
           // check 1st 22:00
           addObject(new Rock(), Greenfoot.getRandomNumber(400),  0);
        } 
    }
    
    
    private void prepare(Rocket rocket)
    {
        HealthBar healthBar2 = new HealthBar();
        addObject(rocket, 189, 600);
        addObject(healthbar2,50,20);
        addObject(getObjects(Rocket.class).get(0).getCounter(),109,55);
        healthBar2.setLocation(49,90);
    }
}
