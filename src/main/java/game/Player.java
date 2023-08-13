package src.main.java.game;

import src.main.java.Items.Backpack;

public class Player extends Actor {
    private Backpack backpack;

    public Player(String name, int level, int maxHealth) {
        super(name, level, maxHealth);
        this.backpack = new Backpack("Starter Backpack", "A small backpack.", 10);
    }

    public void lookAt(Thing thing) {
        // look at thing!
    }

    public void take(Item item) {
        backpack.addItem(item);
        System.out.println(item.getName() + " was added to your inventory");
        // remove item from world
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
}
