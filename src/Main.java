import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI/sample.fxml"));
        primaryStage.setTitle("Ungdomsskole");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {
        Connection con = DB_Connector.connect();
        PantSystem test = new PantSystem();
        //test.getpant();
        launch(args);


    }
}
