import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends moveWithWorld
{
    List<ships> allTargets ;
    boolean initialized=false;
    Enemy target;
    double maxDistance = 10000;
    int direction= 0;
    public Missile()
    {
       allTargets = new ArrayList<ships>();
      //temp:
      moveSpeed=4;
      
    }
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        allIn();
          movementWithGhost();
        Targeting();
       missileRotation();
       
      
         
        
    }    
    public void missileRotation()
    /**
     * Wenn Ziel vorhanden, wird langsam darauf hingedreht
     * Magische Trackingfunktion, Do not touch
     * 
     */
    {
      
       if(target!=null){
        //  turnTowards(target.getX(),target.getY());
        PointingGhost g =  new PointingGhost();
        getWorld().addObject(g,this.getX(),this.getY());
        g.turnTowards(this.target.getX(),this.target.getY());
        
       // int winkel1=this.getRotation();
        //  if(winkel1>180) winkel1=winkel1-180;
       // int winkel2=g.getRotation();
        //if(winkel2>180) winkel2=winkel2-180;
        
        //SE Magic Tracking 
        // Ka wie ich das hinbekommen hab aber es funzt.
        int difference =  ((  this.getRotation())-(g.getRotation()) )   ;
        if(difference>180)difference=(difference-180)*-1;
        
        if(difference<-180)difference=(difference+180)*-1;
        
        
       // System.out.println(difference);
        if(difference>0)
         direction= (direction+358) % 360;
        else if (difference < 0)
         direction = (direction+2) % 360;
        
        this.setRotation(direction);
        g.gehSterben=true;
        
        
       }
    }
    public void Targeting()
    /**
     * Sucht Ziele vom Typ "ships", aka bewegende Gegner.
     * wenn ziele gefunden worden, wird das mit dem geringsten Abstand zum aktuellen Ziel gemacht.
     */
    {
        if(!getWorld().getObjects(ships.class).isEmpty())
        {
        for(ships S : (java.util.List<ships>)getWorld().getObjects(ships.class))
        {
            if(Math.sqrt(((S.getX()-this.getX())*(S.getX()-this.getX())+(S.getY()-this.getY())*(S.getY()-this.getY())))<maxDistance)
            {
                target=S;
                maxDistance=Math.sqrt(((S.getX()-this.getX())*(S.getX()-this.getX())+(S.getY()-this.getY())*(S.getY()-this.getY())));
                
                if(maxDistance<15||this.isTouching(ships.class)){
                getWorld().addObject(new explosion("concussiveBlow-big.png"),this.getX(), this.getY());
                 this.gehSterben=true;
                }
            }
            
        }
        maxDistance=10000;
      }
      else
      {
          target=null;
    }
      
    }
    
    
}
