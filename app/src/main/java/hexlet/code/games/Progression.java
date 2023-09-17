package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public final class Progression implements GameFlow {
    private String rules = "What number is missing in the progression?";
    private String question;
    private String answer;
    static final int MAX_STEP = 5;
    static final int PROGRESSION_LENGTH = 10;
    static final int MAX_PROGR_START_NUMBER = 50;
    public Progression() {
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
        this.question = "";
        int progressionStep = (int) (Math.random() * MAX_STEP) + 1;
        int indexOfMissingNumber = (int) (Math.random() * PROGRESSION_LENGTH);
        int progressionNumber = (int) (Math.random() * MAX_PROGR_START_NUMBER);
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            progressionNumber += progressionStep;
            if (i == indexOfMissingNumber) {
                this.question += ".." + (i == PROGRESSION_LENGTH - 1 ? "" : " ");
                this.answer = String.valueOf(progressionNumber);
                continue;
            }
            this.question += progressionNumber + (i == PROGRESSION_LENGTH - 1 ? "" : " ");
        }
    }
}
