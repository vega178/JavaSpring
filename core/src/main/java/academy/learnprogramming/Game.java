package academy.learnprogramming;

public interface Game {

    int getGame();

    int getGess();

    void setGess(int gess);

    int getSmallest();

    int getBiggest();

    int getNumber();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRage();

    boolean isGameWon();

    boolean isGameLost();
}
