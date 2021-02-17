

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/cupcake?localTimezone=GMT+2";
    private static final String USER = "bank";
    private static final String PASSWORD="bank";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e)  {
            e.printStackTrace();
            System.out.println("Fejl i connection");
        }
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
