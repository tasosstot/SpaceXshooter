import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int score = 0; 
    

    
    public Counter()
    {  
        setImage(new GreenfootImage("Πόντοι: " +score, 50, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        setImage(new GreenfootImage("Πόντοι: " +score, 50, Color.WHITE, Color.BLACK));
        YouWin();
    }  
    
    public void addScore()
    {
        score++;
    }
    
    public void addScoreRock()
    {
        score = score + 2;
    }
    
    public void addBoss()
    {
        score = score + 3;
    }
    
    public int getScore()
    {
        return score;
    }

    
    public void YouWin()
    {  
        if (score>=350 )
        {
            getWorld().addObject(new YouWin(), 200, 200);
            Greenfoot.playSound("win.wav");
            Greenfoot.stop();
        }
    }
}
