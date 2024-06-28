import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
    boolean letFire = true;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int level;
    Counter counter = new Counter();
    HealthBar health = new HealthBar();
    
    
    
    public Rocket()
    {
        level = 1;
        image1 = new GreenfootImage("withLight-removebg-preview.png");
        image2 = new GreenfootImage("withoutLight-removebg-preview.png");
        setImage(image1);
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public void checkNextLevel()
        {
        if (level == 1 && (counter.getScore() > 100 ||counter.getScore() == 102) )
        {
            //Greenfoot.stop();     
            level = 2;
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Space2(this));
        }
        else if (level==2 && (counter.getScore()>200))
        {
            //Greenfoot.playSound("fanfare.wav");
            level = 3;
            Greenfoot.setWorld(new Space3(this));        
        }
        else if (level==3 && (counter.getScore()>351))
        {
            
            
            Greenfoot.stop();           
        }
    }
    
    public void switchImage()
    {
        if ( getImage() == image1 )
            setImage(image2);
        else
            setImage(image1);
    }
    

    
    public void act() 
    {
        moveLeftAndRight();
        rocketFire();
        switchImage();
        checkNextLevel();
        
    }  
    
    public void moveLeftAndRight()
    {   
        if(Greenfoot.isKeyDown("right"))
        {
            if(level == 1)
                {
                    setLocation(getX() +25, getY());
                }
            else if(level == 2 || level == 3){
                setLocation(getX() +25, getY());
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if(level == 1)
            {
            setLocation(getX() -25, getY());
            }
            else if (level == 2 || level ==3)
            {
                setLocation(getX() -25, getY());
            }
        }

    }
    
    public void rocketFire()
    {
        if(Greenfoot.isKeyDown("space") && letFire == true)
        {
            getWorld().addObject(new Fire(), getX(), getY()-30);
            letFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            letFire = true;
        }
    }
    
     
}
