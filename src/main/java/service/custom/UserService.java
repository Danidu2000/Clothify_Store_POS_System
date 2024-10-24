package service.custom;

import dto.TempUserDTO;
import service.SuperService;

public interface UserService extends SuperService {
    boolean addTempUser (TempUserDTO tempUserDTO);
}
