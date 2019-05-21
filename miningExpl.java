import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class miningExpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class miningExpl extends moveWithWorld
{
    private final static int IMAGE_COUNT= 16;
    private static GreenfootImage[] images;
    private int imageNo = 0;
    private int increment=1;
    public miningExpl(){
    
        
        initialiseImages2();
        setImage(images[0]);    
    }
    public synchronized static void initialiseImages2() {
        if(images == null) {
            GreenfootImage baseImage = new GreenfootImage("mine.png");
            int maxSize = baseImage.getWidth();
            int delta = maxSize / IMAGE_COUNT;
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i++) {
                size = size + delta;
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    public void explosionDamage2(){
        
         if(this.isTouching(ships.class)){
           List<ships> Ts=getIntersectingObjects(ships.class);
           
           for(int i=0;i<Ts.size();i++){
           ships mrT= Ts.get(i);
           mrT.damageGot=mrT.damageGot+5;
           
        }
        }
        if(this.isTouching(asteroids.class)){
           List<asteroids> targets=getIntersectingObjects(asteroids.class);
           
           for(int l=0;l< targets.size();l++){
           asteroids TT=  targets.get(l);
           TT.leben=TT.leben-50;
           
        }
          
        }
    }
    /**
     * Act - do whatever the miningExpl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(this!=null){
            allIn();
            explosionDamage2();
        }
         setImage(images[imageNo]);
         
        imageNo += increment;
        if(imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
        }
        
        if(imageNo < 0) {
            getWorld().removeObject(this);
        }
    }    
}
