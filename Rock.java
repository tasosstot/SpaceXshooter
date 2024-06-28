import greenfoot.*;  


public class Rock extends Enemies
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int times = 2;
    

    public void act() 
    {
        
        moveRock();
        hitByFire();
        
    }   
    public void hitByFire()
    {
        Actor tasos = getOneIntersectingObject(Fire.class);
        if (tasos != null)
        {   
            getWorld().removeObject(tasos);
            times--;
           // Greenfoot.playSound("lose_life.wav");
        }
        if (times == 0) 
        {
            Rocket rocket = getWorld().getObjects(Rocket.class).get(0);  
            getWorld().removeObject(this);
            rocket.getCounter().addScoreRock();
        }
        else if(getY() == 649)
        {
            HealthBar health = getWorld().getObjects(HealthBar.class).get(0);
            health.loseHealthRock();
            getWorld().removeObject(this);
            Greenfoot.playSound("lose_life.wav");
           
        }
    }

}
