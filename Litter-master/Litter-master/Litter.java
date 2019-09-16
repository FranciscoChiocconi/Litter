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
    
    public void gameSetup() {
        int [][] randomLitter = new int [15][3];
        for (int i=0;i<randomLitter.length;i++) {
            int classification = (int)(Math.random()*3 + 1);
            if (classification == 1) {
                int picture = (int)(Math.random()*9 + 1);
            }
            else if (classification == 2) {
                int picture = (int)(Math.random()*9 + 1);
            }
            
        }
        
    }
    
    
    
    public void act() 
    {
        int i = (int)(Math.random()*3 + 1);
        
        if(i == 1){
            
        }
    }
}
