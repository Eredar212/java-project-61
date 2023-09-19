package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Even implements Game {
    static final int HIGH_RANGE_RANDOM_EVEN = 100; //максимальное случайное число
    public Even() {
    }
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String[] getData() {
        return reGen();
    }

    private String[] reGen() {
        String question;
        String answer;
        int randomNumber = Utils.getRandom(HIGH_RANGE_RANDOM_EVEN);
        answer = isEven(randomNumber) ? "yes" : "no";
        question = String.valueOf(randomNumber);
        return new String[]{question, answer};
    }
    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
