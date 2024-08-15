package com.example.Survey_Management_System_API.service;

import com.example.Survey_Management_System_API.dto.PublicPollsDTO;

import java.util.List;
import java.util.Map;

public interface PublicPollsService {
	 PublicPollsDTO createPublicPoll(PublicPollsDTO publicPollsDTO);
	    List<PublicPollsDTO> getAllPublicPolls();
	    List<PublicPollsDTO> getPublicPollsByPollId(Long pollId);
	    List<PublicPollsDTO> getPublicPollsByPublicId(Long publicId);
	    Map<String, Long> countVotesByCategory(Long publicId);
}
