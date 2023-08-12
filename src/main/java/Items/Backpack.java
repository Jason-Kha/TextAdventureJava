package src.main.java.Items;
import java.util.ArrayList;

import src.main.java.game.Item;

public class Backpack extends Item {
    private String name;
    private int maxSize;
    private ArrayList<Item> inventory;

    // constructor
    public Backpack(String name, String description, int maxSize) {
        super(name, description);
        this.name = name;
        this.maxSize = maxSize;
        this.inventory = new ArrayList<Item>();
    }

    // methods
    public void addItem(Item item) {
        if (inventory.size() + 1 > maxSize) {
            System.out.println("You're inventory is full!");
        }
        if (inventory.size() + 1 < maxSize) {
            inventory.add(item);
            System.out.println(item.getName() + " was added to your inventory");
        }
    }

    public void removeItem(Item item) {
        inventory.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkItems() {
        int i = 0;
        int size = this.inventory.size();
        for (Item item : this.inventory) {
            if(i < size - 1) {
                System.out.print(item.getName() + " - " + item.getDescription() + ", ");
            }
            else {
                System.out.println(item.getName() + " - " + item.getDescription());
            }
            i++;
        }
    }

}
