import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fireball extends Mover
{
    private GreenfootImage fireball = new GreenfootImage("fireball.PNG");
    private GreenfootImage fireball2 = new GreenfootImage("fireball2.PNG");
    private GreenfootImage fireball3 = new GreenfootImage("fireball3.PNG");
    private int frame = 1;
    private int animationCounter = 0;

    
        
        
        private int timer;
        
        public void act()
        {
           {
               animationCounter ++;
               move (-4);
               if(isTouching(Player1.class))
        getWorld().showText("GAME OVER!", 300,200);
                if(isTouching(Player1.class))
            Greenfoot.stop();
            if(isTouching(Player1.class))
            removeTouching(Player1.class);
            
            {
                if(animationCounter % 4 == 0)
            animateFireball();
        }
         if (this.atWorldEdge()) 
        {
            getWorld().removeObject(this);
        }  
        
              
            
              
             
           
        
        }
            
            
        
    
        }
        
        public void animateFireball()
        {

            if(frame == 1)
            { setImage(fireball);
            }
            else if(frame == 2)
            { 
                setImage(fireball2);
            }
            else if(frame == 3)
            { 
                setImage(fireball3);
                frame =1;
                return;
            }
            frame ++;

        }
    
    }

