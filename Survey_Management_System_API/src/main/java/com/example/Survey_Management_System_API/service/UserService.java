package com.example.Survey_Management_System_API.service;

import com.example.Survey_Management_System_API.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Long userId, UserDTO usersDTO);
    void deleteUser(Long userId);
}