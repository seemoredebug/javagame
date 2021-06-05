package game.model;

import javax.swing.*;
import java.net.URL;

public class FoodImage {
    private static final URL foodurl=SnakeImage.class.getResource("/image/food.png");
    private  static ImageIcon food=new ImageIcon(foodurl);
    public ImageIcon getImageIcon(){
        return food;
    }
}
