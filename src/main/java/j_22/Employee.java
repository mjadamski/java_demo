package j_22;

public class Employee {

    public String name;
    public String surname;
    public String dateOfBirth;
    public int timeOfWork;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", timeOfWork=" + timeOfWork +
                '}';
    }
}
