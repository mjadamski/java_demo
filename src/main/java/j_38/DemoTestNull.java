package j_38;

public class DemoTestNull {

    public static void tryTest(String text) {
        try {
            System.out.println(text.length());
        } catch (NullPointerException n) {
            System.out.println("nie można podać długości");
        }

    }

    public static void main(String[] args) {

        tryTest(null);
        tryTest("Ala ma kota");


    }
}
