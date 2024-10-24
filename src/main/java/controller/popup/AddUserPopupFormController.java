package controller.popup;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import dto.TempUserDTO;
import dto.UserDTO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.id.IdentifierGenerator;
import service.ServiceFactory;
import service.custom.TempUserService;
import util.ServiceType;

import java.net.URL;
import java.util.ResourceBundle;

public class AddUserPopupFormController implements Initializable {

    @FXML
    private JFXButton btnSearchUserOnAction;

    @FXML
    private JFXComboBox<?> cmbId;

    @FXML
    private JFXComboBox<?> cmbRole;

    @FXML
    private JFXComboBox<?> cmdName;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableView<UserDTO> tblTempUser;

    @FXML
    private JFXTextField txtEmail;

    TempUserService tempUserService = ServiceFactory.getInstance().getServiceType(ServiceType.TEMPUSER);

    @FXML
    void btnAddUserOnAction(ActionEvent event) {
    }

    @FXML
    void btnReloadTableOnAction(ActionEvent event) {
        loadTable();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        loadTable();
    }

    private void loadTable(){
        ObservableList<UserDTO> tempUserObservableList = tempUserService.getAll();
        tblTempUser.setItems(tempUserObservableList);
        System.out.println(tempUserObservableList);
    }
}
