package com.devesh.backendDemo.Repository;

import com.devesh.backendDemo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
