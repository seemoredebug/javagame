package game.model;

import javax.swing.*;
import java.util.Random;

public class Food {
    private Random random=new Random();
    private FoodImage foodImage=new FoodImage();
    private Coordinate food=new Coordinate(25+25* random.nextInt(19),25+25* random.nextInt(19));
            //=new Coordinate((25+25*random.nextInt(20)),(25+25* random.nextInt(20)));
    public void init(){
        food.setX(25+25* random.nextInt(19));
        food.setY(25+25* random.nextInt(19));
    }
    public Coordinate getxy(){
        return food;
    }

    public ImageIcon getImageIcon(){
        return foodImage.getImageIcon();
    }
}
