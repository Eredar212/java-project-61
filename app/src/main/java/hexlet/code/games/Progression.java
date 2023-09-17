package hexlet.code.games;

import hexlet.code.interfaces.GameFlow;

public class Progression implements GameFlow {
    private String rules = "What number is missing in the progression?";
    private String question;
    private String answer;
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
        int progressionStep = (int) (Math.random() * 5) + 1;
        int progressionLength = 10;
        int indexOfMissingNumber = (int) (Math.random() * progressionLength);
        int progressionNumber = (int) (Math.random() * 50);
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
