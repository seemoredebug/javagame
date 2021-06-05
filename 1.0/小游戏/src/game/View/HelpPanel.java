package game.View;

import javax.swing.*;
import java.awt.*;

public class HelpPanel extends JPanel {
    private JLabel one=new JLabel("空格开始和暂停");
    HelpPanel(){
        setBounds(520,20,120,500);
        setBackground(Color.lightGray);
        add(one);
    }
}
