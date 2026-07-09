package com.elliandemo.demo_jpa_hibernate.repositories;

import com.elliandemo.demo_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
