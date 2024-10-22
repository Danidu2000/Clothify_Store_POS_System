package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import dto.LoginInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Pair;
import service.ServiceFactory;
import service.SuperService;
import service.custom.LoginInfoService;
import util.ServiceType;

public class LoginFormController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXPasswordField psfPassword;

    @FXML
    private JFXTextField txtUserName;

    LoginInfoService loginInfoService = ServiceFactory.getInstance().getServiceType(ServiceType.LOGININFO);

    @FXML
    void userLogOnAction(ActionEvent event) {
        LoginInfo loginInfo = new LoginInfo(
                txtUserName.getText(),
                psfPassword.getText()
        );
        Pair<Boolean, String> validate = loginInfoService.isValidate(loginInfo);
        System.out.println(validate);
    }

}
