import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int [][] randomLitter = new int [30][2];    
    int objNum = 0;
    
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
        for (int i=0;i<randomLitter.length;i++) {
            int imagesNumber = 2;
            int classification = (int)(Math.random()*3 + 1);
            if (classification == 1) {
                int picture = (int)(Math.random()*imagesNumber);
                randomLitter[i][0] = 1;
                randomLitter[i][1] = picture;
            }
            else if (classification == 2) {
                int picture = (int)(Math.random()*imagesNumber);
                randomLitter[i][0] = 2;
                randomLitter[i][1] = picture;
            }
            else if (classification == 3){
                int picture = (int)(Math.random()*imagesNumber);
                randomLitter[i][0] = 3;
                randomLitter[i][1] = picture;
            }            
        }       
    }
    
    public void spawnLitter() {
        Litter litter = new Litter(randomLitter[objNum][0], randomLitter[objNum][1]);
        addObject(litter, Greenfoot.getRandomNumber(getWidth() - 100), 10);
    }
    
    public void act() {
        if (objNum < randomLitter.length) {
            if (Greenfoot.getRandomNumber(120) == 5 || Greenfoot.getRandomNumber(120) == 10) {
            spawnLitter();
            objNum++;
            }
        }
        else {
            sortWorld sortTime = new sortWorld();
            Greenfoot.setWorld(sortTime);
        }
            
    }
    
}
