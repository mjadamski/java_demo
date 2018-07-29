package j_41;

public class MyExceptionHelper {
    public static boolean isNumeric(String s) {

        int lenOfString = s.length();

        for (int i = 0; i< lenOfString; i ++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;

    }
}
