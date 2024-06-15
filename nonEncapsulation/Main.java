package nonEncapsulation;

public class Main {
    public static void main(String[] args) {
        Player pl = new Player();
        pl.name = "DhanaKatheer";
        pl.health = 20;
        pl.weapon = "Sword";

        int damage = 10;
        pl.loseHealth(damage);
        System.out.println("Remaining Health = " + pl.healthRemaining());
        // First Problem Starts here
        // But what happens it the calling code, decides to just access the player's
        //health directly, any time it wants?
        //Eg:
        pl.health = 200;

        //Gone rogue - meaning -> to behave in a way that is not normal, expected.
        // Here main method is kind of gone rogue. Because it's setting the player's
        //health Manually, outside the normal game play method calls.

        //This code actually takes control away from the Player class, for managing the
        //player's health. It didn't call the restoreHealth method, which has the
        //additional control in place, that player health can never exceed 100.

        // --> The above is an example of the first problem, with a class that is not
        //encapsulated properly


        pl.loseHealth(11);
        System.out.println("Remaining Health = " + pl.healthRemaining());
    }
}
