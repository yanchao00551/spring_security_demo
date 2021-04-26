package org.jpa.jpaweb.config;

import org.jpa.japcore.pojo.UserDO;
import org.jpa.japcore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 获取用户信息
 * @PackageName:org.jpa.jpaweb.config
 * @ClassName:UserDetailsService
 * @Description:
 * @author: 悟空
 * @date: 2021/4/25 21:25
 * @email: 10947@163.com
 */
@Configuration
public class UserDetailsServiceBean implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceBean.class);


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDO user = userRepository.findByUsername(username);

        log.info("user = {}",user);

        return new User(username, user.getPassword(), user.isEnabled(),
                user.isAccountNonExpired(), user.isCredentialsNonExpired(),
                user.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("sys:user:info,ROLE_ADMIN"));
    }

    
}
