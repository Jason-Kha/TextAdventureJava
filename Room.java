public class Room {
    private String name;
    private String description;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    /*
    public Room(String name, String description, Room north, Room east, Room south, Room west) {
        this.name = name;
        this.description = description;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }*/

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

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }
}
