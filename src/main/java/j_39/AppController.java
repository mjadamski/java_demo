package j_39;

import java.util.Random;

public class AppController {

    public void generateRadndomExceptions() throws MyExcp_1, MyExcp_2, MyExcp_3 {

        Random random = new Random();

        int i = random.nextInt(3);

        if (i ==0) {
            throw  new MyExcp_1("pierwsze wyjście");
        } else if (i == 1) {
            throw new MyExcp_2("drugie wyjście");
        } else {
            throw new MyExcp_3("opcja czecia");
        }

    }
}
