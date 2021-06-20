package sign;

import game.View.Gameframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
   private Userfunction userfunction;
   private SignFrame signFrame;
   private Usermassage truemassage=new Usermassage("123","123");

    public MyListener( SignFrame signFrame) {
        this.signFrame=signFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userfunction=signFrame.getUsermassage();
        if(userfunction.userequals(truemassage)) {
            signFrame.setDefaultCloseOperation(0);
            signFrame.setVisible(false);
            Gameframe gameframe=new Gameframe();
        }
        else{
            MyDialog myDialog=new MyDialog();
        }
        }
    }

