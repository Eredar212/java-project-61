package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);
        if (gameNumber == 0) {
            scanner.close();
            return;
        }
        String playerName = Cli.welcome(scanner);
        //scanner.close();
        if (gameNumber > 1) {
            Engine.startGame(scanner, gameNumber, playerName);
        }
        scanner.close();
    }
}
