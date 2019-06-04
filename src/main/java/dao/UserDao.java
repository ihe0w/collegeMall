package dao;

import entity.User;

public interface UserDao {
    //显然用userName find user是个愚蠢的主意
    int checkUserName(String userName);
    int insertUser(User user);
    //todo:我应该select password or select user,user ! may be I need return some data in user
    //no I can't select name and get password
    User selectUserByUserName(String userName);
}
