package src.main.java.game;

import java.util.Hashtable;
import java.util.Map;

import src.main.java.game.Consts.Rm;

public class RoomList extends Hashtable<Rm, Room> {

    public RoomList() {

    }

    public Room roomAt(Rm id) {
        return this.get(id);
    }

    public String describe() {
        String s = "";
        if (this.size() == 0) {
            s = "Nothing in RoomList.";
        } else {
            for (Map.Entry<Rm, Room> rm : this.entrySet()) {
                s = s + rm.getValue().getDescription() + "\r\n";
            }
        }
        return s;
    }

}
