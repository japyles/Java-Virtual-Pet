package virtual_pet;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
//import java.util.stream.IntStream;

public class VirtualPet {
    private String name;
    private int thirst = 0;
    private int waste = 0;
    private int boredom = 0;
    private int food = 100;
    private int health = 100;
    private int tired = 0;
    private String menuOption = "0";
    private int option = 0;

    public VirtualPet(String petName) {
        name = petName;
    }

    public void menu() {
        System.out.println("\n\nSay Aloha to your new pet, " + name + "\n");
        stats();
        System.out.println("\n");
        Scanner menuItems = new Scanner(System.in);
        while(option != 7) {
            System.out.println("What would you like to do with your vPet? \n \n" +
                "1. Feed " + name + "\n" +
                "2. Give " + name + " a drink \n" +
                "3. Play with " + name + "\n" +
                "4. Put " + name + " to bed \n" +
                    "5. Use the restroom \n" +
                "6. Do nothing \n" +
                "7. Exit \n");
            String menuOption = menuItems.next();

            int option = Integer.parseInt(menuOption);

            switch(option) {
                case 1:
                    isHungery();
                    waste += 2;
                    bowels();
                    gettingSleepy();
                    stats();
                    System.out.println("\n");
                    break;
                case 2:
                    isThirsty();
                    stats();
                    break;
                case 3:
                    isBored();
                    increaseThirst();
                    bowels();
                    gettingSleepy();
                    stats();
                    System.out.println("\n");
                    break;
                    case 4:
                    isSleepy();
                    stats();
                    break;
                case 5:
                    restroom();
                    stats();
                    break;
                case 6:
                    stats();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose one of the available options \n");
            }

            if (option == 7) {
                break;
            }
        }



    }

    public void stats() {
        System.out.println("Health: " + health);
        System.out.println("Food: " + food);
        System.out.println("Thirst: " + thirst);
        System.out.println("Waste: " + waste);
        System.out.println("Boredom: " + boredom);
        System.out.println("Sleepiness: " + tired);
    }

    public int isHungery() {
        return food += 5;
    }

    public void bowels() {

        if(waste == 8) {
            System.out.println("Your pets bowels have reached 8. \nWhen it reaches more than 10 your vPet will die! \n");
        } else if (waste == 10) {
            System.out.println("Please don't feed " + name + " before taking " + name + " to the restroom \n");
        } else if (waste > 10) {
            System.out.println("Your vPet has died from constipation! \n");
            menuOption.equals("7");
        }
    }

    public int restroom() {
        return waste = 0;
    }

    public int isBored() {
        return food -= 10;
    }


    public int increaseThirst() {
        if (thirst == 6) {
            System.out.println("I am getting a little thirsty, please give me a beverage \n ");
        } else if (thirst == 10) {
            System.out.println("I am getting parched and am really thirsty! Please give me a beverage! \n");
        } else if (thirst > 12) {
            System.out.println("Your vPet has died due to lack of fluids \n");
            menuOption.equals("7");
            System.out.println(menuOption);
        }
        return thirst += 2;
    }

    public int isThirsty() {
        return thirst = 0;
    }

    public int gettingSleepy() {
        return tired += 2;
    }

    public int isSleepy() {
        return tired = 0;
    }

    public int getHealth() {
        return 0;
//        if health falls below 50 -> vPet is sick
//        remove 10 health points if vPet not fed after 10 minutes
//        if not fed after 5 minutes print "I'm hungry, please feed me!"
    }
}