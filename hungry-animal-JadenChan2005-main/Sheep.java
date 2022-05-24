import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean isFacingRight = true;
    String name;
    public Sheep(String name)
    {
        this.name = name;
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            isFacingRight = false;
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")){
            isFacingRight = true;
            move(5);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
        

        
        // Eat the apple
        if(isTouching(goodApple.class)){
            removeTouching(goodApple.class);
            MyWorld world = (MyWorld) getWorld();
            //world.increaseScore();
            world.spawnApple();
        }
        if(isTouching(badApple.class)){
            removeTouching(badApple.class);
            MyWorld world = (MyWorld) getWorld();
            //world.increaseScore();
            world.spawnBadApple();
        }
    }
}
