package service;

import common.Result;
import entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //if I use User ,front must hold the class User
    Result<User> register(User user);

    Result<User> login(String userName, String password);


}
