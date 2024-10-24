package service.custom;

import dto.TempUserDTO;
import dto.UserDTO;
import javafx.collections.ObservableList;
import service.SuperService;

public interface TempUserService extends SuperService {
    boolean addUser(TempUserDTO tempUserDTO);
    boolean deleteUser(String id);
    ObservableList<UserDTO> getAll();
    boolean updateUser(TempUserDTO tempUserDTO);
    TempUserDTO searchUser(String id);
    ObservableList<String> getUserIds();
}
