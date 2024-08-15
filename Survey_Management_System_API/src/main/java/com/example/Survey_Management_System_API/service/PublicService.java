package com.example.Survey_Management_System_API.service;

import com.example.Survey_Management_System_API.dto.PublicDTO;

import java.util.List;

public interface PublicService {
	PublicDTO createUser(PublicDTO publicDTO);
	PublicDTO getUserById(Long publicId);
    List<PublicDTO> getAllUsers();
    boolean nicknameExists(String nickname);

}
