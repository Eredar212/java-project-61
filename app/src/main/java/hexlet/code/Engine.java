package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.interfaces.GameFlow;

import java.util.Scanner;

public class Engine {
    public static String startGame(Scanner scanner, int gameNumber) {
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
            default:
                return "loose";
        }
        System.out.println(game.getRules());
        while (rightAnswersInRow < rightAnswersToWin) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!game.getAnswer().equals(answer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + game.getAnswer() + "'.");
                return "loose";
            } else {
                System.out.println("Correct!");
                game.reGen();
                rightAnswersInRow++;
            }
        }
        return "win";
    }
}
