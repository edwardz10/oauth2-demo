package com.devglan.oauth2demo.dao;

import com.devglan.oauth2demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
  User findByUsername(String username);
}
