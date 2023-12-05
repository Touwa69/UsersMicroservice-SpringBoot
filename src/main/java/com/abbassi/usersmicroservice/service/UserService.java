package com.abbassi.usersmicroservice.service;

import com.abbassi.usersmicroservice.entities.Role;
import com.abbassi.usersmicroservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}
