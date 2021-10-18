import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class boss extends fireball

{
    private int minShotDelay = 50;
    private int maxShotDelay = 85;
    private int shotTimer = minShotDelay;
    private GreenfootImage boss1 = new GreenfootImage("boss.png");
    private GreenfootImage boss2 = new GreenfootImage("boss2.png");
    private int frame = 1;
    private int animationCounter = 0;
    public void act()
    {
        {

            animationCounter ++;
            getImage().scale(120, 150);
            fire();

        
        } 
    }

    public void animateBoss()
    {
        if(frame == 1)
        {
            setImage(boss1);
        }
        else if(frame == 2)
        {
            setImage(boss2);
            frame = 1;
            return;
        }
        frame ++;
    }

    private void fire()
    {
        move(4);
        move(-4);

        if (shotTimer == 0)

        { 
            getWorld().addObject(new fireball(), getX(), getY());
            shotTimer = minShotDelay+Greenfoot.getRandomNumber(1+maxShotDelay-minShotDelay);

        }
        else shotTimer--;
        {
            if (isTouching(fireball.class))
                if(animationCounter % 10 == 0)
                    animateBoss();
             if (isTouching(fireball.class))
                move(-1);
                if (isTouching(invisible.class))
                move();
    
           

        }

    }
}

