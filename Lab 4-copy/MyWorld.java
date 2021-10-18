import lang.stride.*;
import greenfoot.*;

public class MyWorld extends World
{

    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }
    private int dragonsSpawned = 6;
    public void act()
    {
        spawnal();
    }

    public void spawnal()
    {
        if(Greenfoot.getRandomNumber(100) == 1 && dragonsSpawned > 0)
        {

            int x = 650;
            int y = 350;

            addObject(new dragon(),610, 350);
            dragonsSpawned --;
            
            if(dragonsSpawned == 0)
            addObject(new boss(), 500, 350);
            if(dragonsSpawned == 0)
            addObject(new invisible(),447,355);
            if(dragonsSpawned == 0)
            Greenfoot.playSound("bosstheme.WAV");

        }
    } 

    private void prepare()
    {

        Player1 player1 =  new  Player1();
        addObject(player1, 27, 344);
        
        player1.setLocation(19,364);
        player1.setLocation(19,375);
        
        
    

    }

}
