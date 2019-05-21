import greenfoot.*;

/**
 * Write a description of class Brawler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brawler extends ships
{
    int EWeaponCd;
    boolean inited=false;
    boolean engaged=false;
    public Brawler(){
    
     leben=140;
    schild=75;
    moveSpeed=10;
    
}
 public void init(){
     
    }
    /**
     * Act - do whatever the Brawler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        allIn();
        init();
        distanceDecay();
        
        getDamage();
        movementWithGhost();
        engage();
        atackee();
        dropItAsEnemy();
        turnTowards(koordGeber.spielerReturn().getX(),koordGeber.spielerReturn().getY());
       destroyed();
       
       
    }    
    public void engage(){
        
       if(distanceToPlayer<600&&distanceToPlayer>300){
         if(koordGeber.player.speed<-2){
           moveSpeed=-(koordGeber.player.speed)+3;  }
           else{
          
           moveSpeed=3;
            }
            engaged=true;
        }
        else if(distanceToPlayer<300){
          if(koordGeber.player.speed<-2)
            moveSpeed=-(koordGeber.player.speed)+1;  
          else{
           moveSpeed=0;
            }
            engaged=true;
           
               
            
        }
        
         else engaged=false;
        
    }
    public void atackee(){
        if (EWeaponCd==0&&engaged==true)
               {enemyBullet b = new enemyBullet(); 
                getWorld().addObject(b, getX(),getY());
                b.setRotation(this.getRotation());
                EWeaponCd=20;
            }
        if(EWeaponCd>0)EWeaponCd--;
    }
}
