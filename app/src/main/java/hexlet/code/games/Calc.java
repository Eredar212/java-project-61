package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Calc implements Game {
    static final int HIGH_RANGE_RANDOM_CALC = 10; //максимальное случайное число
    public Calc() {
    }
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] getData() {
        return reGen();
    }

    private String[] reGen() {
        String question;
        String answer;
        char[] ops = new char[]{'+', '-', '*'};
        int randomNumber1 = Utils.getRandom(HIGH_RANGE_RANDOM_CALC);
        int randomNumber2 = Utils.getRandom(HIGH_RANGE_RANDOM_CALC);
        char operation;
        operation = ops[Utils.getRandom(ops.length)];
        answer = switch (operation) {
            case '+' -> String.valueOf(randomNumber1 + randomNumber2);
            case '-' -> String.valueOf(randomNumber1 - randomNumber2);
            case '*' -> String.valueOf(randomNumber1 * randomNumber2);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
        question = randomNumber1 + " " + operation + " " + randomNumber2;
        return new String[]{question, answer};
    }
}
