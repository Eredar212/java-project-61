package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public final class Even implements GameFlow {
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
        int randomNumber = (int) (Math.random() * HIGH_RANGE_RANDOM_EVEN);
        this.answer = randomNumber % 2 == 0 ? "yes" : "no";
        this.question = String.valueOf(randomNumber);
    }
}
