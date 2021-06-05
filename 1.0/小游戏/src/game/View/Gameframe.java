package game.View;

import javax.swing.*;
import java.awt.*;

public class Gameframe extends JFrame {
    private GamePanel gamePanel=new GamePanel();
    private HelpPanel helpPanel=new HelpPanel();
    public Gameframe(){
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
