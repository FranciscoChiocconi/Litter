import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Glass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PirateGold extends FallingObjects
{
    public void act(){
        if(Greenfoot.mouseClicked(this)){
                JOptionPane.showInputDialog("This is Landfill material!");
               World world;
               world = getWorld();
               world.removeObject(this);
               counting++;
               fall();
               return; 
               
        }
    }
}