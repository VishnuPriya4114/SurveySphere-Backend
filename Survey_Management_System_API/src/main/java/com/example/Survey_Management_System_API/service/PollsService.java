package com.example.Survey_Management_System_API.service;

import com.example.Survey_Management_System_API.dto.PollsDTO;
import com.example.Survey_Management_System_API.entity.Polls;

import java.util.List;

public interface PollsService {
	PollsDTO createUser(PollsDTO pollsDTO);
	PollsDTO getUserById(Long pollsId);
    List<PollsDTO> getAllUsers();
    List<PollsDTO> getPollsByCategory(String pollCategory);
    List<Polls> getAllPollsByUserId(Long userId);
    void deletePollById(Long pollId) ;

}
