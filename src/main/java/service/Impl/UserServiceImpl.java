package service.Impl;

import common.Result;
import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import util.Md5Util;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public Result<User> register(User user) {
        if (userDao.checkUserName(user.getUserName())>0)
            return Result;
        String md5Password= Md5Util.getMd5(user.getPassword());
        user.setPassword(md5Password);
        userDao.insertUser(user);
        return Result.createBySuccess();
    }

    @Override
    public Result<User> login(String userName, String password) {
        return null;
    }
}
