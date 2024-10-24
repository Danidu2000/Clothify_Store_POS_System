package service.custom.impl;

import dto.UserTempDTO;
import entity.TempUserEntity;
import javafx.collections.ObservableList;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.TempUserDao;
import service.custom.TempUserService;
import util.DaoType;

public class TempUserServiceImpl implements TempUserService {

    TempUserDao tempUserDao = DaoFactory.getInstance().getDaoType(DaoType.TEMPUSER);
    @Override
    public boolean addUser(UserTempDTO userTempDTO) {
        try {
            TempUserEntity entity = new ModelMapper().map(userTempDTO, TempUserEntity.class);
            tempUserDao.save(entity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public ObservableList<UserTempDTO> getAll() {
        return null;
    }

    @Override
    public boolean updateUser(UserTempDTO userTempDTO) {
        return false;
    }

    @Override
    public UserTempDTO searchUser(String id) {
        return null;
    }

    @Override
    public ObservableList<String> getUserIds() {
        return null;
    }
}
