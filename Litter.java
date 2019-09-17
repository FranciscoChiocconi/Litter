import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Litter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Litter extends Actor
{
    /**
     * Act - do whatever the Litter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int [][] randomLitter = new int [15][2];
    private static boolean setup = true;
    private String [] trash = {"blah.png","blah2.jpg"};
    private String [] recycle = {"blah.png","blah2.jpg"};
    private String [] compost = {"blah.png","blah2.jpg"};
    private int classification, type;
    private static int iteration = 0;
    
    public void gameSetup() {
        for (int i=0;i<randomLitter.length;i++) {
            int imagesNumber = 9;
            int classification = (int)(Math.random()*3 + 1);
            if (classification == 1) {
                int picture = (int)(Math.random()*imagesNumber + 1);
                randomLitter[i][0] = 1;
                randomLitter[i][1] = picture;
            }
            else if (classification == 2) {
                int picture = (int)(Math.random()*imagesNumber + 1);
                randomLitter[i][0] = 2;
                randomLitter[i][1] = picture;
            }
            else if (classification == 3){
                int picture = (int)(Math.random()*imagesNumber + 1);
                randomLitter[i][0] = 3;
                randomLitter[i][1] = picture;
            }
        }
        setup = false;
    }
    
    public int[][] getLitter() {
        return randomLitter;
    }
    
    public Litter() {
        classification = randomLitter[iteration][0];
        type = randomLitter[iteration][1];
        iteration++;
        if (classification == 1) 
            setImage(trash[type]);
        else if (classification == 2)
            setImage(recycle[type]);
        else if (classification == 3)
            setImage(compost[type]);
    }
    
    public void act() 
    {
        if (setup){
            gameSetup();
        }
    }
}
