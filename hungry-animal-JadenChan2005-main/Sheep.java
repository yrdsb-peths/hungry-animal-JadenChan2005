import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    GreenfootSound sheepSound = new GreenfootSound("zapsplat_cartoon_animal_lamb_sheep_baa_001_23573.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[5];
    
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    
    String facing = "right";
    String name;
    
    SimpleTimer animationTimer = new SimpleTimer();
    public Sheep(String name)
    {
        this.name = name;
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/sheep_animate/idle" + i + ".png");
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/sheep_animate/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    public void animateSheep()
    {
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
       
    }
    
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")){
            facing = "right";
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
        eat();
        
        //animate sheep
        animateSheep();
    }

    public void eat()
    {
    // Eat the apple
        if(isTouching(goodApple.class)){
            removeTouching(goodApple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
            sheepSound.play();
        }
        if(isTouching(badApple.class)){
            removeTouching(badApple.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseScore();
            world.spawnBadApple();
        }
    }
}
