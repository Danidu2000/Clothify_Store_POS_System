package service.custom;

import dto.UserTempDTO;
import service.SuperService;

public interface UserService extends SuperService {
    boolean addTempUser (UserTempDTO userTempDTO);
}
