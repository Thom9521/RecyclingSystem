import java.sql.*;

public class DB_Statements {

    //  Declare a Statment
    private static Statement stmt = null;

    //   Declare a connection
    private static Connection con = DB_Connector.connect();
    //Deckare a result set
    private static ResultSet rs = null;

    //Declare a preparedstatement
    private static PreparedStatement pst = null;

    // Method to create a new Database
    public void createNewDB(String DB_Name) {
        //   SQL statement
        String query = "create database if not exists recyclingsystem " + DB_Name;

        try {

            //   connection
            stmt = con.createStatement();

            //   execute statement
            stmt.executeUpdate(query);
            System.out.println("\n--Dabase " + DB_Name + " created--");
        } catch (SQLException ex) {

            //   handle sql exceptions
            System.out.println("\n --Statement did not execute--");
            ex.printStackTrace();
        }
    }

    //method to use a database
    public void useDB(String DB_Name) {
        //statement
        String query = "use " + DB_Name;
        try {
            //connection
            stmt = con.createStatement();
            //execute query
            stmt.executeUpdate(query);
            System.out.println("\n--using--" + DB_Name + "--");

        } catch (SQLException ex) {
            //handle sql exceptions
            System.out.println("\n--Query did not execute--");
            ex.printStackTrace();

        }
    }}