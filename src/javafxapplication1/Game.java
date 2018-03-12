// this was mostly done my matthew c kinda like 80% of it 
package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext; 
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.SPACE;
import static javafx.scene.input.KeyCode.UP;

import javafx.scene.input.KeyEvent; 

import javafx.scene.input.MouseEvent; 

import javafx.scene.paint.Color; 

 

 

public class Game { 
//creating mutiplescreen variables
GameScreen activescreen;
StartScreen ss;
LevelOne lo;
Description dd;
Exit ex;
int count;
    public Game(GameFramework gf) { 
       //this is initializing all the variables 
        count=0;
        lo=new LevelOne();
        ss=new StartScreen();
        ex=new Exit();
        dd=new Description();
        activescreen=ss;
        gf.setWindow("My Game", 1920, 1080, Color.WHITE); 

    } 
    protected void initialize() { 
              
    } 
    protected void keyPressed(KeyEvent event) {     
         }
     
    protected void keyReleased(KeyEvent event) { 
    } 
    protected void mousePressed(MouseEvent event) {
        
        if(activescreen==ss){
            //passing the x and y of the mouse 
            activescreen.buttons(event);
          
        }
                if(activescreen==dd){
            //passing the x and y of the mouse 
            activescreen.buttons(event);
          
        }
    }    
    protected void mouseReleased(MouseEvent event) { 
    } 
    protected void update(float dt) { 
        
            //this is checking if  the first button on the screen was pushed
         if ( activescreen.shouldSwitch()==1 && activescreen==ss){
             System.out.println(activescreen);
             //this is reseting the switch so you can go back and forth on screens
            activescreen.resetSwitch();
            activescreen = lo; 
        }
         //this is checking if the second button on the screen was pushed 
          if (activescreen.shouldSwitch()==2 && activescreen==ss){
               System.out.println(activescreen);
               //this is reseting the switch so you can go back and forth on screens
               activescreen.resetSwitch();
            activescreen = dd; 
        }
          //this will change the game screen when you die to the ending screen
         if (activescreen.shouldSwitch()==3 && activescreen==lo){
              System.out.println(activescreen);
              //this is reseting the switch so you can go back and forth on screens
              activescreen.resetSwitch();
            activescreen = ex; 
        }
          if (activescreen.shouldSwitch()==3 && activescreen==ss){
               System.out.println(activescreen);
               activescreen.resetSwitch();
            System.exit(0);
        }
          // description to start screen
          if (activescreen.shouldSwitch()==0 && activescreen==dd){
               System.out.println(activescreen);
               //this is reseting the switch so you can go back and forth on screens
               activescreen.resetSwitch();
            activescreen = ss; 
        }
         //updating the activescreen
        activescreen.update();
    } 

 

    protected void draw(GraphicsContext gc) { 
 
        //drawing the activescreen
    activescreen.draw(gc);
    
        

    } 

} 