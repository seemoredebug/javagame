package sign;

import game.View.Gameframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MybuttonListener implements ActionListener {
   private Usermassage usermassage;
   private Userfunction userfunction;
   private SignFrame signFrame;
   private Usermassage truemassage=new Usermassage("123","123");

    public MybuttonListener(Userfunction userfunction, SignFrame signFrame) {
        this.userfunction = userfunction;
        this.signFrame=signFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        usermassage=userfunction.getUsermassage();
        System.out.println(usermassage.Showname()+" "+usermassage.Showpassword());
        if(usermassage.userequals(truemassage)) {
            signFrame.setDefaultCloseOperation(0);
            signFrame.setVisible(false);
            Gameframe gameframe=new Gameframe();
        }
        }
    }

