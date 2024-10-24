package repository.custom.impl;

import entity.TempUserEntity;
import entity.UserEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.query.Query;
import repository.custom.UserDao;
import util.HibernateUtil;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(UserEntity userEntity) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist(userEntity);
        session.getTransaction().commit();
        session.close();
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ObservableList<UserEntity> getAll() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Query<UserEntity> query = session.createQuery("FROM UserEntity", UserEntity.class);
        List<UserEntity> userList = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return FXCollections.observableArrayList(userList);
    }

    @Override
    public boolean update(UserEntity userEntity) {
        return false;
    }

    @Override
    public UserEntity search(String id) {
        return null;
    }
}
