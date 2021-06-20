package game.model;

import javax.swing.*;
import java.util.List;

public interface Datainterface {
    public Coordinate getsnakeHead();
    public List<Coordinate> getsnakeBody();
    public Coordinate getfood();
    public boolean isfail();
    public ImageIcon getImageIcon(String s);
    public String getHead();
    public int getCount();
}
