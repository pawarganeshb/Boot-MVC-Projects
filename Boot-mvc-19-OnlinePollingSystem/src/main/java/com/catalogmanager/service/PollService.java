package com.catalogmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogmanager.entity.Poll;
import com.catalogmanager.entity.Vote;
import com.catalogmanager.repository.PollRepository;
import com.catalogmanager.repository.VoteRepository;

import java.util.List;

@Service
public class PollService {
	@Autowired
	private PollRepository pollRepository;

	@Autowired
	private VoteRepository voteRepository;

	public List<Poll> getAllPolls() {
		return pollRepository.findAll();
	}

	public Poll getPollById(Long id) {
		return pollRepository.findById(id).orElse(null);
	}

	public void savePoll(Poll poll) {
		pollRepository.save(poll);
	}

	public void saveVote(Vote vote) {
		voteRepository.save(vote);
	}
}