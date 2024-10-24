package service.custom.impl;

import dto.SupplierBasicDTO;
import service.custom.SupplierService;

public class SupplierServiceImpl implements SupplierService {
    public boolean addSupplier(SupplierBasicDTO supplierBasicDTO){
        System.out.println(supplierBasicDTO);
      return true;
    }
}
