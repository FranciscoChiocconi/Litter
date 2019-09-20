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
        Sbob sbob = new Sbob(); //creates spongebob character
        addObject(sbob, 328, 537);//location of where spongebob spawns
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg); 
        Compost compost = new Compost(); //creates spongebob character
        addObject(compost, 300, 300);//location of where spongebob spawns
        Recycling recycle = new Recycling(); //creates spongebob character
        addObject(recycle, 400, 300);//location of where spongebob spawns
        Trash trash = new Trash(); //creates spongebob character
        addObject(trash, 500, 300);//location of where spongebob spawns
    }
}
