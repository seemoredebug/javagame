package game.model;
import javax.swing.*;
import java.net.URL;

public class SnakeImage {
    private static final URL upurl=SnakeImage.class.getResource("/game/model/image/headup.png");
    private static final URL righturl=SnakeImage.class.getResource("/game/model/image/headright.png");
    private static final URL lefturl=SnakeImage.class.getResource("/game/model/image/headleft.png");
    private static final URL downurl=SnakeImage.class.getResource("/game/model/image/headdown.png");
    private static final URL bodyurl=SnakeImage.class.getResource("/game/model/image/body.png");

    private static ImageIcon up=new ImageIcon(upurl);
    private  static ImageIcon left=new ImageIcon(lefturl);
    private  static ImageIcon right=new ImageIcon(righturl);
    private  static ImageIcon down=new ImageIcon(downurl);
    private  static ImageIcon body=new ImageIcon(bodyurl);

    public ImageIcon Getimage(String s){
        if(s.equals("up"))
            return up;
        else if(s.equals("right"))
            return right;
        else if(s.equals("left"))
            return left;
        else if(s.equals("down"))
            return down;
        else
            return body;
    }
}
