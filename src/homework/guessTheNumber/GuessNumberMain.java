package homework.guessTheNumber;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) {

        System.out.println("Please choose gametype: \n 1)AI vs Human \n 2)Human vs AI \n 3)AI vs AI");
        Scanner scanner = new Scanner(System.in);
        int gametype = scanner.nextInt();

        //можно использовать switch case но мне больше нравятся if
        if (gametype == 1) {
            AIPlayer ai = new AIPlayer();
            ai.inventNumber(10,20);
            HumanPlayer humanPlayer = new HumanPlayer();
            Game game1 = new Game();
            for (int i = 0; i < 6; i++) {
                game1.checking(ai.getInventNumber(), humanPlayer.guess(10, 20));
                if (game1.win = true)
                    break;
            }
        }

        else if (gametype == 2){
            HumanPlayer humanPlayer = new HumanPlayer();
            System.out.println("Type the span");
            int from = scanner.nextInt();
            int till = scanner.nextInt();
            humanPlayer.inventNumber(from, till);
            AIPlayer ai = new AIPlayer();
            ai.guess(from, till);
            Game game1 = new Game();
            for (int i = 0; i < 6; i++) {
                game1.checking(humanPlayer.getInventNumber(), ai.guess(from, till));
                if (game1.win = true)
                    break;
            }
        }

        else if (gametype == 3) {
            AIPlayer ai1 = new AIPlayer();
            ai1.inventNumber(10,20);
            AIPlayer ai2 = new AIPlayer();
            ai2.guess(10, 20);
            Game game1 = new Game();
            for (int i = 0; i < 6; i++) {
                game1.checking(ai1.getInventNumber(), ai2.guess(10, 20));
                if (game1.win = true)
                    break;
            }
        }

        else
            System.out.println("You can't read?)");


    }
}
