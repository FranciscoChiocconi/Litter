import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sbob extends Actor
{
    private int gold = 0; //creates variable for gold starting at 0
    private int trap = 0; //creates variable for trap starting at 0
    
    public void act() 
    {
        if (canCatchGold()) {
            catchGold();//calls the method catchGold when sbob runs into gold
            gold = gold + 1; //adds one to the gold counter
        }
        if (canCatchTrap()) {
            catchTrap();//calls the method crabTrap when sbob runs into trap
            trap = trap + 1;//adds one to the trap counter
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+1, getY());//when right key is held spongebob moves right
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-1, getY());//when left key is held sbob moves left
        }
        

    }

    private boolean canCatchGold() //method for catching gold
    {   Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class);//checks whether sbob runs into the gold
        if (gold != null) {
            return true;//returns true if spongebob runs into gold
        }
        else {
            return false;//returns false when sbob doesn't run into gold
        }
    }
    private boolean canCatchTrap()
        {
            Actor trap = getOneObjectAtOffset(0, 0, CrabTrap.class);//method that checks whether sbob runs into traps
            if (trap != null) {
                return true;//returns true if sbob runs into trap
            }
            else {
                return false;//returns false if the trap does not hit sbob
            }
        }
    private void catchGold()
    {
        Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class);
        if(gold != null) {//checks if method above is true 
           Greenfoot.playSound("cha_ching.wav");//plays mp3 if true of ChaChing
           getWorld().removeObject(gold);//removes gold from the world
    }
     }
     private void catchTrap()
    {
        Actor trap = getOneObjectAtOffset(0, 0, CrabTrap.class);
        if(trap != null) {//checks if method of trap is true
           Greenfoot.playSound("bonk.wav");//if true mp3 of bonk plays 
           getWorld().removeObject(trap);//if true removes trap from the world
    }
     }
}
