package com.base.spring.repository;

import com.base.spring.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * Description : TODO()
 * User: h819
 * Date: 2015/12/18
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor {

    @Query("select e from UserEntity e where e.userName=?1")
    Optional<UserEntity> findOneByUserName(String userName);


    @Query("select e from UserEntity e where e.email=?1")
    Optional<UserEntity> findOneByEmail(String email);
}