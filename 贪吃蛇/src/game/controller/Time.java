package game.controller;

import game.View.GamePanel;
import game.model.DataCinterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time implements ActionListener {
    private GamePanel gamePanel;
    private Timer timer;
    private DataCinterface data;

    public Time(GamePanel gamePanel, DataCinterface dataCinterface) {
        data=dataCinterface;
        this.gamePanel = gamePanel;
        timer=new Timer(100,this);
        timer.start();//启动线程
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (data.isstar()) {
            data.smove();
            data.fail();
            data.eat();
            gamePanel.repaint();
        }
        timer.start();//启动线程
    }

}
