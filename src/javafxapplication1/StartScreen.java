
package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.SPACE;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class StartScreen extends GameScreen {
    //creating all th variables
    boolean button_switch=false;
      int x1,x2,x3,y1,y2,y3,h1,h2,h3,w1,w2,w3;
      //should is a variable that will change the screen depending on what buton you pick. the number 5 is not used so i made that its defult value
      int should=0;
      double mouse_x,mouse_y;
       public StartScreen(){
          
           
           //this is setting all the x,y,height,width values for the buttons and pictures
            x1=1600;
            x2=1600;
            x3=1600;
            
            y1=350;
            y2=500;
            y3=650;
           
            h1=100;
            h2=100;
            h3=100;
           
            w1=200;
            w2=200;
            w3=200;
           
       }
       @Override
       public void buttons(MouseEvent event){
           //getting the x and y and seeing if its clicked on the button
        mouse_x= event.getX();
        mouse_y= event.getY();
        //seeing if the mouse x and y is within the first button
            if ((mouse_x > x1) && (mouse_x<x1+200)||(mouse_x > x1) && (mouse_x<x1+200)) {   
                if((mouse_y>y1)&&(mouse_y<y1+100)||(mouse_y>y1+100)&&(mouse_y<y1+100))  {
                    should=1;
                }
            }
            //seeing if the mouse x and y is within the second button
             if ((mouse_x > x2) && (mouse_x<x2+200)||(mouse_x > x2) && (mouse_x<x2+200)) {   
                if((mouse_y>y2)&&(mouse_y<y2+100)||(mouse_y>y2+100)&&(mouse_y<y2+100))  {
                   should=2;
                }
            }
             //seeing if the mouse x and y is within the third button
              if ((mouse_x > x3) && (mouse_x<x3+200)||(mouse_x > x3) && (mouse_x<x3+200)) {   
                if((mouse_y>y3)&&(mouse_y<y3+100)||(mouse_y>y3+100)&&(mouse_y<y3+100))  {
                   should=3;
                }
            }
        }
                
                
       @Override
        protected void draw(GraphicsContext gc) { 
            //background color
            gc.setFill(Color.DARKGREEN);  
            gc.fillRect(0, 0, 1920, 1080);
            //Logo
            gc.setFill(Color.OLIVEDRAB);  
            gc.fillRect(50, 50, 200, 75);           
            //bars
            gc.setFill(Color.DARKBLUE);  
            gc.fillRect(1800, 0, 50, 100);
            //bars
            gc.setFill(Color.DARKBLUE);  
            gc.fillRect(1550, 0, 50, 100);
            //background to banner
            gc.setFill(Color.DARKBLUE);  
            gc.fillRect(1500, 100, 400, 800);
            //menu bars
            gc.setFill(Color.SILVER);  
            gc.fillRect(x1, y1, w1, h1);
            gc.setFill(Color.SILVER);  
            gc.fillRect(x2, y2, w2, h2);
            gc.setFill(Color.SILVER);  
            gc.fillRect(x3, y3, w3, h3);
        }
        @Override
        public int shouldSwitch(){
            //this should return true if the button is clicked 
            return should;
        }
       
    @Override
        public void resetSwitch() {
            //this is reseting everytime you go on a new screen
        should=0;
    }

}
