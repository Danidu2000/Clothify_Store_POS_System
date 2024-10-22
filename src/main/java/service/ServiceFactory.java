package service;

import dto.*;
import service.custom.UserService;
import service.custom.impl.*;
import util.ServiceType;

public class ServiceFactory {
    private static ServiceFactory instance;
    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return null==instance?instance=new ServiceFactory():instance;
    }

    public <T extends SuperService>T getServiceType(ServiceType type){
        switch (type){
            case USER:return (T)new UserServiceImpl();
            case ORDER:return (T)new OrderServiceImpl();
            case SUPPLIER:return (T)new SupplierServiceImpl();
            case PRODUCT:return (T)new ProductServiceImpl();
            case LOGININFO:return (T)new LoginInfoServiceImpl();
        }
        return null;
    }
}
