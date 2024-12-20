package com.maticuad.volleyballApp.service;

import com.maticuad.volleyballApp.dto.ChangePasswordDTO;
import com.maticuad.volleyballApp.model.Persistance.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserByUsername(String username);
    void changePassword(ChangePasswordDTO request, Principal user);
}
