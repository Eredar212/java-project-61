package hexlet.code;

import hexlet.code.interfaces.Game;

import java.util.Scanner;

public class Engine {
    static final int RIGHT_ANSWER_TO_WIN = 3;
    public static void startGame(Game game) {
        int rightAnswersInRow = 0; //счетчик правильных ответов
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(game.getRules());
        while (rightAnswersInRow < RIGHT_ANSWER_TO_WIN) {
            String[] data = game.getData();
            System.out.println("Question: " + data[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!data[1].equals(answer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + data[1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            } else {
                System.out.println("Correct!");
                rightAnswersInRow++;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
        //scanner.close();
    }
}
