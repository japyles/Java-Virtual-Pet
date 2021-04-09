package virtual_pet;

import virtual_pet.VirtualPet;
import java.util.Timer;
import java.util.TimerTask;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a virtual_pet.VirtualPet object in this method
        VirtualPet vPet = new VirtualPet("Skye");
        vPet.menu();

        class Tick extends TimerTask {
            public void run() {
                System.out.println("Tick tock it's working, yo!");
            }
        }

        Timer timer = new Timer();
        TimerTask task = new Tick();

        timer.schedule(task, 5, 500);

    }

}