package JDBC.sql.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private Connection connection;

    public void driverRegister() {
        String driverClasName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverClasName);
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("nie zarejestrowano class driver");
        }
    }

    public Connection setConncetion (String userName, String userPass) {

        String urlConncetion = "jdbc:mysql://localhost:3306/poleksport";

        try {
            connection = DriverManager.getConnection(urlConncetion, userName, userPass);
            System.out.println("połączenie ustanowione");
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("coś poszło nie tak, błędy login lub hasło");
        }

        return connection;

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void closeConection () {
        try {
            connection.close();
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("połączenie zamknięte");
        }
    }
}
