package repository.custom.impl;

import entity.TempUserEntity;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import repository.custom.TempUserDao;
import util.HibernateUtil;

public class TempUserDaoImpl implements TempUserDao {
    @Override
    public boolean save(TempUserEntity tempUserEntity) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist(tempUserEntity);
        session.getTransaction().commit();
        session.close();
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ObservableList<TempUserEntity> getAll() {
        return null;
    }

    @Override
    public boolean update(TempUserEntity tempUserEntity) {
        return false;
    }

    @Override
    public TempUserEntity search(String id) {
        return null;
    }
}
