package org.jpa.japcore.repository;

import org.jpa.japcore.pojo.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDO,Long>,JpaSpecificationExecutor {
    UserDO findByUsername(String username);
}
