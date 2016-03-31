package homework.guessTheNumber;

public class Game {
    boolean win = false;

    public void checking(int inventNumber, int guessNumber) {

        if (inventNumber == guessNumber) {
            System.out.println("Congratulations, you WIN!");
            win = true;
        } else if (inventNumber > guessNumber) {
            System.out.println("Your number is smaller");
        } else {
            System.out.println("Your number is bigger");
        }
    }

    public boolean isWin() {
        return win;
    }
}
