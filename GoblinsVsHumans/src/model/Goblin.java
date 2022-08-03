package model;

public class Goblin extends Humanoid {
    Goblin(){}

    Goblin(String name,int Strength, double health,double stamina,int... args){
        this.setName(name);
        this.setStrength(Strength);
        this.setHealth(health);
        this.setStamina(stamina);
    }

    @Override
    public String toString(){
        //TODO create a string representation of a model.Goblin.
        return null;
    }
}
