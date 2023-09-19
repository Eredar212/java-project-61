package hexlet.code.interfaces;

public interface Game {
    String getRules();
    String getQuestion();
    String getAnswer();
    String[] getData();
    void reGen();
}
