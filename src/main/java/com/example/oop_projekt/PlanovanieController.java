package com.example.oop_projekt;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;
        import java.io.IOException;


/**
 * táto scéna slúži na rozhodnutie či chceme plánovať výlet podla destinácií alebo podla atrakcií
 */
public class PlanovanieController {

    @FXML
    private AnchorPane anchor;

    @FXML
    private Button bt1;
    @FXML
    private Button bt2;




    @FXML
    private void goToAtrakcie (ActionEvent event) throws IOException {
        Parent atrakcieParent = FXMLLoader.load(getClass().getResource("atrakcie.fxml"));
        Scene atrakcieScene = new Scene(atrakcieParent);
        Stage window = (Stage) bt1.getScene().getWindow();
        window.setScene(atrakcieScene);
        window.show();
    }


    @FXML
    private void goToDestinacie (ActionEvent event) throws IOException {
        Parent destinacieParent = FXMLLoader.load(getClass().getResource("destinacie.fxml"));
        Scene destinacieScene = new Scene(destinacieParent);
        Stage window = (Stage) bt2.getScene().getWindow();
        window.setScene(destinacieScene);
        window.show();
    }

}