import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class engine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class engine extends graphics
{
    /**
     * Act - do whatever the engine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            allIn();
              moveInDirection();
              dieLikeRightNow();
              this.setRotation(this.getRotation()+30);
    }    
}
