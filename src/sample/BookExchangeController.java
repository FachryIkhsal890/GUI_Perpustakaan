package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BookExchangeController {
    public Button closeBtnBookExchange;

    public void closeBtnBookExchangeAction(ActionEvent event) {
        Stage stage = (Stage) closeBtnBookExchange.getScene().getWindow();
        stage.close();
    }

    public void beToHomeActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_home.fxml"));
            Stage stage =(Stage) closeBtnBookExchange.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void beToBLActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookList.fxml"));
            Stage stage =(Stage) closeBtnBookExchange.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void beToSLActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_studentList.fxml"));
            Stage stage =(Stage) closeBtnBookExchange.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
