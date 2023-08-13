package src.main.java.game;

import src.main.java.game.Consts.Dir;
import src.main.java.game.Consts.Rm;

public class Adventure {
    private RoomList map;
    private Actor player;

    // constructor
    public Adventure() {
        map = new RoomList();
                
        map.put(Rm.START, new Room("Starting room", "Initial room", Rm.SECOND, Rm.NOEXIT, Rm.NOEXIT, Rm.NOEXIT)); // starting room
        map.put(Rm.SECOND, new Room("Second room", "Second room", Rm.NOEXIT, Rm.NOEXIT, Rm.START, Rm.NOEXIT)); // second room

        player = new Actor("Yoshi", "A nerd", map.roomAt(Rm.START)); // player
    }

    // methods
    public Actor getPlayer() {
        return player;
    }

    private void moveActorTo(Actor actor, Room room) {
        actor.setLocation(room);
    }

    private Rm moveTo(Actor actor, Dir direction) {
        Room r = actor.getLocation();
        Rm exit;

        switch(direction) {
            case NORTH:
                exit = r.getNorth();
                break;
            case EAST:
                exit = r.getEast();
                break;
            case SOUTH:
                exit = r.getSouth();
                break;
            case WEST:
                exit = r.getWest();
                break;
            default:
                exit = Rm.NOEXIT;
                break;
        }

        if(exit != Rm.NOEXIT) {
            moveActorTo(actor, map.roomAt(exit));
        }
        return exit;
    }

    public String movePlayerTo(Dir direction) {
        String s;
        if (moveTo(player, direction) == Rm.NOEXIT) {
            s = "There is no exit in that direction\n";
        } else {
            s = "You are now in the " + getPlayer().getLocation().getDescription();
        }
        return s;
    }
}
