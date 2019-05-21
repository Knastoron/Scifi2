import greenfoot.*;

/**
 * Write a description of class engineActive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class engineActive extends graphics
{
    /**
     * Act - do whatever the engineActive wants to do. This method is called whenever
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
