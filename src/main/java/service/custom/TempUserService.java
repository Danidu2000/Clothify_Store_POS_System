package service.custom;

import dto.UserTempDTO;
import javafx.collections.ObservableList;
import service.SuperService;

public interface TempUserService extends SuperService {
    boolean addUser(UserTempDTO userTempDTO);
    boolean deleteUser(String id);
    ObservableList<UserTempDTO> getAll();
    boolean updateUser(UserTempDTO userTempDTO);
    UserTempDTO searchUser(String id);
    ObservableList<String> getUserIds();
}
