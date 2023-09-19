package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.interfaces.Game;

import java.util.Scanner;

public class App {
    static final int GAME_EXIT = 0;
    static final int GAME_GREET = 1;
    static final int GAME_EVEN = 2;
    static final int GAME_CALC = 3;
    static final int GAME_GCD = 4;
    static final int GAME_PROGRESSION = 5;
    static final int GAME_PRIME = 6;
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
        //scanner.close();
        Game game;
        switch (gameNumber) {
            case GAME_GREET:
                Cli.welcome();
                break;
            case GAME_EVEN:
                game = new Even();
                Engine.startGame(game);
                break;
            case GAME_CALC:
                game = new Calc();
                Engine.startGame(game);
                break;
            case GAME_GCD:
                game = new Gcd();
                Engine.startGame(game);
                break;
            case GAME_PROGRESSION:
                game = new Progression();
                Engine.startGame(game);
                break;
            case GAME_PRIME:
                game = new Prime();
                Engine.startGame(game);
                break;
            case GAME_EXIT:
            default:
                System.exit(0);
        }
        scanner.close();
    }
}
