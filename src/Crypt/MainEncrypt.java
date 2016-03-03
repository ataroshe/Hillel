package Crypt;

import java.util.Scanner;

public class MainEncrypt {
    public static void main(String[] args) {
        char[] k = {1, 2, 3, 4, 5, 6};
        Encrypt key = new Encrypt(k);

        Scanner s = new Scanner(System.in);
        System.out.println("Type your word");
        String message = s.nextLine();
        System.out.println("Your message is: " + message);

        String encMessage = key.getEncMsg(message);
        System.out.println("Encrypted message is: " + encMessage);

        String decMessage = key.getDecMsg(encMessage);
        System.out.println("Decrypted message is: " + decMessage);
    }
}
