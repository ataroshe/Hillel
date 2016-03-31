package homework.guessTheNumber;

import java.util.Scanner;

public class HumanPlayer implements Guessing{

    private int inventNumber;

    public void inventNumber(int from, int till){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the inventNumber");
        int inventNumber = scanner.nextInt();
        this.inventNumber = inventNumber;
    }

    public int guess(int from, int till){
        System.out.println("Please enter the number from: " + from + " till: " + till);
        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();
            return guessNumber;
    }

    public int getInventNumber() {
        return inventNumber;
    }
}
