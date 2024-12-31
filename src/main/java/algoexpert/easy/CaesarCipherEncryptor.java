package algoexpert.easy;

public class CaesarCipherEncryptor {

    public static char encryptChar(char a,int key ){
        int MIN = (int) 'a';
        int MAX = (int) 'z';

        int unicodeVal = (int) a;
        if(unicodeVal + key > MAX){
            int difference = (unicodeVal + key) - MAX -1;
            if(difference >= 26){
                int roll_overs = difference / 26;
                difference = difference - (26 * roll_overs);
            }
            char encrypted = (char) (MIN + difference);
            return encrypted;
        }
        return (char) (unicodeVal + key);
    }

    public static String caesarCypherEncryptor(String str, int key) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(encryptChar(str.charAt(i), key));
        }
        return builder.toString();
    }
}
