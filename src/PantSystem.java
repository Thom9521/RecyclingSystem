import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PantSystem {

    //sørger for at connecte til vores DB fra DB_Connector klassen
    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    public void getpant() throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast panttypen (A/B/C) eller afslut med 0:");
        String type = input.nextLine();

        ArrayList<String> teste = new ArrayList<String>();
        double samletPris = 0;

        String sql;
        double pris = 0;

        while(!type.equals("0")) {

            double sp  = 0;

            System.out.println("Indtast panttypen (A/B/C) eller afslut med 0:");

            stmt = con.createStatement();
            sql = "SELECT pris FROM typer WHERE pant = '" + type + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                pris = rs.getDouble("pris");
            }

            if (pris == 1) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
                samletPris = samletPris + 1;
            } else if (pris == 1.5) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
                samletPris = samletPris + 1.5;
            } else if (pris == 3) {
                System.out.println("Du har valgt pant " + type + " med prisen: " + pris);
                samletPris = samletPris + 3;

            }

                type = input.nextLine();
        }
        System.out.println("Din samlede pris er: " + samletPris + " kr.");
    }
    

}



