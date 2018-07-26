package j23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by emawary on 2018-06-15.
 */

class Employee {
    String name;
    String surname;
    String birthOdDate;
    int    workOfTime;
}

public class Demo {

    public static void main(String[] args) {

        Employee employee    = new Employee();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Calendar calendar    = new GregorianCalendar(1989,0,28);

        employee.name        = "James";
        employee.surname     = "Spring";
        employee.birthOdDate = sdf.format(calendar.getTime());
        employee.workOfTime  = 2;

        System.out.println(employee.name + " " + employee.surname + " " + employee.birthOdDate + " " + employee.workOfTime);

    }
}
