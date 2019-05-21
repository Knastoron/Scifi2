import greenfoot.*;

/**
 * Write a description of class enemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBullet extends moveWithWorld
{   public enemyBullet(){
     moveSpeed=20;
    }
    /**
     * Act - do whatever the enemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         allIn();
         movementWithGhost();
         if(this.isTouching(ship.class)){
             koordGeber.player.currentEnergy=koordGeber.player.currentEnergy-300;
             getWorld().removeObject(this);
            }
    }    
}
