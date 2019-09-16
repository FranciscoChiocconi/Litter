import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        Person person = new Person(); //creates spongebob character
        addObject(person, 200, 300);//location of where spongebob spawns
    }
}
