package sign;

import javax.swing.*;

public class MyDialog extends JDialog {
    private JLabel w=new JLabel("用户名或密码错误");
    public MyDialog() {

        setSize(150,100);
        add(w);
        setLocationRelativeTo(null);//居中
        setResizable(false);//不可改变大小
        setVisible(true);
    }
}
