/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mhk_app;

/**
 *
 * @author mehak
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // Step 1: Establishing a connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Step 2: Create a statement
            Statement statement = connection.createStatement();

            // Step 3: Execute a query
            String query = "SELECT * FROM your_table";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 4: Process the result set
            while (resultSet.next()) {
                // Access columns using resultSet.get<Type>("column_name")
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                // Process the retrieved data
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

