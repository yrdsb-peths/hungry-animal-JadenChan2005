import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titleScreen extends World
{
    Label titleLabel = new Label("Hungry Sheep", 60);
    /**
     * Constructor for objects of class titleScreen.
     * 
     */
    public titleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to start", 40);
        addObject(label,309,277);
        label.setLocation(313,272);
        Label label2 = new Label("Use WASD keys to move around", 30);
        addObject(label2,309,332);
        label.setLocation(407,268);
        label.setLocation(209,277);
        label2.setLocation(251,317);
        label.setLocation(300,262);
        label2.setLocation(360,310);
        label2.setLocation(263,324);
        label2.setLocation(384,319);
        label2.setLocation(300,328);
    }
}

