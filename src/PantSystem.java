import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PantSystem {

    //sørger for at connecte til vores DB fra DB_Connector klassen
    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    public void getpant(String type) throws SQLException{



            Scanner input = new Scanner(System.in);

            System.out.println("Indtast panttypen (A/B/C):");
            //String type = input.nextLine();

            if (type == "A") {
                System.out.println("Du har valgt pant A");
            } else {
                System.out.println("Fuck off");
            }

            String sql;
            String hentetype = "";
            sql = "SELECT pris FROM typer WHERE panttype = '" + type + "'";

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                hentetype = rs.getString("panttype");
            }
                if (hentetype == type){
                    System.out.println("Du har valgt pant " + type + " med prisen: " + sql);
                }
        }
        }



