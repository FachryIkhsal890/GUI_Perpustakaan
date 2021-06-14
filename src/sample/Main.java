package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_login.fxml"));
            primaryStage.setTitle("Read Book");
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(new Scene(root, 1600, 900));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e);
        }

    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}
