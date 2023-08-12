import java.util.ArrayList;

public class Backpack {
    private String name;
    private int maxSize;
    private ArrayList<Item> inventory;

    // constructor
    public Backpack(String name, int maxSize) {
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

}
