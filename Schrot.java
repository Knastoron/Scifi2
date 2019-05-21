import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schrot extends friendlyBullet
    
   {   public Schrot(){
    lifetime=20;
    damage=65;
     miningPower=50;
   }
    /**
     * Act - do whatever the Schrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        schrot();
        beABullet();
        
        dieAtBorder();
        mamaSchaden();
        kill();
    }    
}
