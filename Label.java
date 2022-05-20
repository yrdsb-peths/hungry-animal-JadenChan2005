import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    private static final Color transparent = new Color(0,0,0,0);

    
    /**
     * Create a new label, initialise it with the int value to be shown and the font size 
     */
    public Label(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize);
    }
    
    /**
     * Create a new label, initialise it with the needed text and the font size 
     */
    public Label(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        
    }
}
