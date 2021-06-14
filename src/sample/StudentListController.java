package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StudentListController {
    public Button closeBtnStudentList;

    public void closeBtnStudentListAction(ActionEvent event) {
        Stage stage = (Stage) closeBtnStudentList.getScene().getWindow();
        stage.close();
    }

    public void slToHomeActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_home.fxml"));
            Stage stage =(Stage) closeBtnStudentList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void slToBEActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookExchange.fxml"));
            Stage stage =(Stage) closeBtnStudentList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void slToBLActionClicked(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../layout/layout_bookList.fxml"));
            Stage stage =(Stage) closeBtnStudentList.getScene().getWindow();
            stage.setScene(new Scene(root,1600,900));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
