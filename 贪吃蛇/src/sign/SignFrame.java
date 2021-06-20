package sign;

import javax.swing.*;
import java.awt.*;

public class SignFrame extends JFrame {
    private JButton startbutton=new JButton("登录");
    private JTextField user=new JTextField();
    private JPasswordField password=new JPasswordField();
    private JPanel jPanel=new JPanel();
    private JLabel one=new JLabel("用户名");
    private JLabel two=new JLabel("密码");
    public SignFrame(){
        super("登录");
        Container container=this.getContentPane();
        container.setLayout(null);
        MyListener mybuttonListener =new MyListener(this);
        one.setBounds(30,30,40,30);
        two.setBounds(30,130,30,30);
        startbutton.addActionListener(mybuttonListener);
        user.setBounds(80,30,150,40);
        password.setBounds(80,130,150,40);
        startbutton.setBounds(70,230,100,50);

        container.add(one);
        container.add(two);
        container.add(user);
        container.add(password);
        container.add(startbutton);
        container.add(jPanel);

        setSize(350,350);
        setLocationRelativeTo(null);//居中
        setResizable(false);//不可改变大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public Userfunction getUsermassage(){
        return new Usermassage(user.getText(), String.valueOf(password.getPassword()));
    }
}
