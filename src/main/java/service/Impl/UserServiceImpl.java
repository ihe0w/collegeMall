package service.Impl;

import common.Const;
import common.Result;
import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;
import util.Md5Util;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public Result<User> register(User user) {
        if (userDao.checkUserName(user.getUserName())>0)
            return Result.createResult(Const.FAILED,null);
        String md5Password= Md5Util.getMd5(user.getPassword());
        user.setPassword(md5Password);
        userDao.insertUser(user);
        return Result.createResult(Const.SUCCESS,null);
    }

    @Override
    public Result<User> login(String userName, String password) {
        if (userDao.checkUserName(userName)>0)
            return Result.createResult(Const.FAILED,null);
        String md5Password= Md5Util.getMd5(password);
        User user1=userDao.selectUserByUserName(userName);
        if (md5Password.equals(user1.getPassword()))
            return Result.createResult(Const.SUCCESS,null);
        return Result.createResult(Const.FAILED,null);
    }
}
