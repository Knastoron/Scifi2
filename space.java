 import greenfoot.*;
import java.lang.Math;
import javax.swing.JOptionPane;
/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{
    public ship player = new ship();
    GreenfootImage background = this.getBackground();
    float shipMoveX=0;
    float shipMoveY=0;
    float shipPosX=1280;
    float shipPosY=1280;
    int scrollX =0;  
    int scrollY =0; 
    int scroll2X= 0;
    int scroll2Y= -720;
    int scroll3X= -1280;
    int scroll3Y= 0;
    int scroll4X= -1280;
    int scroll4Y= -720;
    int scrollsX =0;  
    int scrollsY =0; 
    int scroll2sX= 0;
    int scroll2sY= -720;
    int scroll3sX= -1280;
    int scroll3sY= 0;
    int scroll4sX= -1280;
    int scroll4sY= -720;
    int testCD;
    int soundCD;
    int material;
    int material2;
    double Entfernung;
    GreenfootSound Music;
    int time;
    Dispatcher dispatcher = new Dispatcher();
    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    

        
        super(1280, 720, 1,false); 
        addObject(player,640,360);
        addObject(dispatcher,0,0);
        player.sendIt=this;
        setPaintOrder(energyBar.class,
            // turret.class,
            ship.class,asteroids.class);
        Greenfoot.start();
        // Music= new GreenfootSound("PensMusicLeise.mp3");
        // Music.playLoop();
        // this.addObject(new HUD(),640,360);
       
        prepare();
    }


    public void act(){
        Office();
       
        // asteroidenGen();gegnerGen();
        // testThisApple();
        this.showText(""+material, 1000, 95);
        this.showText(""+material2, 1100, 95);
       this.showText("X: "+shipPosX, 300, 95);
        this.showText("Y: "+shipPosY, 200, 95);
       
        
        time++;
        
//         if(testCD>0)testCD--;
//         Entfernung = Math.sqrt((shipPosX*shipPosX+shipPosY*shipPosY));
//         
//         
//         if(Math.abs(shipPosX)+Math.abs(shipPosY)>1000000){
//        
//              JOptionPane.showMessageDialog(null,"deine Zeit in Ticks"+time,"GG gewonnen",JOptionPane.PLAIN_MESSAGE);
//              Greenfoot.stop();
//             }
    }
    
    public void asteroidenGen(){
         if(Entfernung>5000&&Entfernung<10000){
            int G=Greenfoot.getRandomNumber(3000);
            asteroids A=new asteroids();
            if(G==1){

                int i=Greenfoot.getRandomNumber(4);
                if(i==0){   
                    this.addObject(A,1,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==1){  
                    this.addObject(A,1,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==2){   
                    this.addObject(A,10000,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY+300;
                }
                else if(i==3){    
                    this.addObject(A,10000,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY+300;
                }
            }}
        else if(Entfernung>10000&&Entfernung<12000){
            int G=Greenfoot.getRandomNumber(700);
            asteroids A=new asteroids();
            if(G==1){

                int i=Greenfoot.getRandomNumber(4);
                if(i==0){   
                    this.addObject(A,1,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==1){  
                    this.addObject(A,1,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==2){   
                    this.addObject(A,10000,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY+300;
                }
                else if(i==3){    
                    this.addObject(A,10000,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY+300;
                }
            }
         }
            else if(Entfernung>12000&&Entfernung<22000){
            int G=Greenfoot.getRandomNumber(3000);
            asteroids A=new asteroids();
            if(G==1){

                int i=Greenfoot.getRandomNumber(4);
                if(i==0){   
                    this.addObject(A,1,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==1){  
                    this.addObject(A,1,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==2){   
                    this.addObject(A,10000,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY+300;
                }
                else if(i==3){    
                    this.addObject(A,10000,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY+300;
                }
            }
         }
            else if(Entfernung>22000){
            int G=Greenfoot.getRandomNumber(5000);
            asteroids A=new asteroids();
            if(G==1){

                int i=Greenfoot.getRandomNumber(4);
                if(i==0){   
                    this.addObject(A,1,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==1){  
                    this.addObject(A,1,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY-300;
                }
                else if(i==2){   
                    this.addObject(A,10000,10000);
                    // A.relatX=shipPosX+300;
                    // A.relatY=shipPosY+300;
                }
                else if(i==3){    
                    this.addObject(A,10000,1);
                    // A.relatX=shipPosX-300;
                    // A.relatY=shipPosY+300;
                }
            }}
        
    }

    public ship spielerReturn(){
        return player;
    }

    public void gegnerGen(){
         if(Entfernung>12000&&Entfernung<22000){
        int G=Greenfoot.getRandomNumber(2000);
        Brawler B=new Brawler();
        if(G==1){

            int i=Greenfoot.getRandomNumber(4);
            if(i==0){    
                this.addObject(B,1,1);
                // B.relatX=shipPosX-300;
                // B.relatY=shipPosY-300;
            }
            else if(i==1){    
                this.addObject(B,1,3000);
                // B.relatX=shipPosX+300;
                // B.relatY=shipPosY-300;
            }
            else if(i==2){    
                this.addObject(B,3000,3000);
                // B.relatX=shipPosX+300;
                // B.relatY=shipPosY+300;
            }
            else if(i==3){
                this.addObject(B,3000,1);
                // B.relatX=shipPosX-300;
                // B.relatY=shipPosY+300;
            }
            else 
            B.moveSpeed=Math.abs(player.speed);
            B.speed=Math.abs(player.speed);
        }
      }
      else      if(Entfernung>22000){
        int G=Greenfoot.getRandomNumber(1000);
        Brawler B=new Brawler();
        if(G==1){

            int i=Greenfoot.getRandomNumber(4);
            if(i==0){    
                this.addObject(B,1,1);
                // B.relatX=shipPosX-300;
                // B.relatY=shipPosY-300;
            }
            else if(i==1){    
                this.addObject(B,1,3000);
                // B.relatX=shipPosX+300;
                // B.relatY=shipPosY-300;
            }
            else if(i==2){    
                this.addObject(B,3000,3000);
                // B.relatX=shipPosX+300;
                // B.relatY=shipPosY+300;
            }
            else if(i==3){
                this.addObject(B,3000,1);
                // B.relatX=shipPosX-300;
                // B.relatY=shipPosY+300;
            }
            else 
            B.moveSpeed=Math.abs(player.speed);
            B.speed=Math.abs(player.speed);
        }
      }
    }
    // public void testThisASTI(){

    // if(Greenfoot.isKeyDown(".")&&testCD==0){
    // asteroids T= new asteroids();
    // addObject(T,200,200);
    // T.koordGeber=this;
    // testCD=50;
    // }
    // if(testCD>0)testCD--;
    // }

    public void testThisApple(){
        if(Greenfoot.isKeyDown("u")){
            testApfel T= new testApfel();
            addObject(T,420,420);
            T.koordGeber=this;testCD=20;
        }
    }

   
    public void Office(){
        shipPosX=shipPosX+shipMoveX;
        shipPosY=shipPosY+shipMoveY;

        scrollX=scrollX+(int)(shipMoveX/1.0);
        scrollY=scrollY+(int)(shipMoveY/1.0);
        scroll2X=scroll2X+(int)(shipMoveX/1.0);
        scroll2Y=scroll2Y+(int)(shipMoveY/1.0);
        scroll3X=scroll3X+(int)(shipMoveX/1.0);
        scroll3Y=scroll3Y+(int)(shipMoveY/1.0);
        scroll4X=scroll4X+(int)(shipMoveX/1.0);
        scroll4Y=scroll4Y+(int)(shipMoveY/1.0);
        
        // scrollsX=scrollsX+(int)(shipMoveX/2);
        // scrollsY=scrollsY+(int)(shipMoveY/2);
        // scroll2sX=scroll2sX+(int)(shipMoveX/2);
        // scroll2sY=scroll2sY+(int)(shipMoveY/2);
        // scroll3sX=scroll3sX+(int)(shipMoveX/2);
        // scroll3sY=scroll3sY+(int)(shipMoveY/2);
        // scroll4sX=scroll4sX+(int)(shipMoveX/2);
        // scroll4sY=scroll4sY+(int)(shipMoveY/2);
        
        Pic1();
        Pic2();
        Pic3();
        Pic4();
       
        scrollV2();
    }

    public void Pic1(){
        if(scrollX<=-1280)
            scrollX=scrollX+2560;
        else if(scrollX>=1280)
            scrollX=scrollX-2560;

        if(scrollY>=720) 
            scrollY=scrollY-1440;
        else if(scrollY<=-720)
            scrollY=scrollY+1440;

    }
   public void stars(){
        if(scrollsX<=-1280)
            scrollsX=scrollsX+2560;
        else if(scrollsX>=1280)
            scrollsX=scrollsX-2560;

        if(scrollsY>=720) 
            scrollsY=scrollsY-1440;
        else if(scrollsY<=-720)
            scrollsY=scrollsY+1440;
            
            
       if(scroll2sX<=-1280)
            scroll2sX=scroll2sX+2560;
        else if(scroll2sX>=1280)
            scroll2sX=scroll2sX-2560;

        if(scroll2sY>=720) 
            scroll2sY=scroll2sY-1440;
        else if(scroll2Y<=-720)
            scroll2sY=scroll2sY+1440;
            
            
            if(scroll3sX<=-1280)
            scroll3sX=scroll3sX+2560;
        else if(scroll3sX>=1280)
            scroll3sX=scroll3sX-2560;

        if(scroll3sY>=720) 
            scroll3sY=scroll3sY-1440;
        else if(scroll3Y<=-720)
            scroll3sY=scroll3sY+1440;
            
            
         if(scroll4sX<=-1280)
            scroll4sX=scroll4sX+2560;
        else if(scroll4sX>=1280)
            scroll4sX=scroll4sX-2560;

        if(scroll4sY>=720) 
            scroll4sY=scroll4sY-1440;
        else if(scroll4Y<=-720)
            scroll4sY=scroll4sY+1440;   
            
    }
    
    public void Pic2(){
        if(scroll2X<=-1280)
            scroll2X=scroll2X+2560;
        else if(scroll2X>=1280)
            scroll2X=scroll2X-2560;

        if(scroll2Y>=720) 
            scroll2Y=scroll2Y-1440;
        else if(scroll2Y<=-720)
            scroll2Y=scroll2Y+1440; 

    }

    public void Pic3(){
        if(scroll3X<=-1280)
            scroll3X=scroll3X+2560;
        else if(scroll3X>=1280)
            scroll3X=scroll3X-2560;

        if(scroll3Y>=720) 
            scroll3Y=scroll3Y-1440;
        else if(scroll3Y<=-720)
            scroll3Y=scroll3Y+1440;

    }
    public void Pic4(){
        if(scroll4X<=-1280)
            scroll4X=scroll4X+2560;
        else if(scroll4X>=1280)
            scroll4X=scroll4X-2560;

        if(scroll4Y>=720) 
            scroll4Y=scroll4Y-1440;
        else if(scroll4Y<=-720)
            scroll4Y=scroll4Y+1440;

    }

    public void scrollV2(){

        background.drawImage(new GreenfootImage( "backgroundfinal 1.jpg"),scrollX, scrollY);

        background.drawImage(new GreenfootImage( "backgroundfinal 2.jpg"),scroll3X, scroll3Y);
        background.drawImage(new GreenfootImage( "backgroundfinal 3.jpg"),scroll4X, scroll4Y);
        background.drawImage(new GreenfootImage( "backgroundfinal 4.jpg"),scroll2X, scroll2Y);
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
