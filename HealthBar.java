import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPerPoint = (int)healthBarWidth/health;
    public HealthBar()
    {
        update();
    }
    public void act() 
    {
        update();
        youLose();
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth +2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth +1, healthBarHeight +1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1, health*pixelsPerHealthPerPoint, healthBarHeight);
    }
    public void loseHealth()
    {
        health-- ;
        }
    public void loseHealthRock()
    {
        health = health - 2 ;
    }
    
    public void loseHealthBoss2()
     {
        health = health - 10 ;
    }
    
    public void loseHealthBoss()
    {
        health = health - 7 ;
    }
    public void youLose()
    {
        if(health < 0)
        {
            getWorld().addObject(new YouLose(),200, 200);
            Greenfoot.stop();
            Greenfoot.playSound("lose_game.wav");
        }
    }
}
