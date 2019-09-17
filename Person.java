import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int [] RandomObject = new int [3];
    
    public void act() 
    {
        int x = this.getX();
        int y = this.getY();
        
        if (Greenfoot.isKeyDown("w")){
            setLocation(x, y - 4);
        
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(x, y + 4);
        
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(x +4, y);
        
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(x - 4, y);
        
        }
        if (getY()<600)
            setLocation(getX(), 600);
    }
    
}
