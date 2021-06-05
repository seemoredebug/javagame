package game.model;

import javax.swing.*;

public class Snake {
    private Coordinate[] snake;//0是蛇头，其余的是蛇的身体
    private SnakeImage snakeImage=new SnakeImage();
    private int len=3;
    private String head="right";
    private boolean star=false;
    public Snake(){
        snake=new Coordinate[100];
        snake[0]=new Coordinate();
        snake[0].x=50;
        snake[0].y=0;
        snake[1]=new Coordinate();
        snake[1].x=25;
        snake[1].y=0;
        snake[2]=new Coordinate();
        snake[2].x=0;
        snake[2].y=0;
    }
    public void init(){
        snake=new Coordinate[100];
        snake[0]=new Coordinate();
        snake[0].x=50;
        snake[0].y=0;
        snake[1]=new Coordinate();
        snake[1].x=25;
        snake[1].y=0;
        snake[2]=new Coordinate();
        snake[2].x=0;
        snake[2].y=0;
        head="right";
        len=3;
        star=false;
    }
    public Coordinate GetCoordinate(int i){
        return snake[i];
    }
    public int Getlenth(){
        return len;
    }
    public String getHead(){
        return head;
    }
    public ImageIcon GetImageIcon(String s){
        return snakeImage.Getimage(s);
    }
    public void changestar(){
        star=!star;
    }
    public void move(){
        for (int i=len-1;i>0;i--){
            snake[i].x=snake[i-1].x;
            snake[i].y=snake[i-1].y;
        }
        if(head.equals("right"))
            snake[0].x+=25;
        else if(head.equals("up"))
            snake[0].y-=25;
        else if(head.equals("left"))
            snake[0].x-=25;
        else if(head.equals("down"))
            snake[0].y+=25;

        if(snake[0].x>500)
            snake[0].x=0;
        else if(snake[0].x<0)
            snake[0].x=500;

        if(snake[0].y>500)
            snake[0].y=0;
        else if(snake[0].y<0)
            snake[0].y=500;
    }
    public  void changehead(String s){
        head=s;
    }
    public boolean isstar(){
        return star;
    }
    public  boolean iseat(Food food){
        if(snake[0].x==food.getxy().x&&snake[0].y==food.getxy().y)
            return true;
        else
            return false;
    }
    public  void newbody(){
        snake[len]=new Coordinate();
        len++;
    }
    public boolean isFail(){
        for(int i=1;i<len;i++)
            if(snake[0].x==snake[i].x&&snake[0].y==snake[i].y)
                return true;
            return false;
    }

}
