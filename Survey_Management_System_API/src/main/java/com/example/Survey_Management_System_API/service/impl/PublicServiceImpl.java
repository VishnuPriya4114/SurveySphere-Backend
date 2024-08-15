package com.example.Survey_Management_System_API.service.impl;

import com.example.Survey_Management_System_API.dto.PublicDTO;
import com.example.Survey_Management_System_API.entity.Public;
import com.example.Survey_Management_System_API.repository.PublicRepository;
import com.example.Survey_Management_System_API.service.PublicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublicServiceImpl implements PublicService {

    @Autowired
    private PublicRepository publicRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PublicDTO createUser(PublicDTO publicDTO) {
    	Public user = modelMapper.map(publicDTO, Public.class);
        user = publicRepository.save(user);
        return modelMapper.map(user, PublicDTO.class);
    }

    @Override
    public PublicDTO getUserById(Long publicId) {
    	Public user = publicRepository.findById(publicId).orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(user, PublicDTO.class);
    }

    @Override
    public List<PublicDTO> getAllUsers() { 
        return publicRepository.findAll().stream()
                .map(user -> modelMapper.map(user, PublicDTO.class))
                .collect(Collectors.toList());
    }
    
    public boolean nicknameExists(String nickname) {
        return publicRepository.existsByNickname(nickname);
    }

    
}
