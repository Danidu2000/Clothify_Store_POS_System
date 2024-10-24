package repository;

import repository.custom.impl.TempUserDaoImpl;
import util.DaoType;

public class DaoFactory {
    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance==null?instance=new DaoFactory():instance;
    }

    public <T extends SuperDao>T getDaoType(DaoType type){
        switch (type){
            case TEMPUSER:return (T) new TempUserDaoImpl();
        }
        return null;

    }
}
