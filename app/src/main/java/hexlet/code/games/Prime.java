package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public final class Prime implements GameFlow {
    private String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String question;
    private String answer;
    private int highRangeToRandom = 100;
    public Prime() {
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
        int number = (int) (Math.random() * highRangeToRandom);
        this.question = String.valueOf(number);
        this.answer = "yes";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                this.answer = "no";
                break;
            }
        }
    }
}
