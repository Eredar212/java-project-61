package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public final class Progression implements GameFlow {
    private String rules = "What number is missing in the progression?";
    private String question;
    private String answer;
    private final int maxStep = 5;
    private final int progressionLength = 10;
    private final int maxProgressionStartNumber = 50;
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
        int progressionStep = (int) (Math.random() * maxStep) + 1;
        int indexOfMissingNumber = (int) (Math.random() * progressionLength);
        int progressionNumber = (int) (Math.random() * maxProgressionStartNumber);
        for (int i = 0; i < progressionLength; i++) {
            progressionNumber += progressionStep;
            if (i == indexOfMissingNumber) {
                this.question += ".." + (i == progressionLength - 1 ? "" : " ");
                this.answer = String.valueOf(progressionNumber);
                continue;
            }
            this.question += progressionNumber + (i == progressionLength - 1 ? "" : " ");
        }
    }
}
