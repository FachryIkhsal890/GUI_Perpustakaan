package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class LoginController {

    @FXML
    public Button btn_signIn;
    public Button closeBtn;
    Stage stage;

    @FXML
    private void registerLabelClicked() {
        makeRegisterForm();
    }

    public void makeRegisterForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_register.fxml"));
            Stage registerStage =(Stage) closeBtn.getScene().getWindow();
            registerStage.setScene(new Scene(root,1600,900));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void signInButtonInAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_home.fxml"));
            Stage registerStage =(Stage) btn_signIn.getScene().getWindow();
            registerStage.setScene(new Scene(root,1600,900));
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void closeButtonAction(ActionEvent event) {
        stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }


}
