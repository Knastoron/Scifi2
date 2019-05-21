

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class testApfel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testApfel extends spaceObjects
{   
    public testApfel(){
    leben=150;
    schild=100;
    moveSpeed=10;
}
    /**
     * Act - do whatev}}er the testApfel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        allIn();
       getDamage();
       destroyed();
    }    
}
