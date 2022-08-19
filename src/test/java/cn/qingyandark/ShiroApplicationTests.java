package cn.qingyandark;

import cn.qingyandark.domain.User;
import cn.qingyandark.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testMybatis(){
        User userById = userService.getUserById(1);
        System.out.println(userById);
    }

    @Test
    void testSelectByUsername(){
        User user = userService.getUserByUserName("root");
        System.out.println(user);
    }
}
