package advisor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        boolean authorized = false;

        do {
            input = scanner.nextLine();

            if (!authorized && !input.equals("auth") && !input.equals("exit")) {
                System.out.println("Please, provide access for application.");
                continue;
            }

            switch (input) {
                case "auth":
                    String authLink = "https://accounts.spotify.com/authorize?client_id=9ebd4340f5cc4364a7e327301d7e767d&redirect_uri=http://www.example.com?code=7angkqw2DAsdfkQ&response_type=code";
                    System.out.println(authLink);
                    authorized = true;
                    System.out.println("---SUCCESS---");
                    break;

                case "new":
                    System.out.println("---NEW RELEASES---");
                    System.out.println("Mountains [Sia, Diplo, Labrinth]");
                    System.out.println("Runaway [Lil Peep]");
                    System.out.println("The Greatest Show [Panic! At The Disco]");
                    System.out.println("All Out Life [Slipknot]");
                    break;

                case "featured":
                    System.out.println("---FEATURED---");
                    System.out.println("Mellow Morning");
                    System.out.println("Wake Up and Smell the Coffee");
                    System.out.println("Monday Motivation");
                    System.out.println("Songs to Sing in the Shower");
                    break;

                case "categories":
                    System.out.println("---CATEGORIES---");
                    System.out.println("Top Lists");
                    System.out.println("Pop");
                    System.out.println("Mood");
                    System.out.println("Latin");
                    break;

                case "playlists":
                    String category = input.substring("playlists".length()).trim();
                    System.out.println("---" + category.toUpperCase() + " PLAYLISTS---");
                    System.out.println("Walk Like A Badass");
                    System.out.println("Rage Beats");
                    System.out.println("Arab Mood Booster");
                    System.out.println("Sunday Stroll");
                    break;

                case "exit":
                    System.out.println("---GOODBYE!---");
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
            }

        } while (!input.equals("exit"));

        scanner.close();
    }
}
