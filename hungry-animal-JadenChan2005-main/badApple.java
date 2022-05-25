import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badApple extends Actor
{
    /**
     * Act - do whatever the badApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.spawnBadApple();
        }// Add your action code here.
    }
}
