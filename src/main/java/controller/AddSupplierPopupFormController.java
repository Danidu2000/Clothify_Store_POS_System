package controller;

import com.jfoenix.controls.JFXTextField;
import dto.Supplier;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import service.ServiceFactory;
import service.custom.SupplierService;
import util.ServiceType;

public class AddSupplierPopupFormController {
    SupplierService supplierService = ServiceFactory.getInstance().getServiceType(ServiceType.SUPPLIER);
    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtName;

    @FXML
    void btnAddSupplierOnAction(ActionEvent event) {
        Supplier supplier = new Supplier(txtName.getText(), txtContact.getText());
        boolean b = supplierService.addSupplier(supplier);
        System.out.println(b);
    }

}
