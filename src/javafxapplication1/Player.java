package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player extends GameObject{
  
    public Player(int x,int y){
        super(x,y,50,50);
        
    }
        
        @Override
        protected void update() {     
            y+=1;
    } 
   
}
