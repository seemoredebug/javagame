package game.controller;

import game.View.GamePanel;
import game.model.Data;
import game.model.DataCinterface;

public class MyListener implements  MyC{
    private Listener listener;
    private Time time;

    public MyListener(GamePanel gamePanel, DataCinterface data) {
        time=new Time(gamePanel, (Data)data);
        listener =new Listener(gamePanel,(Data)data);
    }
    public Listener getListener(){
        return listener;
    }

}
