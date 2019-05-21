import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SMG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SMG extends friendlyBullet
{
    /**
     * Act - do whatever the SMG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SMG(){
        lifetime=100;
       speed=20;
      damage=50;
        miningPower=30;
    }
    public void act() 
    {
        
        beABullet();
        mamaSchaden();
        dieAtBorder();
        
        kill();
    }    
}
