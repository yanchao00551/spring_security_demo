package org.jpa.japcore.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

/**
 * @PackageName:org.jpa.japcore.pojo
 * @ClassName:UserDO
 * @Description:
 * @author: 悟空
 * @date: 2021/4/25 19:50
 * @email: 10947@163.com
 */
@Data
@Entity
@ToString
@Table(name = "auth_user")
public class UserDO implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    private String username;
    @Column(length = 128)
    private String password;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
