import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class miningLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class miningLaser extends bullet
{
    
    public miningLaser(){
      lifetime=40;  
      speed=3;
      damage=3;
      
    }
    public void mineExp(){
       if(this.isTouching(asteroids.class) ){
           lifetime--;
           getWorld().addObject(new miningExpl(),this.getX(), this.getY());
        }
    }
    /**
     * Act - do whatever the miningLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mineExp();
        beABullet();
        mamaSchadenAoe();
        dieAsBullet();
        lifetime--;
         
        kill();
    }    
 
}
