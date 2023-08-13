package src.main.java;

import java.util.Scanner;

import src.main.java.game.Adventure;
import src.main.java.game.Consts.Dir;

public class Game {
    static Adventure adv;

    static Scanner input;
    static Boolean loop = true;


    public static void initGame() {
        adv = new Adventure();
        input = new Scanner(System.in);
    }

    public static void startGame() {
        System.out.println("Hello, adventurer. What is your name?");
        String name = input.nextLine().trim();
        adv.getPlayer().setName(name);

        System.out.println("Your name is: " + adv.getPlayer().getName());

        
        // game loop
        while (loop) {
            gameLoop();
        }
        input.close();
    }

    public static void gameLoop() {
        System.out.println("What will you do?: ");
        String action = input.nextLine().toLowerCase().trim();

        // will implement an action handler in the future
        switch(action) {
            case "move":
                System.out.println("Where will you move to?: (North, East, South, West)");
                   
                    String direction = input.nextLine().toLowerCase().trim();
                    switch(direction) {
                        case "north":
                            System.out.println(adv.movePlayerTo(Dir.NORTH));
                            break;
                        case "east":
                            System.out.println(adv.movePlayerTo(Dir.EAST));
                            break;
                        case "south":
                            System.out.println(adv.movePlayerTo(Dir.SOUTH));
                            break;
                        case "west":
                            System.out.println(adv.movePlayerTo(Dir.WEST));
                            break;
                        default:
                            break;
                    }
                break;
            case "items":
                    adv.getPlayer().getBackpack().checkItems();
                break;
            case "quit":
                loop = false;
            default:
                break;
        }
    }
}
