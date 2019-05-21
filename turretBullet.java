import greenfoot.*;

/**
 * Write a description of class turretBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turretBullet extends friendlyBullet
{   
    public turretBullet(){
        lifetime=30;
        damage=30;
        miningPower=20;
        speed=15;
    }
    /**
     * Act - do whatever the turretBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        beABullet();
        
        dieAtBorder();
        mamaSchaden();
        kill();
    }    
}
