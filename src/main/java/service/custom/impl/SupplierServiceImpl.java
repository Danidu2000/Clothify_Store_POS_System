package service.custom.impl;

import dto.Supplier;
import service.custom.SupplierService;

public class SupplierServiceImpl implements SupplierService {
    public boolean addSupplier(Supplier supplier){
        System.out.println(supplier);
      return true;
    }
}
