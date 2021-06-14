package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BookListController {
    public Button closeBtnBookList;

    public void closeBtnBookList(ActionEvent event) {
        Stage stage = (Stage) closeBtnBookList.getScene().getWindow();
        stage.close();
    }

    public void blToHomeActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_home.fxml"));
            Stage stage =(Stage) closeBtnBookList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void blToBEActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookExchange.fxml"));
            Stage stage =(Stage) closeBtnBookList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void blToSLActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_studentList.fxml"));
            Stage stage =(Stage) closeBtnBookList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
