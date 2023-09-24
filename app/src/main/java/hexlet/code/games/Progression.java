package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Progression implements Game {
    private static final int MAX_STEP = 5;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_PROGR_START_NUMBER = 50;
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getData() {
        String question;
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int progressionStep = Utils.getRandom(MAX_STEP) + 1;
        int indexOfMissingNumber = Utils.getRandom(PROGRESSION_LENGTH);
        int progressionNumber = Utils.getRandom(MAX_PROGR_START_NUMBER);
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            progressionNumber += progressionStep;
            if (i == indexOfMissingNumber) {
                sb.append("..");
                answer = String.valueOf(progressionNumber);
                continue;
            } else {
                sb.append(progressionNumber);
            }
            sb.append(i == PROGRESSION_LENGTH - 1 ? "" : " ");
        }
        question = sb.toString();
        return new String[]{question, answer};
    }
}
