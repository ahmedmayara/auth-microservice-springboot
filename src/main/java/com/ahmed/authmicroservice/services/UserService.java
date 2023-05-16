package com.ahmed.authmicroservice.services;

import com.ahmed.authmicroservice.entities.Role;
import com.ahmed.authmicroservice.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String roleName);
    List<User> findAllUsers();
}
