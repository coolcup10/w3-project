/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;

/**
 *
 * @author pwd11
 */
public class Description extends GameScreen{
    double mouse_x,mouse_y;
    int should=5;
    public Description() {
         
    }
   
    
   @Override
       public void buttons(MouseEvent event){
           //getting the x and y and seeing if its clicked on the button
        mouse_x= event.getX();
        mouse_y= event.getY();
        //seeing if the mouse x and y is within the first button
            if ((mouse_x > 1350) && (mouse_x<1350+200)||(mouse_x > 1350) && (mouse_x<1350+200)) {   
                if((mouse_y>700)&&(mouse_y<700+100)||(mouse_y>700+100)&&(mouse_y<700+100))  {
                   should=0;  
                }
            }
       }
    
    @Override
    public void draw(GraphicsContext gc){
        //Background color
        gc.setFill(Color.GREEN);  
        gc.fillRect(0, 0, 1920, 1080);
        //bars
        gc.setFill(Color.DARKBLUE);  
        gc.fillRect(1800, 0, 50, 100);
        //bars
        gc.setFill(Color.DARKBLUE);  
        gc.fillRect(1050, 0, 50, 100);
        //background to banner
        gc.setFill(Color.DARKBLUE);  
        gc.fillRect(1000, 100, 900, 800);
        //this is a button
        gc.setFill(Color.SILVER);  
        gc.fillRect(1350, 700, 200, 100);
        //drawing all the text to teh screen
        gc.setFill(Color.BISQUE);
        // this will set the font and the size
        gc.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        gc.fillText("When the game is generated, you will start off with a castle and a worker. These workers  will be able to build", 1050, 150,800);
        gc.fillText(" buildings to expand your kingdom. Buildings will have different Buildings will have different functions depending ", 1050,200 ,800);
        gc.fillText("on the building type (ex: Barracks makes troops and Factories can make vehicles). Workers will also have the ability to cut down",1050 , 250,800);
        gc.fillText(" trees to get wood for building or get gold out of gold mines to buy troops and expand your kingdom further. These gold mines ",1050 , 300,800);
        gc.fillText(" will be scarce and trees will be limited so you must use your resources wisely.You will not be alone on your quest to rule the land. ", 1050, 350,800);
        gc.fillText(" Throughout the lands, enemies known as orcs will be building their own castles and armies to try and take your castle over. You must  ",1050 , 400,800);
        gc.fillText("think tactically whether you want to defend from orc attacks or bring your army in to the heart of the danger and destroy your enemies.", 1050, 450,800);
        gc.fillText("There will be hidden gold mines around the map so you can get more gold but be careful, Animals have made refuge in these mines and Goblins ",1050 , 500,800);
        gc.fillText("won't give their gold up that easy. Goblins won't give their gold up that easy. Upgrades will be purchasable for a price to strengthen ", 1050, 550,800);
        gc.fillText("your armies and get more soldiers. To win the game you will have to defeat the orcs that inhabit the lands you plan to make a legacy upon. ", 1050, 600,800); 
    }
     @Override
    public int shouldSwitch() {
        return should;
    }
    @Override
        public void resetSwitch() {
            //reseting each time you go on the screen
        should=5;
    }
}
