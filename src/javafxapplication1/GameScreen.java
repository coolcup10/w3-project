
package javafxapplication1;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public abstract class GameScreen  {
    Color c;
    ArrayList<GameObject> objects;
    
    public GameScreen(){
       
        objects=new ArrayList<GameObject>();
    }     
    public void buttons(MouseEvent event){ 
    }
   
    public void start(Stage primaryStage) {        
    }
    protected void update() {  
         for(int i = 0;i<objects.size();i++){
             //calling shoush switch to always check if it should and updating the enemy and player
            shouldSwitch();
            objects.get(i).update();        
        }
    } 
    protected void draw(GraphicsContext gc) { 
        //looping through to draw the enemy and player
        for(int i = 0;i<objects.size();i++){
            
            objects.get(i).draw(gc);        
        }
    } 
    public abstract int shouldSwitch();


   
    protected void resetSwitch() {
      
    }
}
