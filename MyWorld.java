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
        initialize();
    }
    
    public void initialize() {
        Person person = new Person();
        addObject(person, 200, 750);
    }
    
    public void spawnLitter() {
        Litter litter = new Litter();
        addObject(litter, Greenfoot.getRandomNumber(getWidth() - 100), 500);
    }
    
    public void act() {
        for (int i = 0; i < Litter.getLitter().length; i++) {
            spawnLitter();
        }
        System.out.println(Litter.getLitter().length);
    
    }
}
