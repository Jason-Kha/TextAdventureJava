package src.main.java.game;

import src.main.java.Items.Backpack;

public class Actor extends Thing {

    private int level;
    private int maxHealth;
    private Room location;
    private Backpack backpack;

    public Actor(String name, String description, Room room) {
        super(name, description);
        this.location = room;
        this.backpack = new Backpack(name, description, 10);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
}
