import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FallingObjects extends Actor
{
    private int dropSpeed = 0; //speed of which objects drop under this variable
    private boolean onBottom = false; //boolean for checking floor starts false
    
    public static int counting = 0;
    
    public void act() 
    {
        // Add your action code here.
        fall();//runs the fall command for objects to drop
    }

    public void fall()
    {
        if (counting==6) {
            BinWorld w = new BinWorld();
            Greenfoot.setWorld(w);
        }
    }
    
    private boolean checkBottom()//method to check if object reaches ground
    {
        if (getY() > 570) {
            return true; //if the object reaches 570 the boolean returns true
        }
        else {
            return false;//if the object is below 570 then boolean returns false
        }
            
    }    
}
