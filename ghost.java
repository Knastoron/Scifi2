import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ghoste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ghost extends moveWithWorld

{
    int ghostSpeed;
    int sideGhostSpeed;
    ship orig;
   
    graphics G;
    Enemy t;
    ghost initialD;
    int tempY;
   int tempX;
   boolean drift;
    /**
     * Act - do whatever the ghoste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(drift==false)how2Spook();
        else Drift();
    }    
    public void grafikMove(){
        
        move(ghostSpeed);
        G.setLocation(this.getX(),this.getY());
        if(getX()<20||getX()>1250||getY()<20||getY()>700)
            {}
            else{
                G.gehSterben=true;
                gehSterben=true;
                
            }
    }
    public void drift(){
        move(ghostSpeed);
        orig.driftX=getX();
        orig.driftY=getY();
      
        
    }
    public void how2Spook(){
       
        
        move(ghostSpeed);
        int g= getRotation();
        setRotation(g+90);
        move(sideGhostSpeed);
        setRotation(g-90);
        if(orig!=null){
        orig.tempX=getX();
        orig.tempY=getY();
    }
    else{
         initialD.tempX=getX();
         initialD.tempY=getY();}
    
       gehSterben=true;
    }
    public void Drift(){
       
        
        move(ghostSpeed);
        int g= getRotation();
        setRotation(g+90);
        move(sideGhostSpeed);
        setRotation(g-90);
       
         initialD.tempX=getX();
         initialD.tempY=getY();
    
        gehSterben=true;
    }
    public void GhostMove(){
       
        int zX=getX();
         int zY=getY();
         move(moveSpeed);
         
         giver.ghostX=zX-this.getX();
        giver.ghostY=zY-this.getY();
       gehSterben=true;
       
        }
   
    
    
}
