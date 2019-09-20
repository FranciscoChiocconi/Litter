import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WaterWorld extends World
{

    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        super(800, 600, 1); // makes the size of the world 800 by 600
        Sbob sbob = new Sbob(); //creates spongebob character
        addObject(sbob, 328, 537);//location of where spongebob spawns
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        PirateGold g = new PirateGold();//variable for pirate gold
        addObject(g, (int)(Math.random()*100 +1), 460);
        CrabTrap t = new CrabTrap();//variable for crab trap
        addObject(t, (int)(Math.random()*200)+100,400);//randomizes location of crab traps
        Glass l = new Glass();//variable for crab trap
        addObject(l, (int)(Math.random()*300)+200, 420);
        cardboard c = new cardboard();//variable for crab trap
        addObject(c, (int)(Math.random()*400)+300, 440);
        Banana b = new Banana();//variable for crab trap
        addObject(b, (int)(Math.random()*300)+500, 480);
        Paper p = new Paper();//variable for crab trap
        addObject(p, (int)(Math.random()*500)+400, 480);
        Compost compost = new Compost(); //creates spongebob character
        addObject(compost, 300, 300);//location of where spongebob spawns
        Recycling recycle = new Recycling(); //creates spongebob character
        addObject(recycle, 400, 300);//location of where spongebob spawns
        Trash trash = new Trash(); //creates spongebob character
        addObject(trash, 500, 300);
    }

    public void act()
    {
        
    }

    private void prepare()
    {
    }
}
