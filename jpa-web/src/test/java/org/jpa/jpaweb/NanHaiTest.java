package org.jpa.jpaweb;


import lombok.extern.slf4j.Slf4j;
import org.jpa.japcore.pojo.UserDO;
import org.jpa.japcore.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PackageName:com.nanhai
 * @ClassName:NanHaiTest
 * @Description:
 * @author: 悟空
 * @date: 2021/5/17 22:59
 * @email: 10947@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class NanHaiTest {
    @Autowired
    private UserRepository sysUserRepo;


    @Test
    public void test89(){
        UserDO user = sysUserRepo.findByUsername("zhang3");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode(user.getPassword().trim());
        user.setPassword(encodedPassword);
        sysUserRepo.save(user);
    }

}
