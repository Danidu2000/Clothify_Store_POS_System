package service.custom;

import dto.LoginInfo;
import javafx.util.Pair;
import service.SuperService;

public interface LoginInfoService extends SuperService {
    Pair<Boolean, String> isValidate(LoginInfo loginInfo);
}
