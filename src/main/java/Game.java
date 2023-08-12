package src.main.java;
import java.util.Scanner;

import src.main.java.Actor.Player;
import src.main.java.Places.Room;
import src.main.java.Things.HealthPotion;

public class Game {
    // private ArrayList<Item> inventory = new ArrayList<Item>();
    
    Player player = new Player("Yoshi", 1, 10); // player
    Room room0 = new Room(); // starting room
    Room room1 = new Room(); // second test room

    Scanner input;
    Boolean loop = true;
    
    int position; // index for map array

    // map array
    Room[] map;

    public void initGame() {
        room0 = new Room();
        map = new Room[4];
        map[0] = room0;
        map[1] = room1;
        // create rooms here
        room0.setName("Starting room");
        room0.setDescription("The starting room.");
        room0.setNorth(room1);

        room1.setName("Second room");
        room1.setDescription("This is the second room.");
        room1.setSouth(room0);

        position = 0;
    }

    public void startGame() {
        HealthPotion hp = new HealthPotion("Health Potion", null);
        System.out.println("Welcome to text adventure game!");
        player.take(hp);
        
        while (loop) {
            gameLoop(); 
        }
        input.close();
    }

    public void gameLoop() {
        input = new Scanner(System.in);
        System.out.println("What will you do?: ");
        String action = input.nextLine().toLowerCase().trim();
        
        
        switch(action) {
            case "move":
                System.out.println("Where will you move to?: (North, East, South, West)");
                   
                    String direction = input.nextLine().toLowerCase().trim();
                    switch(direction) {
                        case "north":
                            movePlayer(map[position].getNorth());
                            break;
                        case "east":
                            movePlayer(map[position].getEast());
                            break;
                        case "south":
                            movePlayer(map[position].getSouth());
                            break;
                        case "west":
                            movePlayer(map[position].getWest());
                            break;
                        default:
                            break;
                    }
                break;
            case "quit":
                loop = false;
            default:
                break;
        }
    }

    public void movePlayer(Room room) {
        if(room == null) {
            System.out.println("No room ahead");
        } else {
            position = 1;
            //System.out.println("You are now in position room " + getPosition());
        }
    }
}
