import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class moveWithWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moveWithWorld extends Actor
{
    space koordGeber;
    float relatXmove;
    float relatYmove;
    boolean init=false;
    moveWithWorld giver;           
    int moveSpeed;
    int moveSideSpeed;
    int ghostRot;
    int ghostX;
    int ghostY;
    boolean gehSterben=false;
     boolean DIE=false;
    double distanceToPlayer;
    
    /**
     * Act - do whatever the moveWithWorld wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void distanceFeststellung(){
        distanceToPlayer = Math.sqrt(((640-getX())*(640-getX())+(360-getY())*(360-getY())));
        
    }
    public void distanceDecay(){
        
         
        if(Math.abs(distanceToPlayer)>100000){
        gehSterben=true;
        
        }
        
        
    }
    
//     public void moveEnemy(){
//       ghostMove muh= new ghostMove();
//         getWorld().addObject(muh,getX(),getY());
//         muh.setRotation(this.getRotation());
//         muh.giver=this;
//         muh.moveSpeed=this.moveSpeed;
//         relatX=relatX-ghostX;
//         relatY=relatY-ghostY;
//         setLocation(relatX,relatY);
//         
//         
//     }
    public void allIn(){
       if(gehSterben==false)
      {
           Initialize();
         WorldMove();
         distanceFeststellung();
      }
      
    }
    public void Initialize(){
        if(init==false){
         init=true;
         koordGeber=(space)getWorld();
        }
    }
    public void WorldMove(){
         
        
        relatXmove=koordGeber.shipMoveX;
        relatYmove=koordGeber.shipMoveY;
       
        this.setLocation(getX()+(int)relatXmove,getY()+(int)relatYmove);
    }
    public void movementWithGhost(){
        ghostMove muh= new ghostMove();
        getWorld().addObject(muh,getX(),getY());
        muh.setRotation(this.getRotation());
        muh.giver=this;
        muh.moveSpeed=this.moveSpeed;       
        
        setLocation(getX()-ghostX,getY()-ghostY);
        
    }
    
}
