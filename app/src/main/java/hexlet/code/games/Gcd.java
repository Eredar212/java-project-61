package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Gcd implements Game {
    static final int HIGHER_RANGE_RANDOM_GCD = 50; //максимальное случайноe число
    public Gcd() {
    }
    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] getData() {
        return reGen();
    }

    private String[] reGen() {
        String question;
        String answer;
        int randomNumber1 = Utils.getRandom(HIGHER_RANGE_RANDOM_GCD) + 1;
        int randomNumber2 = Utils.getRandom(HIGHER_RANGE_RANDOM_GCD) + 1;
        question = randomNumber1 + " " + randomNumber2;
        answer = String.valueOf(getGcd(randomNumber1, randomNumber2));
        return new String[]{question, answer};
    }

    private int getGcd(int num1, int num2) {
        if (num1 <= num2 && num2 % num1 == 0) {
            return num1;
        } else if (num1 >= num2 && num1 % num2 == 0) {
            return num2;
        }
        return getGcd(num2, num1 % num2);
    }
}
