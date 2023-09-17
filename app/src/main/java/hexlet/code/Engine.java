package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.interfaces.GameFlow;

import java.util.Scanner;

public class Engine {
    static final int RIGHT_ANSWER_TO_WIN = 3;
    static final int GAME_EVEN = 2;
    static final int GAME_CALC = 3;
    static final int GAME_GCD = 4;
    static final int GAME_PROGRESSION = 5;
    static final int GAME_PRIME = 6;
    public static void startGame(Scanner scanner, int gameNumber, String playerName) {
        int rightAnswersInRow = 0; //счетчик правильных ответов
        GameFlow game;
        switch (gameNumber) {
            case GAME_EVEN:
                game = new Even();
                break;
            case GAME_CALC:
                game = new Calc();
                break;
            case GAME_GCD:
                game = new Gcd();
                break;
            case GAME_PROGRESSION:
                game = new Progression();
                break;
            case GAME_PRIME:
                game = new Prime();
                break;
            default:
                System.out.println("Let's try again, " + playerName + "!");
                return;
        }
        System.out.println(game.getRules());
        while (rightAnswersInRow < RIGHT_ANSWER_TO_WIN) {
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
