package game.model;

import javax.swing.*;
import java.util.Random;

public class Food {
    private FoodImage foodImage=new FoodImage();
    private Random random=new Random();
    private Coordinate food=new Coordinate();
            //=new Coordinate((25+25*random.nextInt(20)),(25+25* random.nextInt(20)));

    public Food() {
        food.x=25+25*random.nextInt(19);
        food.y=25+25* random.nextInt(19);
    }
    public void newfood(){
        food.x=25+25*random.nextInt(19);
        food.y=25+25* random.nextInt(19);
    }
    public Coordinate getxy(){
        return food;
    }

    public ImageIcon getImageIcon(){
        return foodImage.getImageIcon();
    }
}
