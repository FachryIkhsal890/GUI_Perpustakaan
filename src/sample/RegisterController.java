package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private Stage stage;
    public Button closeBtnRegister;

    public void closeBtnRegisterAction(ActionEvent event) {
        stage =  (Stage) closeBtnRegister.getScene().getWindow();
        stage.close();
    }

    public void alreadyHaveAccountLogin(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_login.fxml"));
            Stage primaryStage = (Stage) closeBtnRegister.getScene().getWindow();
            primaryStage.setTitle("Read Book");
            primaryStage.setScene(new Scene(root, 1600, 900));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
