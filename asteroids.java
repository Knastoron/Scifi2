import greenfoot.*;

/**
 * Write a description of class asteroidEssence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroids extends ressources
{
    int essenceAmount;
    
    int size=35;
    int A=size;
    boolean i;
    int astiPartX;
    int astiPartY;
    public asteroids(){
        leben=10000;
    }
    /**
     * da jan kein bock hatte, irgendetwas zu machen, ist diese methode useless
     */
    public void vernünftigerAsteroidenGenerator()
    {
        
    }
    /**
     * Act - do whatever the asteroidEssence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      allIn();
       modularAsteroid();
       distanceDecay();
       destroyed();
    }    
    public void Ast(){
        allIn();
        stayThere();
        distanceDecay();
        destroyedAsAst();
    }
    public void destroyedAsAst()
    {
        if(leben<=0)
        {
            dropIt();
            getWorld().removeObject(this);
        }
    }
    public void dropIt(){
        if (i=true){
        int schmmsch=Greenfoot.getRandomNumber(100);
        int hatKeinBock=0;
        if(schmmsch<=30)
        hatKeinBock=2;
        // Greenfoot.getRandomNumber(8)+1;
        if(hatKeinBock!=0){
            if(hatKeinBock==2)
            getWorld().addObject(new Supremium(),this.getX(),this.getY());
           
           
            
            
            
        }
    }}
    public void stayThere(){
        if( i==false){
            //  relatX=astiPartX;
       // relatY=astiPartY;
        
        if(this.isTouching(asteroidPiece.class)==false)
        {getWorld().removeObject(this);
        }
        i=true;
    }
}
    public void modularAsteroid(){
        
        while(A>0){
            A--;
            int tX=Greenfoot.getRandomNumber(size/3)*(Greenfoot.getRandomNumber(size)-size/2);
            int tY=Greenfoot.getRandomNumber(size/3)*(Greenfoot.getRandomNumber(size)-size/2);
            asteroidPiece T= new asteroidPiece();
            getWorld().addObject(T,this.getX()+tX,this.getY()+tY);
           
            T.astiPartX=this.getX()+tX;
            T.astiPartY=this.getY()+tY;
            T.leben=10000;
        
        
        
        }
      
        
        
    }
}
