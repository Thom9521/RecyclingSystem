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

        ArrayList<String> bottles = new ArrayList<String>();
        double samletPris = 0;

        String sql;
        double pris = 0;

        while(!type.equals("0")) {

            double sp  = 0;

            stmt = con.createStatement();
            sql = "SELECT pris FROM typer WHERE pant = '" + type + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                pris = rs.getDouble("pris");
            }

            if (pris == 1) {
                System.out.println("Du har valgt pant '" + type + "' med prisen: " + pris + " kr.");
                samletPris = samletPris + 1;
                bottles.add("A");
            } else if (pris == 1.5) {
                System.out.println("Du har valgt pant '" + type + "' med prisen: " + pris + " kr.");
                samletPris = samletPris + 1.5;
                bottles.add("B");
            } else if (pris == 3) {
                System.out.println("Du har valgt pant '" + type + "' med prisen: " + pris + " kr.");
                samletPris = samletPris + 3;
                bottles.add("C");

            }
            System.out.println("Indtast panttypen (A/B/C) eller afslut med 0:");
                type = input.nextLine();

        }
        System.out.println("Din samlede pris er: " + samletPris + " kr. med et antal af "+ bottles.size() +" flasker." +
                "\nDu har indsat de følgende panttyper:"  + bottles);
    }
    

}



