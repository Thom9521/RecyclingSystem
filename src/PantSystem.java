import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PantSystem {

    //sørger for at connecte til vores DB fra DB_Connector klassen
    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    public void getpant() throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast panttypen (A/B/C):");
        String type = input.nextLine();

        String sql;
        double pris = 0;
        while(!type.equals("0")) {
            System.out.println("Indtast panttypen (A/B/C):");
            stmt = con.createStatement();
            sql = "SELECT pris FROM typer WHERE pant = '" + type + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                pris = rs.getDouble("pris");
            }



            if (pris == 1) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
            } else if (pris == 1.5) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
            } else if (pris == 3) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
            }type = input.nextLine();
        }
    }
}



