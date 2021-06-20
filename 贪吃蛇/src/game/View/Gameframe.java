package game.View;

import game.model.Data;

import javax.swing.*;
import java.awt.*;

public class Gameframe extends JFrame {
    private Data data=new Data();
    private GamePanel gamePanel =new GamePanel(data);
    private HelpPanel helpPanel=new HelpPanel();
    public Gameframe(){
        super("游戏");
        Container container=this.getContentPane();
        container.add(gamePanel);
        container.add(helpPanel);


        setSize(650,570);
        setLayout(null);
        setResizable(false);//不可改变大小
        setLocationRelativeTo(null);//居中
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
