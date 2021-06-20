package game.View;

import game.controller.MyC;
import game.controller.MyListener;
import game.model.Coordinate;
import game.model.Data;
import game.model.Datainterface;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
    private Datainterface data;
    private MyC myC;


    GamePanel(Datainterface a){
        data =a;
        myC=new MyListener(this ,(Data)data);
        setBounds(10,20,500,500);
        setFocusable(true);
        addKeyListener(myC.getListener());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.LIGHT_GRAY);

        data.getImageIcon("food").paintIcon(this,g,data.getfood().getX(),data.getfood().getY());
        data.getImageIcon(data.getHead()).paintIcon(this,g,data.getsnakeHead().getX(),data.getsnakeHead().getY());
        for (Coordinate c:data.getsnakeBody())
            data.getImageIcon("body").paintIcon(this,g,c.getX(),c.getY());
        if(data.isfail())
        {
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("失败！按空格重新开始",100,160);
            g.drawString("     得分为： "+data.getCount(),100,200);
        }
    }

}
