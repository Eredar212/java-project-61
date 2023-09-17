package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public final class Calc implements GameFlow {
    private String rules = "What is the result of the expression?";;
    private String question;
    private String answer;
    static final int HIGH_RANGE_RANDOM_CALC = 10; //максимальное случайное число
    static String ops = "+-*";
    public Calc() {
        reGen();
    }
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
        int randomNumber1 = (int) (Math.random() * HIGH_RANGE_RANDOM_CALC);
        int randomNumber2 = (int) (Math.random() * HIGH_RANGE_RANDOM_CALC);
        char operation = ops.charAt((int) (Math.random() * ops.length()));
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
                break;
        }
        this.question = randomNumber1 + " " + operation + " " + randomNumber2;
    }
}
