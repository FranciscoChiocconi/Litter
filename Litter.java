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
    public int [][] randomLitter = new int [15][2];
    public boolean setup = true;
    
    public void gameSetup() {
        if(Greenfoot.isKeyDown("f")){
            for (int i=0;i<randomLitter.length;i++) {
                int classification = (int)(Math.random()*3 + 1);
                if (classification == 1) {
                    int picture = (int)(Math.random()*9 + 1);
                    randomLitter[i][0] = 1;
                    randomLitter[i][1] = picture;
                }
                else if (classification == 2) {
                    int picture = (int)(Math.random()*9 + 1);
                    randomLitter[i][0] = 2;
                    randomLitter[i][1] = picture;
                }
                else if (classification == 3){
                    int picture = (int)(Math.random()*9 + 1);
                    randomLitter[i][0] = 3;
                    randomLitter[i][1] = picture;
                }
            }
        
        }
        setup = false;
    }
     public int[][] getArray() {
         return randomLitter;
        }
        

    
    public void act() 
    {
        if (setup){
            gameSetup();
        }
    }
}
