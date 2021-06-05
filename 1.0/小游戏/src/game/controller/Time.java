package game.controller;

import game.View.GamePanel;
import game.model.Food;
import game.model.Gamedata;
import game.model.Snake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time implements ActionListener {
    private Snake snake;
    private GamePanel gamePanel;
    private Timer timer;
    private Food food;
    private Gamedata gamedata;

    public Time(Snake snake, GamePanel gamePanel,Food food, Gamedata gamedata) {
        this.snake = snake;
        this.gamePanel = gamePanel;
        this.food = food;
        this.gamedata = gamedata;
        timer=new Timer(100,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (snake.isstar()) {
            snake.move();
            if(snake.isFail()) {
                gamedata.change();
                snake.changestar();
            }
            if(snake.iseat(food)) {
                snake.newbody();
                food.newfood();
                gamedata.addCount();
            }
            gamePanel.repaint();
        }
        timer.start();
    }

}
