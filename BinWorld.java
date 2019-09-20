import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinWorld extends World
{

    /**
     * Constructor for objects of class BinWorld.
     * 
     */
    public BinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); // makes the size of the world 800 by 600
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg); 
        
    }
}
