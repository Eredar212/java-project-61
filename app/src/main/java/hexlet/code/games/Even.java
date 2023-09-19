package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Even implements Game {
    private String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private String question;
    private String answer;
    static final int HIGH_RANGE_RANDOM_EVEN = 100; //максимальное случайное число
    public Even() {
        reGen();
    }
    public String getRules() {
        return rules;
    }

    public String[] getData() {
        return new String[]{this.question, this.answer};
    }

    @Override
    public void reGen() {
        int randomNumber = Utils.getRandom(HIGH_RANGE_RANDOM_EVEN);
        this.answer = isEven(randomNumber) ? "yes" : "no";
        this.question = String.valueOf(randomNumber);
    }
    private boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }
}
