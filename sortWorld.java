import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sortWorld extends World
{

    /**
     * Constructor for objects of class sortWorld.
     * 
     */
    public sortWorld()
    {    
        super(1200, 800, 1); 
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        initialize();
    }
    
    public void initialize() {
        int objRow = 720;
        Bin trash = new Bin("trash.png");
        addObject(trash, 500, 420);
        Bin recycle = new Bin("recycle.png");
        addObject(recycle, 600, 420);
        Bin compost = new Bin("compost.png");
        addObject(compost, 700, 420);
        Display glass = new Display("trash", "glass.png");
        addObject(glass, 300, objRow);
        Display tire = new Display("trash", "tire.png");
        addObject(tire, 400, objRow);
        Display waterbottle = new Display("recycle", "waterbottle.png");
        addObject(waterbottle, 500, objRow);
        Display cardboard = new Display("recycle", "cardboard.png");
        addObject(cardboard, 600, objRow);
        Display paper = new Display("recycle", "paper.png");
        addObject(paper, 700, objRow);
        Display banana = new Display("compost", "banana.png");
        addObject(banana, 800, objRow);
        Display pizza = new Display("compost", "pizza.png");
        addObject(pizza, 900, objRow);
    }
}
