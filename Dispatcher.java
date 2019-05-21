import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Dispatcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dispatcher extends Actor
{
    /**
     * Act - do whatever the Dispatcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     //  List<moveWithWorld> allObject = new ArrayList<moveWithWorld>();
    public void act() 
    {
       // allObject= getWorld().getObjects(moveWithWorld.class);
        for(moveWithWorld O : (java.util.List<moveWithWorld>)getWorld().getObjects(moveWithWorld.class))
        {
            if(O.gehSterben==true)
            {
                getWorld().removeObject(O);
            }
            
        }
        
    }    
}
