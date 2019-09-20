import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Glass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cardboard extends FallingObjects
{
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            JPanel panel = new JPanel();
            JTextField answer = new JTextField(25);
            panel.add(answer);
            JOptionPane.showMessageDialog(null, panel, "Compost, Recycle, Trash?", JOptionPane.QUESTION_MESSAGE);
            System.out.println("ANSWER: (" + answer.getText() + ")");
            counting++;
            if (answer.getText().toLowerCase().equals("recycle")) {
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
