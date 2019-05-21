import greenfoot.*;

/**
 * Write a description of class turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turret extends graphics
{   
   
    int targetX;
    int targetY;
    int weaponCdT;
    /**
     * Act - do whatever the turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        glueIt();
        if(glued.saveSpeed==true){
        point();
        shoot();}
    }  
    

    public void point(){
        if(Greenfoot.getMouseInfo()!=null){
            targetX=Greenfoot.getMouseInfo().getX();
        targetY=Greenfoot.getMouseInfo().getY();}
        this.turnTowards(targetX,targetY);
    }
    public void shoot(){
        if(Greenfoot.isKeyDown("f")){
             if (weaponCdT==0){turretBullet t = new turretBullet(); 
             getWorld().addObject(t, getX(),getY());
             t.setRotation(this.getRotation());
             weaponCdT=5;
            }
             
       }
       if(weaponCdT>0)
       weaponCdT--;
    }
}
