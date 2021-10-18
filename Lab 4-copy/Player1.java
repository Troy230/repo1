import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    private GreenfootImage run1right =  new  GreenfootImage("run1.png");
    private GreenfootImage run2right =  new  GreenfootImage("run2.png");
    private GreenfootImage run3right =  new  GreenfootImage("run3.png");
    private GreenfootImage run4right =  new  GreenfootImage("run4.png");
    private GreenfootImage run5right =  new  GreenfootImage("run5.png");
    private GreenfootImage run6right =  new  GreenfootImage("run6.png");
    private GreenfootImage run7right =  new  GreenfootImage("run7.png");
    private GreenfootImage run8right =  new  GreenfootImage("run8.png");
    private GreenfootImage run9right =  new  GreenfootImage("run9.png");
    private GreenfootImage run1left =  new  GreenfootImage("runleft1.png");
    private GreenfootImage run2left =  new  GreenfootImage("runleft2.png");
    private GreenfootImage run3left =  new  GreenfootImage("runleft3.png");
    private GreenfootImage run4left =  new  GreenfootImage("runleft4.png");
    private GreenfootImage run5left =  new  GreenfootImage("runleft5.png");
    private GreenfootImage run6left =  new  GreenfootImage("runleft6.png");
    private GreenfootImage run7left =  new  GreenfootImage("runleft7.png");
    private GreenfootImage run8left =  new  GreenfootImage("runleft8.png");
    private GreenfootImage run9left =  new  GreenfootImage("runleft9.png");
    private GreenfootImage idle1 =  new  GreenfootImage("idle1.png");
    private GreenfootImage idle2 =  new  GreenfootImage("idle2.png");
    private GreenfootImage idle3 =  new  GreenfootImage("idle3.png");
    private GreenfootImage idle4 =  new  GreenfootImage("idle4.png");
    private GreenfootImage idle5 =  new  GreenfootImage("idle5.png");
    private GreenfootImage idle6 =  new  GreenfootImage("idle6.png");
    private GreenfootImage idle7 =  new  GreenfootImage("idle7.png");
    private GreenfootImage idle8 =  new  GreenfootImage("idle8.png");
    private GreenfootImage idle9 =  new  GreenfootImage("idle9.png");
    private int frame = 1;
    private int animationCounter = 0;
    private int jumpCounter;

    /**
     * 
     */
    public Player1()
    {
        velocity = 1;
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        fall();
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 30)
        {
            jump();
        }
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 30)
        {
            jumpCounter++;
            getWorld().showText("Jumps:" + jumpCounter, 300,200);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
            if (Greenfoot.isKeyDown("d")) {
                if (animationCounter % 4 == 0) {
                    animateRight();
                }
            }
            getImage().scale(24, 48);
             if (isTouching(boss.class))
             {
                 getWorld().showText("You won with this many jumps:" + jumpCounter, 400,350);
             }
            if (isTouching(boss.class)) {
                getWorld().showText("YOU WIN!", 300,200);
                if (isTouching(boss.class)) 
                {
                    removeTouching(boss.class);
                    Greenfoot.stop();
                }

            }
            animationCounter = animationCounter + 1;
            
            
        }

        /* Unsupported feature in Stride : initializer block*/

        /**
         * 
         */
    }

    public void animateRight()
    {
        if (frame == 1) {
            setImage(run1right);
        }
        else if (frame == 2) {
            setImage(run2right);
        }
        else if (frame == 3) {
            setImage(run3right);
        }
        else if (frame == 4) {
            setImage(run4right);
        }
        else if (frame == 5) {
            setImage(run5right);
        }
        else if (frame == 6) {
            setImage(run6right);
        }
        else if (frame == 7) {
            setImage(run7right);
        }
        else if (frame == 8) {
            setImage(run8right);
        }
        else if (frame == 9) {
            setImage(run9right);
            frame = 1;
            return;
        }
        frame = frame + 1;
    }

    /**
     * 
     */
    public void animateLeft()
    {
        if (frame == 1) {
            setImage(run1left);
        }
        else if (frame == 2) {
            setImage(run2left);
        }
        else if (frame == 3) {
            setImage(run3left);
        }
        else if (frame == 4) {
            setImage(run4left);
        }
        else if (frame == 5) {
            setImage(run5left);
        }
        else if (frame == 6) {
            setImage(run6left);
        }
        else if (frame == 7) {
            setImage(run7left);
        }
        else if (frame == 8) {
            setImage(run8left);
        }
        else if (frame == 9) {
            setImage(run9left);
            frame = 1;
            return;
        }
        frame = frame + 1;
    }

    /**
     * 
     */
    public void animateIdle()
    {
        if (frame == 1) {
            setImage(idle1);
        }
        else if (frame == 2) {
            setImage(idle2);
        }
        else if (frame == 3) {
            setImage(idle3);
        }
        else if (frame == 4) {
            setImage(idle4);
        }
        else if (frame == 5) {
            setImage(idle5);
        }
        else if (frame == 6) {
            setImage(idle6);
        }
        else if (frame == 7) {
            setImage(idle7);
        }
        else if (frame == 8) {
            setImage(idle8);
        }
        else if (frame == 9) {
            setImage(idle9);
            frame = 1;
            return;
        }
        frame = frame + 1;
    }

    /**
     * 
     */
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 30) {
            velocity = 0;
        }
        else {
            velocity = velocity + GRAVITY;
        }
    }

    /**
     * 
     */
    public void jump()
    {
        velocity = -26;
    }
}
