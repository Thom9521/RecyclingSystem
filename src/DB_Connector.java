import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {
//Declare a connection

    private static Connection con = null;
    //JDBC driver
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //the url = jdbc://host name:port#/db name
    private static String url = "jdbc:mysql://localhost:3306/recyclingsystem";
    //user name
    private static String usr = "root";
    //password
    private static String pswrd = "xmeto1234";

    static Connection connect() {
        System.out.println(" \n--Connecting to MySQL JDBC ");


        //locate MySQL JDBC Driver
        try {
            Class.forName(DRIVER);
        }
        //Catch exceptions if JDBC is not found
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(" \n--JDBC driver is missing--");
        }
        System.out.println("\n--MySQL JDBC driver registered--");


        try {
            //Connect to MySQL DB = URL, usrName, pswrd
            con = DriverManager.getConnection(url, usr, pswrd);
        }
        //Catch Exceptions on Connection error
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("\n--Did not connect try again--");

        }
        //if connection successful
        if (con != null) {
            System.out.println("\n--Connection successful--\n");
        } else {
            //if connection fails
            System.out.println("\n-- failed to connect--");
        }

        return con;
    }
}