package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
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

        String resultOfGame = Engine.startGame(scanner, gameNumber);
        if (resultOfGame == "win") {
            System.out.println("Congratulations, " + playerName + "!");
        } else {
            System.out.println("Let's try again, " + playerName + "!");
        }
        scanner.close();
    }
}
