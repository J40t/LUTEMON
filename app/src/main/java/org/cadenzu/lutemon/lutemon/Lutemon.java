package org.cadenzu.lutemon.lutemon;

public class Lutemon {
    protected String name;
    protected String color;

    protected int image;
    protected int attack;
    protected int defense;
    protected int exp;
    protected int expRoof;
    protected int health;
    protected int maxHealth;
    protected int id;
    private static int idCounter = 0;

    public Lutemon(String name, String color,
                   int attack, int defense, int exp, int expRoof,
                   int health, int maxHealth,
                   int id) {
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defense = defense;
        this.exp = exp;
        this.expRoof = expRoof;
        this.health = maxHealth; // The Lutemon has max health when created.
        this.maxHealth = maxHealth;
        this.id = getNewId(); // id gets incremented by one after a new object is created.
        this.idCounter = idCounter; // keeps count on how many ids have been created.
    }

    public void incrementExperience() {
        exp++;
        if (exp >= expRoof) {
            incrementStatAttack();
            exp = 0;
        }
    }

    public void incrementStatAttack() {
        attack++;
    }

    public int getNewId() {
        int newId = idCounter;
        idCounter++;
        return newId;

    }

    /////////////GETTERS AND SETTERS/////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getImage() {
        return image;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getExp() {
        return exp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
