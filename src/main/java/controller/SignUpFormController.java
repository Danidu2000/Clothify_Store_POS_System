package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SignUpFormController {

    @FXML
    private JFXCheckBox chbAgreement;

    @FXML
    private JFXPasswordField psfPassword;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtFirstName;

    @FXML
    private JFXTextField txtLastName;

    @FXML
    void btnRequestToCreateAccountOnAcion(ActionEvent event) {

    }

}
