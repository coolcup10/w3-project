
package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class GameObject{
int x,y,h,w;
public GameObject(int xx, int yy, int hh,int ww){
    //giving the variables the value that GameObject is getting
    x=xx;
    y=yy;
    w=ww;
    h=hh;
}
    protected abstract void update(); 
    
    protected void draw(GraphicsContext gc) { 
        gc.setFill(Color.RED);  
        gc.fillRect(x, y, w, h);
    } 
 public int return_x(){
    //returning to see if it is going to collide
    return x;
    }
    public int return_y(){
      //returning to see if it is going to collide  
    return y;
    }       
}
