import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class graphics extends moveWithWorld
{
    public ship glued;
    int moveDirectionRot;
    int moveDirectionSpeed;
    int dieAtSis;
    int dieTimer=0;
    /**
     * Act - do whatever the graphics wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void glueIt(){
        setLocation(glued.getX(),glued.getY());
        
    }
    public void dieLikeRightNow(){
   if(gehSterben==true)
            {getWorld().removeObject(this);}
}
    public void moveInDirection(){
        setRotation(moveDirectionRot);
        move(moveDirectionSpeed);
        
//         if(getX()<20||getX()>1250||getY()<20||getY()>700)
//             {gehSterben=true;}
         if(dieAtSis>0){
         if(dieTimer>dieAtSis){
             
            gehSterben=true;
            }
            else 
            dieTimer++;
     }
    
}
}
