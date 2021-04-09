package virtual_pet;

import java.util.Scanner;
//import java.util.stream.IntStream;

public class VirtualPet {
    private String name;
    private int thirst = 100;
    private boolean waste;
    private boolean boredom;
    private boolean sickness;
    private int food = 100;
    private int health = 100;
    private int crap = 0;
    private String menuOption = "0";

    public VirtualPet(String petName) {
        name = petName;
    }

    public void menu() {
        System.out.println("Say Aloha to your new pet, " + name );
        System.out.println("Food: " + food + "\n" + "Health: " + health + "\n" + "Bowels: 0 ");
        Scanner menuItems = new Scanner(System.in);
        while(!menuOption.equals("7")) {
            System.out.println("What would you like to do with your vPet? \n \n" +
                "1. Feed " + name + "\n" +
                "2. Give " + name + " a drink \n" +
                "3. Play with " + name + "\n" +
                "4. Put " + name + " to bed \n" +
                    "5. Use the restroom \n" +
                "6. Do nothing \n" +
                "7. Exit ");
            String menuOption = menuItems.next();
            System.out.println(menuOption);

            switch(menuOption) {
                case "1":
                    isHungery();
                    crap += 2;
                    bowels();
                    System.out.println("Food: " + food);
                    System.out.println("Bowels: " + crap);
                    break;
//            case "2":
//                isThirsty();
//                break;
            case "3":
                isBored();
                System.out.println("Food: " + food);
                break;
//            case "4":
//                isSleepy();
//                break;
                case "5":
                    restroom();
                    break;
//            case "6":
//                break;
                case "7":
                    break;
                default:
                    System.out.println("Please choose one of the available options ");
            }
        }



    }



    public int isHungery() {
        return food += 5;
    }

    public void bowels() {

        if(crap == 8) {
            System.out.println("Your pets bowels have reached 8. \nWhen it reaches more than 10 your vPet will die!");
        } else if (crap > 10) {
            System.out.println("Your vPet has died from constipation! ");
            menuOption.equals("7");
        }
    }

    public int restroom() {
        return crap = 0;
    }

    public int isBored() {
        return food -= 10;
    }







//    IntStream stream = IntStream.range(1,6);
//
//    while(menuOptions != stream && menuOptions != 0) {
//
//        switch(menuOptions) {
//            case 1:
//                isHunger();
//                break;
//            case 2:
//                isThirsty();
//                break;
//            case 3:
//                isBored();
//                break;
//            case 4:
//                isSleepy();
//                break;
//            case 5:
//                break;
//            default:
//                System.out.println("Please choose one of the available options ");
//        }
//    }
//
//
//

}
