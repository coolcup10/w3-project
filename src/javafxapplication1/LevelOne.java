package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class LevelOne extends GameScreen {
    int x,y;
    int should;
    public LevelOne(){   
    } 
    @Override
    public int shouldSwitch(){
        return 7;
    } 
    @Override
        public void resetSwitch() {
        should=5;
    }
    @Override 
    protected void draw(GraphicsContext g) {
        //Makes the green for the main screen
        g.setFill(Color.GREEN);
        g.fillRect(0, 0, 1920, 1080);    
        //Make Grey boarders to hold buttons, maps, and graphs
        g.setFill(Color.GREY);
        g.fillRect(0, 0, 1920, 100);
        g.fillRect(0, 0, 300, 1080);
        
        //Silver button menu
        g.setFill(Color.SILVER);
        g.fillRect(25, 200, 250, 825);       
        //Map
        g.setFill(Color.GREEN);
        g.fillRect(25, 25, 250, 150);

        Line line = new Line();
        line.setStartX(25.0f);
        line.setStartY(25.0f);
        line.setEndX(225.0f);
        line.setEndY(25.0f);   
  
    } 


}
