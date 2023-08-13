package src.main.java.Items;

import src.main.java.game.Thing;

public abstract class Item extends Thing {
    // constructor
    public Item(String name, String description) {
        super(name, description);
    }

    public void inspectItem(Item item) {
        System.out.println(item.getDescription());
    }
}
