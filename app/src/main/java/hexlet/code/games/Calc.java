package hexlet.code.games;

import hexlet.code.interfaces.Game;

public final class Calc implements Game {
    private String rules = "What is the result of the expression?";
    private String question;
    private String answer;
    static final int HIGH_RANGE_RANDOM_CALC = 10; //максимальное случайное число
    public Calc() {
        reGen();
    }
    public String getRules() {
        return rules;
    }

    @Override
    public String[] getData() {
        return new String[]{this.question, this.answer};
    }

    @Override
    public void reGen() {
        char[] ops = new char[]{'+','-','*'};
        int randomNumber1 = (int) (Math.random() * HIGH_RANGE_RANDOM_CALC);
        int randomNumber2 = (int) (Math.random() * HIGH_RANGE_RANDOM_CALC);
        char operation;
        operation = ops[(int) (Math.random() * ops.length)];
        switch (operation) {
            case '+':
                this.answer = String.valueOf(randomNumber1 + randomNumber2);
                break;
            case '-':
                this.answer = String.valueOf(randomNumber1 - randomNumber2);
                break;
            case '*':
                this.answer = String.valueOf(randomNumber1 * randomNumber2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        this.question = randomNumber1 + " " + operation + " " + randomNumber2;
    }
}
