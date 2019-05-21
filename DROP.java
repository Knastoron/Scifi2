import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DROP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DROP extends moveWithWorld
{
    /**
     * Act - do whatever the DROP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void angammeln(){
        if(distanceToPlayer<500)
        {
            turnTowards(koordGeber.spielerReturn().getX(),koordGeber.spielerReturn().getY());
            moveSpeed=4;
        }
        else
        moveSpeed=0;
        if(this.isTouching(ship.class)){
            if(this instanceof Supremium)
            {koordGeber.material=koordGeber.material+10+
                Greenfoot.getRandomNumber(30);
            }
                        
                        if(this instanceof beryllium)
            {koordGeber.material2=koordGeber.material2+5+
                Greenfoot.getRandomNumber(4);
            }
            getWorld().removeObject(this);
        }
    }
}
