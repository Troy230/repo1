import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dragon extends Actor
{
    private GreenfootImage d1 = new GreenfootImage("dragon1.png");
    private GreenfootImage d2 = new GreenfootImage("dragon2.png");
    private GreenfootImage d3 = new GreenfootImage("dragon3.png");
    private int frame = 1;
    private int animationCounter = 0;
    private int timer = 0;
    /**
     * Act - do whatever the dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        move(-4);

        if(animationCounter % 8 == 0)
            animateDragon();
        animationCounter ++;
        if (isTouching(Player1.class))
            getWorld().showText("GAME OVER!", 300,200);
        if (isTouching(dragon.class))
            removeTouching(dragon.class);

        if (isTouching(Player1.class))
            removeTouching(Player1.class);
        if (isTouching(Player1.class))
            Greenfoot.stop();
        if (isAtEdge())

            getWorld().removeObject(this);
    }

    public void animateDragon()
    {
        if(frame == 1)
        {
            setImage(d1);
        }
        else if(frame == 2)
        {
            setImage(d2);
        }
        else if(frame == 3)
        {
            setImage(d3);
            frame = 1;
            return;
        }
        frame ++;
    }
}
