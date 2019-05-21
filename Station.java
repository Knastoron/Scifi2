import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Station here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Station extends moveWithWorld
{
   
    boolean ini=false;
    /**
     * Act - do whatever the Station wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        allIn();
        stationInitialize();
        upgrade();
    
    }   
    public void upgrade(){
        
        
     }
    public void stationInitialize(){
       if(ini==false){
        
        ini=true;
    }
    
    }
}
