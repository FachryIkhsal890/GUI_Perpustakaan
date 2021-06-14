package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomeController {
    @FXML
    public Button closeBtnHome;
    Stage stage;


    /**
    Navigation to each page
     */
    public void homeToBEAction(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookExchange.fxml"));
            Stage stage =(Stage) closeBtnHome.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void homeToBLAction(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookList.fxml"));
            Stage stage =(Stage) closeBtnHome.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void homeToSLAction(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_studentList.fxml"));
            Stage stage =(Stage) closeBtnHome.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void closeBtnHomeAction(ActionEvent event) {
        stage = (Stage) closeBtnHome.getScene().getWindow();
        stage.close();
    }
}
