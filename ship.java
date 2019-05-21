import greenfoot.*;
import java.util.*;
import java.lang.Math;
/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
    int speed;
    int initialCD=30;
    int weaponCd;
    int weaponCd2;
    boolean start;
    space sendIt;
    int driftCD;
    float driftX=0;
    float driftY=0;
    int tempX;
    int tempY;
    int switchCD;
    int weaponMode=1;
    int maxSpeed;
    protected boolean limited=true;
    int JumpDriveCD=0;
    boolean saveSpeed=true;
    int miningCD;
    boolean miningActive=false;
    boolean rotationLocked=false;
    boolean SpeedLimit;
    drifta Konstante;
    int antriebsPartikel;
    boolean smg=false; //abwechselnde Laser
    int m2; // Mininglaser cooldown
    double energieVerhältnis;
    boolean raketen=true;
    int reactorUpgrades=4;
    int maxEnergy=24000;
    int currentEnergy=maxEnergy;
    energyBar B=new energyBar();
    public void startup(){
        if (start==false){
            
            Konstante= new drifta();
            
            getWorld().addObject(Konstante,getX(),getY());  

            start=true;
            Konstante.orig=this;

            getWorld().addObject(B, 1225,20);
            // mü.i=sendIt;

        }
    }

    public void Reaktor(){
        if(currentEnergy>30){
            if((Greenfoot.isKeyDown("w")))
                currentEnergy=currentEnergy-25;
            if((Greenfoot.isKeyDown("a")))
                currentEnergy=currentEnergy-1;
            if((Greenfoot.isKeyDown("d")))
                currentEnergy=currentEnergy-1;
            if((Greenfoot.isKeyDown("s")))
                currentEnergy=currentEnergy-10;}
        if(currentEnergy<maxEnergy)
            currentEnergy=currentEnergy+reactorUpgrades*5;

        double a=(double)currentEnergy;
        double b=(double)maxEnergy;
        double c;
        energieVerhältnis=(a/b);
        c=energieVerhältnis*1215;
        B.setLocation(10+(int)c,24);
    }


    /**
     * Act - do whatever the ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        startup();
        
            moveWithGhost();
            waffeln();
            miningLaser();
            drift();
        Reaktor();    
    } 

    

    public void miningLaser(){
        if(saveSpeed==true){
            if(Greenfoot.isKeyDown("Q")&&miningCD==0){
                miningCD=20;

                miningActive=!miningActive;
            }
            if(Greenfoot.isKeyDown("space")&&miningActive==true&& currentEnergy>=2000){
                if(m2==50){

                    miningLaser M= new miningLaser();
                    getWorld().addObject(M, getX(),getY());
                    M.setRotation(this.getRotation());
                    M.speed=10;
                    m2=0;
                    Greenfoot.playSound("minerLeisemp3.mp3");
                    currentEnergy=currentEnergy-2000;
                }
            }

            if(miningCD>0)
                miningCD--;
            if(m2<50)m2++;

        }
    }

   
    public void waffeln(){
        if(Greenfoot.isKeyDown("c")&& switchCD==0){
            if(weaponMode==2){
                weaponMode=3;
                switchCD=15;
            }
            else if(weaponMode==1){
                weaponMode=3;
                switchCD=15;
            }
            else if(weaponMode==3){
                weaponMode=1;
                switchCD=15;
            }
        }        
        MouseInfo maus=Greenfoot.getMouseInfo();
        if(maus != null)
         {           
             if(miningActive==false&&Greenfoot.isKeyDown("space")){
            
              if(weaponMode==1&&currentEnergy>200){
                if (weaponCd==0)
                {
                    SMG b = new SMG(); 
                    currentEnergy=currentEnergy-200;
                    getWorld().addObject(b, getX(),getY());
                    b.setRotation(this.getRotation());
                    if(smg==false){
                        b.setRotation(b.getRotation()+90);
                        b.move(20);
                        b.setRotation(b.getRotation()-90);
                        b.move(0);
                        b.turnTowards(maus.getX(),maus.getY());
                    }
                    else{
                        b.setRotation(b.getRotation()-90);
                        b.move(20);
                        b.setRotation(b.getRotation()+90);
                        b.move(0);
                        b.turnTowards(maus.getX(),maus.getY());
                    }
                    weaponCd=5;
                    smg=!smg;
                    Greenfoot.playSound("pew2.mp3");

                }
            }
            else if (weaponMode==3&&currentEnergy>800){
                if (weaponCd2==0){

                    int i;
                    for(i=0;i<20;i++){
                        Schrot b = new Schrot();
                        getWorld().addObject(b, getX(),getY());
                        b.setRotation(this.getRotation());
                        b.move(25);
                        int spray=Greenfoot.getRandomNumber(30)-15;
                        b.setRotation(this.getRotation()+spray);

                        b.speed=15;
                    }
                    Greenfoot.playSound("Pew_1.mp3");
                    currentEnergy=currentEnergy-800;
                    weaponCd2=26; 
                }
            }
             

        
        }
         
      }

        if( weaponCd>0)weaponCd--;
        if( weaponCd2>0)weaponCd2--;
        if( switchCD>0)switchCD--;

    }
    public void drift(){
        if(initialCD==0){
          maxSpeed=(int)Math.sqrt(Math.pow(Konstante.DriftinX,2)+(Math.pow(Konstante.DriftinY,2)));
            if(sendIt.shipMoveX>30||sendIt.shipMoveX<-30||sendIt.shipMoveY>30||sendIt.shipMoveY<-30)
            SpeedLimit=true;
            else SpeedLimit=false;
          
            if(driftCD==0){       
        if(Greenfoot.isKeyDown("w")){
        speed=1;
       
      }
       else speed=0;
       
       Konstante.DriftinX=Konstante.DriftinX+driftX;
       
       Konstante.DriftinY=Konstante.DriftinY+driftY;
       driftCD=8;
     }
     else 
     driftCD--;
    }
    else initialCD--;
    }

    public void moveWithGhost(){
        ghost G= new ghost();

        if(Greenfoot.getMouseInfo()!=null){
            this.turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
        }

        int rott=this.getRotation();
        // sendIt;
        
        getWorld().addObject(G,this.getX(),this.getY());

        G.setRotation(rott);

        G.orig =this;

        G.ghostSpeed=speed;       
        if(Konstante!=null){

            Konstante.setLocation(getX(),getY());
            // driftar.setRotation(getRotation());

        }
        driftX= (tempX-this.getX());
         driftY= (tempY-this.getY());
         engine();
    }
   
    public void engine(){
         
//          antriebAnimiert();
         antriebAnimiert2();
        
    }
    public void antriebAnimiert(){
        engineActive engine=new engineActive();
        getWorld().addObject(engine, getX(),getY());
        engine.setRotation(this.getRotation()-180);
        engine.moveDirectionRot=this.getRotation()-180+(Greenfoot.getRandomNumber(80)-40);
        engine.moveDirectionSpeed=Math.abs(5);

        engine.dieAtSis=Math.abs(15);
        engine.move(20);
        engine.setRotation(engine.getRotation()-90);
        engine.move(15);
        engine.setRotation(engine.getRotation()+90);

        engineActive engine2=new engineActive();
        getWorld().addObject(engine2, getX(),getY());
        engine2.setRotation(this.getRotation()-180);
        engine2.moveDirectionRot=this.getRotation()-180+(Greenfoot.getRandomNumber(80)-40);
        engine2.moveDirectionSpeed=Math.abs(5);

        engine2.dieAtSis=Math.abs(15);
        engine2.move(20);
        engine2.setRotation(engine2.getRotation()+90);
        engine2.move(15);
        engine2.setRotation(engine2.getRotation()-90);

    }
    public void antriebAnimiert2(){
        if(antriebsPartikel<=0){
           if(sendIt.shipMoveX!=0||sendIt.shipMoveY!=0){
            engine engine=new engine();
            getWorld().addObject(engine, getX(),getY());
            engine.setRotation(this.getRotation()-180);
            engine.moveDirectionRot=this.getRotation()-180;;
            engine.moveDirectionSpeed=Math.abs(2);

            engine.dieAtSis=Math.abs(75);
            engine.move(40);
            engine.setRotation(engine.getRotation()-90);
            engine.move(7);
            engine.setRotation(engine.getRotation()+90);
            engine.setRotation(engine.getRotation()+Greenfoot.getRandomNumber(180)-90);
            engine.move(0);
            engine.moveDirectionSpeed=15;
            engine.moveDirectionRot=(Greenfoot.getRandomNumber(360));
            engine.moveDirectionSpeed=1;
            engine engine2=new engine();

            getWorld().addObject(engine2, getX(),getY());
            engine2.setRotation(this.getRotation()-180);
            engine2.moveDirectionRot=this.getRotation()-180;
            engine2.moveDirectionSpeed=Math.abs(2);

            engine2.dieAtSis=Math.abs(75);
            engine2.move(40);
            engine2.setRotation(engine2.getRotation()+90);
            engine2.move(7);
            engine2.setRotation(engine2.getRotation()-90);
            engine2.setRotation(engine2.getRotation()+Greenfoot.getRandomNumber(180)-90);
            engine2.move(0);
            engine2.moveDirectionSpeed=15;
            engine2.moveDirectionRot=(Greenfoot.getRandomNumber(360));
            antriebsPartikel=8-maxSpeed;
            engine2.moveDirectionSpeed=1;
            if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("s")){
            engineActive engineActive=new engineActive();
            getWorld().addObject(engineActive, getX(),getY());
            engineActive.setRotation(this.getRotation()-180);
            engineActive.moveDirectionRot=this.getRotation()-180;;
            engineActive.moveDirectionSpeed=Math.abs(2);

            engineActive.dieAtSis=Math.abs(75);
            engineActive.move(40);
            engineActive.setRotation(engine.getRotation()-90);
            engineActive.move(7);
            engineActive.setRotation(engine.getRotation()+90);
            engineActive.setRotation(engine.getRotation()+Greenfoot.getRandomNumber(180)-90);
            engineActive.move(0);
            engineActive.moveDirectionSpeed=1;
            engineActive.moveDirectionRot=(Greenfoot.getRandomNumber(360));

            engineActive engineActive2=new engineActive();

            getWorld().addObject(engineActive2, getX(),getY());
            engineActive2.setRotation(this.getRotation()-180);
            engineActive2.moveDirectionRot=this.getRotation()-180;
            engineActive2.moveDirectionSpeed=Math.abs(2);

            engineActive2.dieAtSis=Math.abs(75);
            engineActive2.move(40);
            engineActive2.setRotation(engine2.getRotation()+90);
            engineActive2.move(7);
            engineActive2.setRotation(engine2.getRotation()-90);
            engineActive2.setRotation(engine2.getRotation()+Greenfoot.getRandomNumber(180)-90);
            engineActive2.move(0);
            engineActive2.moveDirectionSpeed=1;
            engineActive2.moveDirectionRot=(Greenfoot.getRandomNumber(360));
            antriebsPartikel=8-maxSpeed;}
         }
        }
        else
        if (antriebsPartikel>0)
            antriebsPartikel--;
    }

}
