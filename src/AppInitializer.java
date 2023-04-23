import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLOutput;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("started....");
        new Student().printName();
    }
}
