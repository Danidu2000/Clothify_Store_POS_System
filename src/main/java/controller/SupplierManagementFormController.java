package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import service.ServiceFactory;
import service.custom.SupplierService;
import util.ServiceType;

import java.io.IOException;

public class SupplierManagementFormController {
    @FXML
    private JFXComboBox<?> cmbId;

    @FXML
    private JFXComboBox<?> cmdName;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private JFXTextField txtContact;


    @FXML
    void btnAddSupplierOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/popout/add_supplier_popup_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnDeleteSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateSupllierOnAction(ActionEvent event) {

    }


}
