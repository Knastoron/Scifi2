import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class preview here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class preview extends Actor
{
    boolean active;
    /**
     * Act - do whatever the preview wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imageSwitch();// Add your action code here.
    }   
    public void imageSwitch(){
        if(active==true)
        this.setImage("Station preview.png");
        else
     this.setImage("xxx.png");}
}
