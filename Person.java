import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private int collected = 0;
    
    public void act() 
    {
        if (canCollect())
        {
            collect();
            collected = collected + 1;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 10, getY());
        } 
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 10, getY());
        }
            
    } 
    
    /**
     * This method checks if spongebob can catch a gold coin.
     */
    private boolean canCollect()
    {
        Actor litterObj = getOneObjectAtOffset(0, 0, Litter.class);
        if (litterObj != null)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
        
    /**
     * This method will play a sound and remove the gold coin if spongebob
     * touches a coin.
     */
    private void collect()
    {
        Actor litterObj = getOneObjectAtOffset(0, 0, Litter.class);
        if (litterObj != null) 
        {
            getWorld().removeObject(litterObj);
        }
    }
    
}
