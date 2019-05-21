import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class drifta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drifta extends ghost
{
   float DriftinX=0;
   float DriftinY=0; 
   int Xd;
   int Yd;
       /**
     * Act - do whatever the drifta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muhve();
}
public void muhve(){
    
    ghostDrift2();
    
    
}
// public void ghostDrift(){
//    ghost G= new ghost();
//    
//        
// 
//         int rott=this.getRotation();
//         // sendIt;
//         
//         getWorld().addObject(G,this.getX(),this.getY());
//         G.drift=true;
//         G.setRotation(rott);
// 
//         G.initialD =this;
// 
//         G.ghostSpeed=this.ghostSpeed;
//         G.sideGhostSpeed=this.sideGhostSpeed;
//         Xd =( tempX-this.getX());
//         Yd =( tempY-this.getY());
//         
//         orig.sendIt.shipMoveX=-Xd;
//        orig.sendIt.shipMoveY=-Yd;
//        
//         
// }
public void ghostDrift2(){
     this.turnTowards(getX()+(int)DriftinX,getY()+(int)DriftinY);
    
       orig.sendIt.shipMoveX=-DriftinX;
       orig.sendIt.shipMoveY=-DriftinY;

       if(DriftinX<-10)
       DriftinX=-10;
        if(DriftinX>10)
       DriftinX=10;
        if(DriftinY<-10)
       DriftinY=-10;
        if(DriftinY>10)
       DriftinY=10;
       
}
}
