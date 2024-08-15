package com.example.Survey_Management_System_API.service.impl;

import com.example.Survey_Management_System_API.dto.PollsDTO;
import com.example.Survey_Management_System_API.entity.Polls;
import com.example.Survey_Management_System_API.repository.PollsRepository;
import com.example.Survey_Management_System_API.service.PollsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PollsServiceImpl implements PollsService {

    @Autowired
    private PollsRepository pollsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PollsDTO createUser(PollsDTO pollsDTO) {
    	Polls user = modelMapper.map(pollsDTO, Polls.class);
        user = pollsRepository.save(user);
        return modelMapper.map(user, PollsDTO.class);
    }

    @Override
    public PollsDTO getUserById(Long pollsId) {
    	Polls user = pollsRepository.findById(pollsId).orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(user, PollsDTO.class);
    }

    @Override
    public List<PollsDTO> getAllUsers() { 
        return pollsRepository.findAll().stream()
                .map(user -> modelMapper.map(user, PollsDTO.class))
                .collect(Collectors.toList());
    }
    
    @Override
    public List<PollsDTO> getPollsByCategory(String pollCategory) {
        return pollsRepository.findAllByPollCategory(pollCategory).stream()
                .map(polls -> modelMapper.map(polls, PollsDTO.class))
                .collect(Collectors.toList());
    }
    
    @Override
    public List<Polls> getAllPollsByUserId(Long userId) {
        return pollsRepository.findAllPollsByUserId(userId);
    }
    
    public void deletePollById(Long pollId) {
        pollsRepository.deleteById(pollId);
    }
    
    
   
    
}
