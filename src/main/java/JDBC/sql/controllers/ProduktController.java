package JDBC.sql.controllers;

import JDBC.sql.ProductNotFoundExcptions;
import com.mysql.jdbc.PacketTooBigException;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class ProduktController {

    private Connection connection;

    public ProduktController (Connection connection) {
        this.connection = connection;
    }

    public void wypiszProdukty() throws SQLException {
        String sql = "SELECT * FROM produkty";
        Statement cursor = connection.createStatement();
        ResultSet produkty = cursor.executeQuery(sql);

        while (produkty.next()) {
            System.out.print(produkty.getInt("id_p") + " | ");
            System.out.print(produkty.getString("name_p") + " | ");
            System.out.print(produkty.getDouble("price_p") + " | ");
            System.out.println(produkty.getInt("id_o"));
        }
        //connection.close();
        //System.out.println("połączenie zamknięte");
    }

    public void wpiszProdukty (String name_p, double price_p, int id_o) throws SQLException {

        System.out.println("wpradzam proukty");
        String sql = "INSERT INTO produkty (name_p, price_p, id_o) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, name_p);
        preparedStatement.setDouble(2, price_p);
        preparedStatement.setInt(3, id_o);

        preparedStatement.executeUpdate();

        //connection.close();
    }

    public void zmienOpiekunaProduktu(int id_p, int id_o) throws SQLException {

        String sql = "UPDATE produkty SET id_o = ? WHERE id_p = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id_o);
        preparedStatement.setInt(2, id_p);

        preparedStatement.executeUpdate();
    }

    public void wypiszProd(int id_p) throws SQLException {

        String wyrzut = "";
        String sql = "SELECT * FROM produkty WHERE id_p = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id_p);
        ResultSet produkty = preparedStatement.executeQuery();


        while (produkty.next()) {
            wyrzut = produkty.getInt("id_p") + " | "  +
                     produkty.getString("name_p") + " | " +
                     produkty.getDouble("price_p") + " | " +
                     produkty.getInt("id_o");
        }
        if (wyrzut.isEmpty() ) {
            System.out.println("-= brak takiego ID =-");
        } else {
            System.out.println(wyrzut);
        }


    }

    public void usunProdukt (int id_p) throws SQLException {

        String sql = "DELETE FROM produkty WHERE id_p = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id_p);
        Scanner scanner = new Scanner(System.in);

        System.out.println("czy chcesz usunąć? < T / N > ");

        if(scanner.nextLine().equals("T")){
            preparedStatement.executeUpdate();
            System.out.println("usuwam");
        } else {
            System.out.println("nie usuwam");
        }

    }

    private boolean sprawdzaj(int id_p) throws SQLException {

        String sql = "SELECT * FROM produkty WHERE id_p = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id_p);
        ResultSet rs = preparedStatement.executeQuery();

        int produkt_id = 0;
        while (rs.next()) {
            produkt_id = rs.getInt("id_p");
        }

        if(produkt_id == 0 ) {
            return false;
        }

        return true;
    }

    public void poka(int id_p) throws SQLException, ProductNotFoundExcptions {

        if(sprawdzaj(id_p)) {

            String sql = "SELECT * FROM produkty WHERE id_p = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_p);
            ResultSet produkty = preparedStatement.executeQuery();
            System.out.println();

            while (produkty.next()) {
                System.out.printf(produkty.getInt("id_p") + " | ");
                System.out.print(produkty.getString("name_p") + " | ");
                System.out.print(produkty.getDouble("price_p") + " | ");
                System.out.println(produkty.getInt("id_o"));
            }
        } else {
            //System.out.println("--== nima! ==--");
            throw new ProductNotFoundExcptions("--== nima! ==--");
        }

    }


}
