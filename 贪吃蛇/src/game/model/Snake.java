package game.model;

import javax.swing.*;
import java.util.ArrayList;

public class Snake {
   // private Coordinate[] snake;//0是蛇头，其余的是蛇的身体
    private SnakeImage snakeImage=new SnakeImage();
    private int len;
    private int lenmax=100;
    private String head;
    private boolean star;
    private ArrayList<Coordinate> snake;

    public Snake(){
        snake=new ArrayList<Coordinate>(lenmax);
        snake.add(new Coordinate(50,0));
        snake.add(new Coordinate(25,0));
        snake.add(new Coordinate(0,0));
        head="right";
    }
    public void init(){
        if(!snake.isEmpty())
        snake.clear();
        snake=new ArrayList<Coordinate>(lenmax);
        snake.add(new Coordinate(50,0));
        snake.add(new Coordinate(25,0));
        snake.add(new Coordinate(0,0));
        head="right";
    }
    public ArrayList<Coordinate> GetCoordinate(){
        return snake; }
    public int getLen(){
        return snake.size();
    }
    public String getHead(){
        return head;
    }
    public ImageIcon GetImageIcon(String s){
        return snakeImage.Getimage(s);
    }
    public  void changehead(String s){
        head=s;
    }
    public  void newbody(){
        snake.add(new Coordinate(snake.get(snake.size()-1).getX(),snake.get(snake.size()-1).getY()));
    }

}
