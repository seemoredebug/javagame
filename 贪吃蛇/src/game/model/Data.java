package game.model;

import javax.swing.*;
import java.util.List;

public class Data implements Datainterface,DataCinterface{
    protected Snake snake;
    protected Food food;
    protected Gamedata gamedata;

    @Override
    public ImageIcon getImageIcon(String s) {
        if(s.equals("food"))
            return food.getImageIcon();
        else {
            return snake.GetImageIcon(s);
        }
    }

    @Override
    public String getHead() {
        return snake.getHead();
    }

    public Data() {
        this.snake = new Snake();
        this.food = new Food();
        this.gamedata = new Gamedata();
    }

    @Override
    public int getCount() {
        return gamedata.getCount();
    }

    @Override
    public Coordinate getsnakeHead() {
        return snake.GetCoordinate().get(0);
    }

    @Override
    public List<Coordinate> getsnakeBody() {
        return snake.GetCoordinate().subList(1,snake.getLen());
    }

    @Override
    public Coordinate getfood() {
        return food.getxy();
    }

    @Override
    public boolean isfail() {
        return gamedata.isFail();
    }

    @Override
    public void eat() {
        if(getsnakeHead().getX()==getfood().getX()&&getsnakeHead().getY()==getfood().getY())
        {
            snake.newbody();
            food.init();
            gamedata.addCount();
        }
    }

    @Override
    public void fail() {
        int x=getsnakeHead().getX();
        int y=getsnakeHead().getY();
        for (Coordinate a:getsnakeBody())
            if(a.getX()==x&&a.getY()==y) {
                changefail();
                changestar();
            }
    }

    @Override
    public void changeHead(String s) {
        snake.changehead(s);
    }

    @Override
    public boolean isstar() {
        return gamedata.isStar();
    }

    @Override
    public void changefail() {
        gamedata.changeFail();
    }

    @Override
    public void changestar() {
        gamedata.changeStar();
    }

    @Override
    public void smove() {
        for (int i=snake.getLen()-1;i>0;i--){
            snake.GetCoordinate().get(i).setX(snake.GetCoordinate().get(i-1).getX());
            snake.GetCoordinate().get(i).setY(snake.GetCoordinate().get(i-1).getY());
        }
        if(snake.getHead().equals("right"))
            getsnakeHead().setX(getsnakeHead().getX() + 25);
        else if(snake.getHead().equals("up"))
            getsnakeHead().setY(getsnakeHead().getY() - 25);
        else if(snake.getHead().equals("left"))
            getsnakeHead().setX(getsnakeHead().getX() - 25);
        else if(snake.getHead().equals("down"))
            getsnakeHead().setY(getsnakeHead().getY() + 25);

        if(getsnakeHead().getX()>499)
            getsnakeHead().setX(0);
        else if(getsnakeHead().getX()<0)
            getsnakeHead().setX(500);

        if(getsnakeHead().getY()>499)
            getsnakeHead().setY(0);
        else if(getsnakeHead().getY()<0)
            getsnakeHead().setY(500);
    }

    @Override
    public void initall() {
        snake.init();
        food.init();
        gamedata.init();
    }

}
