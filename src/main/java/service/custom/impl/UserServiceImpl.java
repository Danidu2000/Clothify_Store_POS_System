package service.custom.impl;

import dto.TempUserDTO;
import service.custom.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean addTempUser(TempUserDTO tempUserDTO) {
        System.out.println(tempUserDTO);
        return false;
    }
}
