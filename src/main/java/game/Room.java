package src.main.java.game;

import src.main.java.game.Consts.Rm;

public class Room extends Thing {
    private Rm north;
    private Rm east;
    private Rm south;
    private Rm west;

    // constructor
    public Room(String name, String description, Rm north, Rm east, Rm south, Rm west) {
        super(name, description);
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    // methods
    public String describe() {
        return "Describe";
    }

    // getters & setters
    public Rm getNorth() {
        return north;
    }

    public void setNorth(Rm north) {
        this.north = north;
    }

    public Rm getEast() {
        return east;
    }

    public void setEast(Rm east) {
        this.east = east;
    }

    public Rm getSouth() {
        return south;
    }

    public void setSouth(Rm south) {
        this.south = south;
    }

    public Rm getWest() {
        return west;
    }

    public void setWest(Rm west) {
        this.west = west;
    }
}
