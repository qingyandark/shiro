package cn.qingyandark.service;

import cn.qingyandark.domain.User;

public interface UserService {
    User getUserById(int id);
    User getUserByUserName(String usrname);
}
