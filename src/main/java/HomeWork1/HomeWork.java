package HomeWork1;

import java.util.Random;
public class HomeWork {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Barsik", 1500, 300),
                new Cat("Gray", 1700, 220),
                new Robot("D2R3", 99999, 0),
                new Robot("CP2O", 5000, 50),
                new Human("Fedya", 2500, 150),
                new Human("Vova", 3500, 120)
        };

        Trap[] traps = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall( 250)
        };

        for (Participant p : participants) {
            for (Trap t : traps) {
                if (!t.overcome(p)) break;
            }
        }
    }
}







