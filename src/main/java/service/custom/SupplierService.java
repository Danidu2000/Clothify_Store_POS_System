package service.custom;

import dto.SupplierBasicDTO;
import service.SuperService;

public interface SupplierService extends SuperService {
    boolean addSupplier(SupplierBasicDTO supplierBasicDTO);
}
