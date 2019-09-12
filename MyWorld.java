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
        GreenfootImage bg = new GreenfootImage("grass.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        Person person = new Person(); //creates spongebob character
        addObject(person, 200, 300);//location of where spongebob spawns
        Litter litter = new Litter();
        addObject(litter, 1, 40);
        int[][] setup = litter.getArray();
        
        for (int i = 0; i<setup.length; i++){
            System.out.println(setup[i][0] + "," + setup[i][1]);
        }
        
    }
}
