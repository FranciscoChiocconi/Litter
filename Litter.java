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
    
    private int classification, type;
    private String objImg;
    private String [] trash = {"glass.png", "tire.png" };
    private String [] recycle = {"waterbottle.png","cardboard.jpg", "paper.png"};
    private String [] compost = {"banana.jpg","pizza.png"};
    
    public Litter(int c, int t) {
        classification = c;
        type = t;
        if (classification == 1){
            objImg = trash[type];
        }
        else if (classification == 2) {        
            objImg = recycle[type];
        }
        else if (classification == 3) {
            objImg = compost[type];  
        }
        setImage(objImg);
    }
    

}
