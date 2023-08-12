import java.util.ArrayList;

public class Backpack {
    private String type;
    private int currSize;
    private int maxSize;
    private ArrayList<Items> inventory = new ArrayList<Items>();

    // constructor
    public Backpack(String type, int currSize, int maxSize, ArrayList<Items> inventory) {
        this.type = type;
        this.currSize = currSize;
        this.maxSize = maxSize;
        this.inventory = inventory;
    }

    // methods
    public void addItem(Items item) {
        if (currSize + 1 > maxSize) {
            System.out.println("You're inventory is full!");
        }
        if (currSize + 1 < maxSize) {
            inventory.add(item);
            currSize++;
            System.out.println(item.getName() + " was added to your inventory");
        }
    }

    public void removeItem(Items item) {
        inventory.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");

    }

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrSize() {
        return currSize;
    }

    public void setCurrSize(int currSize) {
        this.currSize = currSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

}
