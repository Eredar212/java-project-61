package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Prime implements Game {
    static final int HIGH_RANGE_RANDOM_PRIME = 100;
    public Prime() {
    }
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getData() {
        return reGen();
    }

    private String[] reGen() {
        int number = Utils.getRandom(HIGH_RANGE_RANDOM_PRIME);
        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{question, answer};
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
