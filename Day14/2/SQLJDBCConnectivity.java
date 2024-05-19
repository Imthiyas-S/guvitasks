package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLJDBCConnectivity {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/imthiyas";
        String user = "root";
        String password = "Hogwarts07$$";


        String insertQuery = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {


            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Jenny");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 10000);


            preparedStatement.executeUpdate();

            
            preparedStatement.setInt(1, 102);
            preparedStatement.setString(2, "Jacky");
            preparedStatement.setInt(3, 30);
            preparedStatement.setDouble(4, 20000);
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 103);
            preparedStatement.setString(2, "Joe");
            preparedStatement.setInt(3, 20);
            preparedStatement.setDouble(4, 40000);
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 104);
            preparedStatement.setString(2, "Jhon");
            preparedStatement.setInt(3, 40);
            preparedStatement.setDouble(4, 80000);
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 105);
            preparedStatement.setString(2, "Shameer");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 90000);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
