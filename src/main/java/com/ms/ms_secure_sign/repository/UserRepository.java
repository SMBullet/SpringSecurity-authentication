package com.ms.ms_secure_sign.repository;

import com.ms.ms_secure_sign.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByPhone(String phone);
}