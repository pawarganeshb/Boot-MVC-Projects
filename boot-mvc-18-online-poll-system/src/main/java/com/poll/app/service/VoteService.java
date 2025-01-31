package com.poll.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poll.app.entity.PollEntity;
import com.poll.app.repository.OptionRepository;
import com.poll.app.repository.PollRepository;

@Service
public class VoteService {
	@Autowired
	private PollRepository pollRepository;

	@Autowired
	private OptionRepository optionRepository;

	public PollEntity createPoll(PollEntity poll) {
		return pollRepository.save(poll);
	}

	public List<PollEntity> getAllPolls() {
		return pollRepository.findAll();
	}

	public Optional<PollEntity> getPollById(Integer id) {
		return pollRepository.findById(id);
	}
}
