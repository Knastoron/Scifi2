import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends moveWithWorld
{
    public int speed;
    public int leben;
    public int energie;
    public int schild;
    public int spawnX;
    public int spawnY;
    public int positionX;
    public int positionY;
    int damageGot;
    
    public void act(){
       Initialize();
      
        }
   
    public void getDamage(){
      
//                  int damage=0;
         
//         if(this.isTouching(turretBullet.class)){ 
//         damage=damage+2;
//         removeTouching(turretBullet.class);
//                }
//         if(this.isTouching(SMG.class)) {
//         damage=damage+5;
//         removeTouching(SMG.class);
//                }
//         if(this.isTouching(Schrot.class)) {
//         damage=damage+3;
//         removeTouching(Schrot.class);
//              }
//        if(this.isTouching(explosion.class)) {
//        damage=damage+2;
//         
//              }
//              if(getX()<20||getX()>1250||getY()<20||getY()>700)
//              {
//                  if(isTouching(missile.class)==true){
//                       missile R=(missile)getObjectsInRange(50, missile.class).get(0);
//                      if(R.relatX-relatX>-20&&R.relatX-relatX<20&&R.relatY-relatY>-20&&R.relatY-relatY<20){
//                         R.DIE=true;
//                         damage=damage+25;
//                         }
//                      
//                 
//                 }
//                  
//                 }
//          if(this.isTouching(beamType.class)) {
//         damage++;
//         
//              }
            if(damageGot<=schild)
            {
                schild=schild-damageGot;
                damageGot=0;
            }
            else if(damageGot>schild)
            {
                damageGot=damageGot-schild;
                schild=0;
                leben=leben-damageGot;
                damageGot=0;
            }
        
    }
    public int gibLeben()
    {return leben;
    }
    public void destroyed()
    {
        if(leben<=0)
        {
           gehSterben=true;
        }
    }
}
