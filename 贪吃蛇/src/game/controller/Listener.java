package game.controller;

import game.View.GamePanel;
import game.model.DataCinterface;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Listener extends KeyAdapter {
    private GamePanel gamePanel;
    private DataCinterface data;
    public Listener(GamePanel gamePanel,DataCinterface data) {
        this.gamePanel=gamePanel;
        this.data=data;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_SPACE){
            if(data.isfail()){
                data.initall();//初始化结束后star出于暂停状态
                data.changestar();//改变开始状态，使失败后不立即开始而是出于暂停状态
            }
           data.changestar();
        }
        else if (key==KeyEvent.VK_UP){
            data.changeHead("up");
        }
        else if (key==KeyEvent.VK_DOWN){
            data.changeHead("down");
        }
        else if (key==KeyEvent.VK_RIGHT){
            data.changeHead("right");
        }
        else if (key==KeyEvent.VK_LEFT){
            data.changeHead("left");
        }
        gamePanel.repaint();
    }
}
