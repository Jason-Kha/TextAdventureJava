package src.main.java.game;
public class Actor {
    private String name;
    private int level;
    private int maxHealth;

    public Actor(String name, int level, int maxHealth) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
