package JDBC.sql.tests;

import JDBC.sql.ProductNotFoundExcptions;
import JDBC.sql.controllers.ProduktController;
import JDBC.sql.helper.DBConnect;

import java.sql.SQLException;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        DBConnect dbConnect = new DBConnect();
        dbConnect.driverRegister();
        dbConnect.setConncetion("root", "C!ec666");

        ProduktController proudktController = new ProduktController(dbConnect.getConnection());

        try {
            proudktController.wypiszProdukty();
//            proudktController.wpiszProdukty("palmok", 123.2, 3);
//            proudktController.wypiszProdukty();
//            proudktController.zmienOpiekunaProduktu(2, 2);

//            proudktController.usunProdukt(5);
//            proudktController.wypiszProdukty(5);

            Scanner scanner = new Scanner(System.in);
//            System.out.println("podaj ID produktu do usuniecia");
//            int produtId = scanner.nextInt();
//            proudktController.usunProdukt(produtId);
//            proudktController.wypiszProdukty();

            System.out.println("-=-=-=-");
            System.out.println("wypisz id 7");
            proudktController.wypiszProd(7);
            System.out.println("-=-=-=-");
            System.out.println("wypisz id 1");
            proudktController.wypiszProd(1);

            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-\n");

            System.out.println("wypisz id 4");
            proudktController.poka(4);
            System.out.println("-=-=-=- -=-=-=-");
            System.out.println("wypisz id 100");
            proudktController.poka(100);
            System.out.println("podaj id do pokazania produkta");
            int id_poka = scanner.nextInt();

            proudktController.poka(id_poka);

        } catch (SQLException e) {
           // e.printStackTrace();
            System.err.println("error" + e);
            String sqlState = e.getSQLState();
            String message = e.getMessage();
            int errorCode = e.getErrorCode();
            System.out.println("błędy");

        } catch (ProductNotFoundExcptions productNotFoundExcptions) {
            productNotFoundExcptions.printStackTrace();
        }


    }
}
