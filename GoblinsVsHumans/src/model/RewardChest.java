package model;

import model.RandomNumbers;

public class RewardChest {
    RandomNumbers stamina_number = new RandomNumbers();
    RandomNumbers health_number = new RandomNumbers(100);
    RandomNumbers bodyArmor_number = new RandomNumbers(50);
    RandomNumbers shield_number = new RandomNumbers(10);
    RandomNumbers sword_number = new RandomNumbers(10);
    RandomNumbers strength_number = new RandomNumbers(100);
    RandomNumbers level_number = new RandomNumbers(1,4);

    private double stamina = stamina_number.Double();
    private double health = health_number.Double();
    private double bodyArmor = bodyArmor_number.Double();
    private double shield = shield_number.Double();
    private double sword = sword_number.Double();
    private int strength = strength_number.Int();
    private int level = level_number.Int();

    RewardChest(){}
}
