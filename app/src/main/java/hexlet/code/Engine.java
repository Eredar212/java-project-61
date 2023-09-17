package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.interfaces.GameFlow;

import java.util.Scanner;

public class Engine {
    static final int rightAnswersToWin = 3;
    static final int gameEven = 2;
    static final int gameCalc = 3;
    static final int gameGCD = 4;
    static final int gameProgression = 5;
    static final int gamePrime = 6;
    public static void startGame(Scanner scanner, int gameNumber, String playerName) {
        //счетчик правильных ответов
        int rightAnswersInRow = 0;
        GameFlow game;
        switch (gameNumber) {
            case gameEven:
                game = new Even();
                break;
            case gameCalc:
                game = new Calc();
                break;
            case gameGCD:
                game = new Gcd();
                break;
            case gameProgression:
                game = new Progression();
                break;
            case gamePrime:
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
