package game.View;

import game.controller.Listener;
import game.controller.Time;
import game.model.Food;
import game.model.Gamedata;
import game.model.Snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
    private Snake snake=new Snake();
    private Food food=new Food();
    private Gamedata gamedata=new Gamedata();
    private Listener listener =new Listener(snake,this,gamedata,food);
    private Time time=new Time(snake,this,food,gamedata);


    GamePanel(){
        setBounds(10,20,500,500);
        setFocusable(true);
        addKeyListener(listener);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.LIGHT_GRAY);

        food.getImageIcon().paintIcon(this,g,food.getxy().x,food.getxy().y);
        snake.GetImageIcon(snake.getHead()).paintIcon(this,g,snake.GetCoordinate(0).x,snake.GetCoordinate(0).y);
        for (int i=1;i<snake.Getlenth();i++)
            snake.GetImageIcon("body").paintIcon(this,g,snake.GetCoordinate(i).x,snake.GetCoordinate(i).y);
        if(gamedata.isFail())
        {
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("失败！按空格重新开始",100,160);
            g.drawString("     得分为： "+gamedata.getCount(),100,200);
        }
    }

}
