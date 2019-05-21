import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ships here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ships extends Enemy
{
    /**
     * Act - do whatever the ships wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
     public void dropItAsEnemy(){
        if(leben<=0){
        // int s=Greenfoot.getRandomNumber(5)+1;
        
        // while (s!=0){
            
            getWorld().addObject(new beryllium(),this.getX(),this.getY());
            // s--;
        // }
     }
    }
}
