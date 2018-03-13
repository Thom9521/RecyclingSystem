import java.sql.Connection;
import java.sql.Statement;

public class PantSystem {

    //søger for vores connect til vores DB fra DB_Connector klassen
    static Connection con = DB_Connector.connect();
    static Statement stmt = null;

    public static void getpant(){
        String sql;
        char hentetype;
        
    }
}
