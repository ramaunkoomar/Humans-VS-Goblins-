package view;
import model.Land;
import javax.swing.*;
import java.awt.*;

public class LandDraw extends JComponent {
    private final int width = 800;
    private final int height = 800;
    Dimension size = new Dimension(width,height);
    Land land = new Land();

    LandDraw(){
        this.setPreferredSize(size);
    }
    public void paintComponent(Graphics g){
        g.setColor(land.getColor());
        drawLand(g);
    }

    public void drawLand(Graphics g){
        for(int x = 0; x<(width/2)+225; x+= land.getWidth()){
            for(int y = 0; y<(height/2)+225; y+= land.getHeight()){
                g.setColor(land.getColor());
                g.fillRect(land.getX() + x, land.getY() + y, land.getWidth(), land.getHeight());
            }
        }
    }

}
