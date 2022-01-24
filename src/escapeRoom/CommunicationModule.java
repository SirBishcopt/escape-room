package escapeRoom;

import java.util.List;
import java.util.Scanner;

public class CommunicationModule {

    public void welcomePlayer() {
        System.out.println("\nGreetings. Please, do make yourself at home in my humble mansion. I hope you'll get as much comfortable, as I will be " +
                "amused, watching you try to get out.\nA prisoner? What a nonsense! I'm not a monster! You see, you can leave whenever you like. " +
                "All you have to do is go through couple of rooms and the last one will lead you straight to the exit.\n" +
                "But be warned! Some players never made it. They are stuck in front of their screens till this day, unable to find a way out...");
    }

    public static void endGame() {
        System.out.println("\nWhat?! H-h-how?! You've escaped?! That's impossible! No one has ever done it before! This is a massive " +
                "stain on my reputation, I'll never be able to remove!");
    }

    public void informPlayerOnEnteringNewRoom() {
        System.out.println("\nAnd so you've found yourself in this exquisite room. Choose your actions wisely.");
    }

    public void givePlayerOptions(List<Item> options) {
        System.out.println("\nIn this room there are:");
        for (Item item : options) {
            System.out.println("- " + item);
        }
    }

    public String askWhatPlayerWantsToDo() {
        System.out.println("\nWhat item would you like to use?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void responseToPlayersRequest(String responseToRequest) {
        System.out.println("\n" + responseToRequest);
    }

    public void congratulatePlayerOnLeavingTheRoom() {
        System.out.println("\nYou surely have a wit. You've managed to find the exit.");
    }

}