package model;

public class Human extends Humanoid {
    public int shield = 0;
    public int sword = 0;
    public int bodyArmor = 0;
    public boolean hasArmor = false;
    public boolean hasShield = false;
    public boolean hasSword = false;

    Human(){}

    Human(String name,int strength,double health,double stamina,int... args){
        this.setName(name);
        this.setStrength(strength);
        this.setHealth(health);
        this.setStamina(stamina);
        this.setShield(args[0]);
        this.setSword(args[1]);
        this.setBodyArmor(args[2]);
    }

    //Setters
    public void setShield(int shield) {
        this.shield = shield;
        if (this.shield > 0){
            this.hasShield = true;
        }
    }

    public void setSword(int sword) {
        this.sword = sword;
        if(this.sword > 0) {
            this.hasSword = true;
        }
    }

    public void setBodyArmor (int bodyArmor){
        this.bodyArmor = bodyArmor;
        if(this.bodyArmor > 0){
            this.hasArmor = true;
        }
    }

    //Getters
    public int getShield(){
        return this.shield;
    }

    public int getSword(){
        return this.sword;
    }

    public int getBodyArmor(){
        return this.bodyArmor;
    }

    @Override
    public String toString(){
        //TODO create a string representation of a model.Human.
        return null;
    }

    public void checkInventory(){
        if(this.getShield() > 0) {
            this.hasShield = true;
        } else {
            this.hasShield = false;
        }

        if(this.getSword() > 0) {
            this.hasSword = true;
        } else {
            this.hasSword = false;
        }

        if(this.getBodyArmor() > 0) {
            this.hasArmor = true;
        } else {
            this.hasArmor = false;
        }
    }
}
