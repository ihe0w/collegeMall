package dao;

import entity.User;

public interface UserDao {
    //显然用userName find user是个愚蠢的主意
    int checkUserName(String userName);
    int insertUser(User user);
}
