import greenfoot.*;
import java.util.List;
/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{   int lifetime;
    int speed;
    int damage;
    boolean DIE=false;
    boolean X;
    int miningPower;
    public bullet(){
     
      
    }
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        dieAsBullet();
        dieAtBorder();
        beABullet();
        mamaSchaden();
        
    }    
    public void mamaSchaden(){
        
       if(!getObjectsInRange(20, Enemy.class).isEmpty()){

           Enemy mrT= (Enemy)getObjectsInRange(20, Enemy.class).get(0);
           mrT.damageGot=mrT.damageGot+this.damage;
           DIE=true;
        }
    }
    public void mamaSchadenAoe(){
       
       if(this.isTouching(ships.class)){
           List<ships> Ts=getIntersectingObjects(ships.class);
           
           for(int i=0;i<Ts.size();i++){
           ships mrT= Ts.get(i);
           mrT.damageGot=mrT.damageGot+this.damage;
           
        }
        }
        if(this.isTouching(asteroids.class)){
           List<asteroids> targets=getIntersectingObjects(asteroids.class);
           
           for(int l=0;l< targets.size();l++){
           asteroids TT=  targets.get(l);
           TT.leben=TT.leben-this.miningPower;
           
        }
          
        }
       
     }
     public void beABullet(){
         move(speed);
        }
         public void schrot(){
        damage=damage-3;
        }
    public void dieAtBorder(){
      
         if(this!=null){
        if(lifetime<=0)
        DIE=true;
        
        
    }
    lifetime--;
   }
   protected void kill(){
       if(this!=null&&DIE==true)
       {getWorld().removeObject(this);
        }
    }
    public void dieAsBullet(){
    if(lifetime<=0)
        getWorld().removeObject(this);
   }
}
