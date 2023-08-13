package src.main.java.Items;
import java.util.ArrayList;

public class Backpack extends Item {
    private int maxSize;
    private ArrayList<Item> inventory;

    // constructor
    public Backpack(String name, String description, int maxSize) {
        super(name, description);
        this.maxSize = maxSize;
        this.inventory = new ArrayList<Item>();
    }

    // methods
    public void addItem(Item item) {
        if (inventory.size() + 1 > maxSize) {
            System.out.println("Your inventory is full!");
        }
        if (inventory.size() + 1 < maxSize) {
            inventory.add(item);
        }
    }

    public void removeItem(Item item) {
        inventory.remove(item);
        // System.out.println(item.getName() + " was removed from your inventory");

    }

    // getters and setters
    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void checkItems() {
        for (Item item : this.inventory) {
            System.out.println(item.getName() + " - " + item.getDescription());
        }
    }
}
