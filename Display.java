import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
    private String classification;
    
    public Display(String c, String img) {
        classification = c;
        setImage(img);
    }
    
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            JPanel panel = new JPanel();
            JTextField answer = new JTextField(25);
            panel.add(answer);
            JOptionPane.showMessageDialog(null, panel, "Compost, Recycle, Trash?", JOptionPane.QUESTION_MESSAGE);
            System.out.println("ANSWER: (" + answer.getText() + ")");
            if (answer.getText().toLowerCase().equals(classification)) {
               System.out.println("Correct Answer!");
               World world;
               world = getWorld();
               world.removeObject(this);
            } 
            else{
                System.out.println("Incorrect Answer!");
            }
        }
    } 
}

