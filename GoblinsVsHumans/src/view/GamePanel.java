package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int OBJECT_SIZE = 40;
    static final int GAME_OBJECT = (SCREEN_WIDTH*SCREEN_HEIGHT)/OBJECT_SIZE;
    boolean gameRun = false;
    LandDraw land = new LandDraw();

    public GamePanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        gameStart();
    }

    public void gameStart(){
        gameRun = true;
        add(land);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public void move(){}
    public void checkCollide(){}
    public void gameOver(Graphics g){}

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
