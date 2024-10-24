package service.custom.impl;

import dto.UserTempDTO;
import service.custom.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean addTempUser(UserTempDTO userTempDTO) {
        System.out.println(userTempDTO);
        return false;
    }
}
