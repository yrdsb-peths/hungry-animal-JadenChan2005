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
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Sheep s = new Sheep("chad");
        addObject(s, 200, 300);
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);
        
        
        
        spawnApple();
        spawnBadApple();
    }
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        goodApple apple = new goodApple();
        addObject(apple, x, y);
    }
    public void spawnBadApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        badApple bapple = new badApple();
        addObject(bapple, x, y);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
