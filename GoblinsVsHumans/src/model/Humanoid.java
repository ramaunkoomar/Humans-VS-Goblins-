package model;

public class Humanoid {
    public String name;
    public double health = 100.0;
    public int strength = 10;
    public double stamina = 100.0; //percentage of opponents strength effectiveness

    Humanoid(){}
    Humanoid(String name,double health, int strength, double stamina){
        this.setName(name);
        this.setHealth(health);
        this.setStrength(strength);
        this.setStamina(stamina);
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setHealth(double health){
        this.health = health;
        if(this.health < 0){
            this.health = 0;
        }
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setStamina(double stamina){
        this.stamina = stamina;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public double getHealth(){
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public double getStamina() {
        return this.stamina;
    }
}
