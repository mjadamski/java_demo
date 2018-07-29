package j_41;
//rekrutacyjne
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class BadAgeException extends Exception {

    public BadAgeException(String message) {
        super(message);
    }
}

class BadStringException extends Exception {
    public BadStringException(String message) {
        super(message);
    }
}

public class InputRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String name    = "";
        String surname = "";
        int age        = 0;

        boolean nameFlag     = true;
        boolean surnameFlag = true;
        boolean ageFlag      = true;
        boolean flag         = true;

        while (flag) {

            try {
                if (nameFlag) {
                    System.out.println("podaj imie: ");
                    name = input.nextLine();
                    if (name.length() == 0) {
                        throw new NullPointerException();
                    }
                    if (MyExceptionHelper.isNumeric(name)) {
                        throw new BadStringException("wpisałeś cyfrę, popraw");
                    }
                    nameFlag = false;
                }

                if (surnameFlag) {
                    System.out.println("podaj nazwisko: ");
                    surname = input.nextLine();
                    if (surname.length() == 0) {
                        throw  new NullPointerException();
                    }
                    if (MyExceptionHelper.isNumeric(surname)) {
                        throw new BadStringException("wpisałeś cyfrę, popraw");

                    }
                    surnameFlag = false;
                }

                if (ageFlag) {
                    System.out.println("podaj wiek: ");
                    age = input.nextInt();
                    if (age > 0 && age < 130) {
                        ageFlag = false;
                        flag = false;
                    } else {
                        throw new BadAgeException("zły wiek");
                    }

                }

            } catch (NullPointerException n) {
                System.out.println("popraw się!");
            } catch (InputMismatchException e) {
                System.out.println("popraw sie!");
            } catch (BadAgeException e) {
                e.printStackTrace();
            } catch (BadStringException e) {
                e.printStackTrace();
            }
//             finally {
//                System.out.println("nie poprawie!");
//            }

        }

        input.close();
        System.out.println("zwiesz sie i wiek twój to: ");
        System.out.print("name = " + name + " ");
        System.out.print("surname = " + surname + " ");
        System.out.print("age = " + age + "\n");

    }
}
