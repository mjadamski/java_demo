package j_22;

public class Company {
    public static void main(String[] args) {

        Employee james   = new Employee();
        Employee stefaan = new Employee();
        Employee hans    = new Employee();

        james.name        = "James";
        james.surname     = "Kowolski";
        james.dateOfBirth = "1986-01-12";
        james.timeOfWork  = 10;

        stefaan.name        = "Stefan";
        stefaan.surname     = "$niady";
        stefaan.dateOfBirth = "1974-10-012";
        stefaan.timeOfWork  = 22;

        hans.name        = "Hanss";
        hans.surname     = "Kloss";
        hans.dateOfBirth = "1874-10-012";
        hans.timeOfWork  = 44;

        System.out.println(james);
        System.out.println(hans.surname);

    }
}
