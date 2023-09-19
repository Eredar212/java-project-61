package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Prime implements Game {
    private String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String question;
    private String answer;
    static final int HIGH_RANGE_RANDOM_PRIME = 100;
    public Prime() {
        reGen();
    }
    @Override
    public String getRules() {
        return rules;
    }

    @Override
    public String[] getData() {
        return new String[]{this.question, this.answer};
    }

    @Override
    public void reGen() {
        int number = Utils.getRandom(HIGH_RANGE_RANDOM_PRIME);
        this.question = String.valueOf(number);
        this.answer = isPrime(number) ? "yes" : "no";
    }
    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
