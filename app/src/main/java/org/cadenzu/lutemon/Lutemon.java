package org.cadenzu.lutemon;

public class Lutemon {
    protected String name;
    protected String color;
    protected int attack;
    protected int defense;
    protected int exp;
    protected int health;
    protected int maxHealth;
    protected int id;
    private int idCounter;

    public Lutemon(String name, String color,
                   int attack, int defense, int exp,
                   int health, int maxHealth,
                   int id, int idCounter) {
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defense = defense;
        this.exp = exp;
        this.health = health;
        this.maxHealth = maxHealth;
        this.id = id;
        this.idCounter = idCounter;
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

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }
}
