import greenfoot.*;
import java.util.List;
/**
 * Eine reguläre Explosion,die durch den Tod eines Schiffes hervorgerufen wir
 * 

 */
public class explosion extends moveWithWorld
{
   private final static int IMAGE_COUNT= 16;
    private static GreenfootImage[] images;
    private int imageNo = 0;
    private int increment=1;
    boolean death=false;
    int initialD=10
    ;
    int initialD2=70
    ;
    public static String ImageName="explosion-big.png";
    public explosion() {
        
            
        
    }    
    public explosion(String s) 
    {
        ImageName=s;
        initialiseImages();
        setImage(images[0]);    
    }
    
    /** 
     * Erzeugt die Bilder für die Explosion.
     */
    public synchronized static void initialiseImages() {
        if(images == null) {
            GreenfootImage baseImage = new GreenfootImage(ImageName);
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
    public void explosionDamage(){
        
         if(this.isTouching(ships.class)){
           List<ships> Ts=getIntersectingObjects(ships.class);
           
           for(int i=0;i<Ts.size();i++){
           ships mrT= Ts.get(i);
           mrT.damageGot=mrT.damageGot+this.initialD;
           
        }
        }
        if(this.isTouching(asteroids.class)){
           List<asteroids> targets=getIntersectingObjects(asteroids.class);
           
           for(int l=0;l< targets.size();l++){
           asteroids TT=  targets.get(l);
           TT.leben=TT.leben-this.initialD2;
           
        }
          
        }
    }
    /**
     * Die Explosion vergrößert sich, wird wieder kleiner und verschwindet.
     */
    public void act()
    { 
        
        if(this!=null){
            allIn();
            explosionDamage();
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

