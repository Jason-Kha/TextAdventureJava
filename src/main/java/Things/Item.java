package src.main.java.Things;
public class Item implements Thing {

    private String name;
    private String description;

    // constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
