package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public class Gcd implements GameFlow {
    private String rules = "Find the greatest common divisor of given numbers.";
    private String question;
    private String answer;
    private int highRangeToRandom = 50;
    public Gcd() {
        reGen();
    }
    @Override
    public String getRules() {
        return rules;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void reGen() {
        int randomNumber1 = (int) (Math.random() * highRangeToRandom) + 1;
        int randomNumber2 = (int) (Math.random() * highRangeToRandom) + 1;
        this.question = randomNumber1 + " " + randomNumber2;
        this.answer = String.valueOf(getGcd(randomNumber1, randomNumber2));
    }

    private int getGcd(int num1, int num2) {
        if (num1 < num2 && num2 % num1 == 0) {
            return num1;
        } else if (num1 > num2 && num1 % num2 == 0) {
            return num2;
        }
        return getGcd(num2, num1 % num2);
    }
}
