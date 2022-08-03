package model;

import java.awt.*;

public class Land {

    RandomNumbers red = new RandomNumbers(5);
    RandomNumbers green = new RandomNumbers(90,115);
    RandomNumbers blue = red;
    private int x = 80+1;
    private int y = 80-4;
    private int width = 20;
    private int height = 20;

    public Land(){
    }

    public Land(int squares) {
        this.setHeight(squares);
        this.setWidth(squares);
    }

    public Land(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
    }

    //Setters
    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setColor (Color color){
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    //Getters
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Color getColor() {
        return new Color(red.Int(), green.Int(), blue.Int());
    }

    //Methods

}

