import greenfoot.*;

/**
 * Write a description of class spaceObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spaceObjects extends ships
{
    int iron;
    int nickel;
    int gold;
    int ice;
    int supremium;
    /**
     * Act - do whatever the spaceObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void gimmeThatStuff(){
        if(leben<=0)
        {
           dropIt();
           getWorld().removeObject(this);
        }
        
    }
    
    public void dropIt(){
        
    }
    public void ressourcen(){
       //randomgenerator für ressourcen 
    }
}
