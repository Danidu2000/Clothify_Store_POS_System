package controller.popout;

import com.jfoenix.controls.JFXTextField;
import dto.SupplierBasicDTO;
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
        SupplierBasicDTO supplierBasicDTO = new SupplierBasicDTO(txtName.getText(), txtContact.getText());
        boolean b = supplierService.addSupplier(supplierBasicDTO);
        System.out.println(b);
    }

}
