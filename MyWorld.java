import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;;
    public Label scoreLabel = new Label(score, 80);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Sheep s = new Sheep("chad");
        addObject(s, 200, 300);
        addObject(scoreLabel, 50, 50);
        
        spawnApple();
    }
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        goodApple apple = new goodApple();
        addObject(apple, x, y);
    }
    //public void increaseScore()
    //{
    //    score++;
    //    scoreLabel.setValue(score);
    //}
    
    public void gameOver()
    {
        gameOverWorld world = new gameOverWorld();
        Greenfoot.setWorld(world);
    }
}
