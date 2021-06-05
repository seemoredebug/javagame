package game.controller;

import game.View.GamePanel;
import game.model.Food;
import game.model.Gamedata;
import game.model.Snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Listener extends KeyAdapter {
    private Snake snake;
    private GamePanel gamePanel;
    private Gamedata gamedata;
    private Food food;
    public Listener(Snake snake,GamePanel gamePanel,Gamedata gamedata,Food food) {
        this.gamedata=gamedata;
        this.snake = snake;
        this.gamePanel=gamePanel;
        this.food=food;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_SPACE){
            if(gamedata.isFail()){
                snake.init();
                food.newfood();
                gamedata.init();
            }
            snake.changestar();
        }
        else if (key==KeyEvent.VK_UP){
            snake.changehead("up");
        }
        else if (key==KeyEvent.VK_DOWN){
            snake.changehead("down");
        }
        else if (key==KeyEvent.VK_RIGHT){
            snake.changehead("right");
        }
        else if (key==KeyEvent.VK_LEFT){
            snake.changehead("left");
        }
        gamePanel.repaint();
    }
}
