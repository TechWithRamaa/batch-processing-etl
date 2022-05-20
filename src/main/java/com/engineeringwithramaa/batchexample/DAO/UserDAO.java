package com.engineeringwithramaa.batchexample.DAO;

import com.engineeringwithramaa.batchexample.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {

}
