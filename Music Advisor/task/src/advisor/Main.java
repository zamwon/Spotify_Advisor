package advisor;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        chooseAction();
    }

    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "new":
                System.out.println("---NEW RELEASES---\n" +
                        "Mountains [Sia, Diplo, Labrinth]\n" +
                        "Runaway [Lil Peep]\n" +
                        "The Greatest Show [Panic! At The Disco]\n" +
                        "All Out Life [Slipknot]");
                chooseAction();
                break;
            case "featured":
                System.out.println("---FEATURED---\n" +
                        "Mellow Morning\n" +
                        "Wake Up and Smell the Coffee\n" +
                        "Monday Motivation\n" +
                        "Songs to Sing in the Shower");

                chooseAction();
                break;
            case "categories":
                System.out.println("---CATEGORIES---\n" +
                        "Top Lists\n" +
                        "Pop\n" +
                        "Mood\n" +
                        "Latin");
                chooseAction();
                break;
            case "playlists Mood":
                System.out.println("---MOOD PLAYLISTS---\n" +
                        "Walk Like A Badass\n" +
                        "Rage Beats\n" +
                        "Arab Mood Booster\n" +
                        "Sunday Stroll");
                chooseAction();
                break;
            case "exit":
                System.out.println("---GOODBYE!---");
                break;
        }
    }

}
