package com.devglan.oauth2demo.service;

import com.devglan.oauth2demo.model.User;
import java.util.List;

public interface UserService {

  User save(User user);

  List<User> findAll();

  void delete(long id);
}
