package Crypt;

public class Encrypt {

    private char[] key = new char[5];

    public Encrypt(char[] key) {
        this.key = key;
    }

    public String getEncMsg(String message) {
        int j = 0;
        String encMsg = "";
        for (int i = 0; i < message.length(); i++) {
            encMsg = encMsg + (char) (message.charAt(i) ^ key[j]);
            j++;
            if (j == key.length) {
                j = 0;
            }
        }
        return encMsg;
    }

    public String getDecMsg(String encMessage) {
        int j = 0;
        String decMsg = "";
        for (int i = 0; i < encMessage.length(); i++) {
            decMsg = decMsg + (char) (encMessage.charAt(i) ^ key[j]);
            j++;
            if (j == key.length) {
                j = 0;
            }
        }
        return decMsg;
    }
}
