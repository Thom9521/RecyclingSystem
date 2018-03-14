import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = DB_Connector.connect();

        PantSystem test = new PantSystem();

        test.getpant("A");

    }
}
