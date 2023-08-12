public class Player extends Person {
    private Backpack backpack;

    public Player(String name, int level, int maxHealth) {
        super(name, level, maxHealth);
        this.backpack = new Backpack("Starter Backpack", 10);
    }

    public void lookAt(Thing thing) {
        // look at thing!
    }

    public void take(Item item) {
        backpack.addItem(item);
        // remove item from world
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
}
