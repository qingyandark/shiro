package cn.qingyandark.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_shiro")
public class User {
    private Integer id;
    private String username;
    private String password;
    private String perms;
}
