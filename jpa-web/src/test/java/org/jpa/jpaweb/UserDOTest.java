package org.jpa.jpaweb;

import lombok.extern.slf4j.Slf4j;
import org.jpa.japcore.pojo.UserDO;
import org.jpa.japcore.repository.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PackageName:org.jpa.japcore
 * @ClassName:UserDOTest
 * @Description:
 * @author: 悟空
 * @date: 2021/4/25 19:53
 * @email: 10947@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserDOTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Before
    public void before() {
    }


    @Test
    public void testAdd() {
        UserDO userDO = new UserDO();
        userDO.setId(1L);
        userDO.setUsername("zhang3");
        log.info("password:{}",passwordEncoder.encode("123456"));
        userDO.setPassword(passwordEncoder.encode("123456"));
        log.info("password:{}",passwordEncoder.encode("123456"));
        //userRepository.save(userDO);
        userDO.setId(2L);
        userDO.setUsername("li4");
        userDO.setPassword(passwordEncoder.encode("program"));
        //userRepository.save(userDO);
    }



    @After
    public void after() {
    }


}
