package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.interfaces.GameFlow;

import java.util.Scanner;

public class Engine {
    public static void startGame(Scanner scanner, int gameNumber, String playerName) {
        int rightAnswersInRow = 0;
        int rightAnswersToWin = 3;
        GameFlow game;
        switch (gameNumber) {
            case 2:
                game = new Even();
                break;
            case 3:
                game = new Calc();
                break;
            case 4:
                game = new Gcd();
                break;
            case 5:
                game = new Progression();
                break;
            case 6:
                game = new Prime();
                break;
            default:
                System.out.println("Let's try again, " + playerName + "!");
                return;
        }
        System.out.println(game.getRules());
        while (rightAnswersInRow < rightAnswersToWin) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!game.getAnswer().equals(answer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + game.getAnswer() + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            } else {
                System.out.println("Correct!");
                game.reGen();
                rightAnswersInRow++;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
