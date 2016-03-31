package homework.guessTheNumber;

import java.util.Random;

public class AIPlayer implements Guessing {

    private int inventNumber;

    public void inventNumber(int from, int till){
        Random random = new Random();
        int inventNumber = random.nextInt((from - till) + 1) + from;
        this.inventNumber = inventNumber;
    }

    public int guess(int from, int till){
    Random random = new Random();
    int guessNumber = random.nextInt((from - till) + 1) + from;
    return guessNumber;
    }

    public int getInventNumber() {
        return inventNumber;
    }
}
