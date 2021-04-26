package org.jpa.jpaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @PackageName:org.jpa.jpaweb
 * @ClassName:JpaWebApplication
 * @Description:
 * @author: 悟空
 * @date: 2021/4/25 20:31
 * @email: 10947@163.com
 */
@SpringBootApplication
@EnableJpaRepositories("org.jpa.japcore.repository")
@EntityScan("org.jpa.japcore.pojo")
public class JpaWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaWebApplication.class, args);
    }
}
