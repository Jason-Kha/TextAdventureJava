package src.main.java;
import java.util.Scanner;

import src.main.java.Items.HealthPotion;
import src.main.java.game.Player;
import src.main.java.game.Room;

public class Game {
    // private ArrayList<Item> inventory = new ArrayList<Item>();
    
    static Player player = new Player("Yoshi", 1, 10); // player
    static Room room0 = new Room(); // starting room
    static Room room1 = new Room(); // second test room

    static Scanner input;
    static Boolean loop = true;
    
    static int position; // index for map array

    // map array
    static Room[] map;

    public static void initGame() {
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

    public static void startGame() {
        HealthPotion hp = new HealthPotion("Health Potion", "A red fruity potion encased in a spherical glass jar.");
        System.out.println("Welcome to text adventure game, " + player.getName() + "!");
        player.take(hp);

        // game loop
        while (loop) {
            gameLoop(); 
        }
        input.close();
    }

    public static void gameLoop() {
        input = new Scanner(System.in);
        System.out.println("What will you do?: ");
        String action = input.nextLine().toLowerCase().trim();
        
        // will implement an action handler in the future
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
            case "items":
                    player.getBackpack().checkItems();
                break;
            case "quit":
                loop = false;
            default:
                break;
        }
    }

    public static void movePlayer(Room room) {
        if(room == null) {
            System.out.println("No room ahead");
        } else {
            position = 1;
            //System.out.println("You are now in position room " + getPosition());
        }
    }
}
