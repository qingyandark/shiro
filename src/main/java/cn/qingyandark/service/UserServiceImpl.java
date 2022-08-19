package cn.qingyandark.service;

import cn.qingyandark.domain.User;
import cn.qingyandark.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public User getUserByUserName(String username) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.eq(User::getUsername, username);
        return mapper.selectOne(lqw);
    }
}
