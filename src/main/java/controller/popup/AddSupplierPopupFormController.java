package controller.popup;

import com.jfoenix.controls.JFXTextField;
import dto.SupplierBasicDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import service.ServiceFactory;
import service.custom.SupplierService;
import util.ServiceType;

public class AddSupplierPopupFormController {

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtName;

    SupplierService supplierService = ServiceFactory.getInstance().getServiceType(ServiceType.SUPPLIER);

    @FXML
    void btnAddSupplierOnAction(ActionEvent event) {
        SupplierBasicDTO supplierBasicDTO = new SupplierBasicDTO(txtName.getText(), txtContact.getText());
        boolean b = supplierService.addSupplier(supplierBasicDTO);
        System.out.println(b);
    }

}
