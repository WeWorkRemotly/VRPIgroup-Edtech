package com.vrpigroup.users.repositories;

import com.vrpigroup.users.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * UserRepo is a repository interface that holds the user details.
 * @Author Aman Raj
 * @version 1.0
 * @since 2021-06-22
 * @apiNote This is a user repository interface
 * @Conact Us :amanrashm@gmail.com
 */

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<UserEntity, Long> {
   /* UserEntity findByUserNameAAndEmail(String username, String email);

    UserEntity findByUserNameAndPassword(String username, String password);

    UserEntity findByUserName(String username);

    Iterable<UserEntity> findByRole(String role);*/

    Optional<UserEntity> findByEmail(String email);

    Object findByActive(boolean b);

    UserEntity findByName(String name);

    UserEntity findByPhoneNumber(String phoneNumber);
}