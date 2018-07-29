package JDBC.sql.tests;

import JDBC.sql.helper.DBConnect;

public class TestConnectionDB {

    public static void main(String[] args) {

        DBConnect dbConnect = new DBConnect();

        dbConnect.driverRegister();

        dbConnect.setConncetion("root", "C!ec666");

    }
}
