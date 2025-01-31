package com.catalogmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.catalogmanager.entity.Poll;
import com.catalogmanager.entity.Vote;
import com.catalogmanager.service.PollService;

import java.util.List;

@Controller
public class PollController {

    @Autowired
    private PollService pollService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/polls")
    public String pollList(Model model) {
        model.addAttribute("polls", pollService.getAllPolls());
        return "poll_list";
    }

    @GetMapping("/poll/{id}")
    public String pollDetails(@PathVariable Long id, Model model) {
        model.addAttribute("poll", pollService.getPollById(id));
        return "poll_details";
    }

    @PostMapping("/vote")
    public String submitVote(@RequestParam Long pollId, @RequestParam String selectedOption) {
        Vote vote = new Vote();
        vote.setPollId(pollId);
        vote.setSelectedOption(selectedOption);
        pollService.saveVote(vote);
        return "vote_confirmation";
    }

    @GetMapping("/create")
    public String createPoll() {
        return "create_poll";
    }

    @PostMapping("/create")
    public String savePoll(@RequestParam String title, @RequestParam String description, @RequestParam List<String> options) {
        Poll poll = new Poll();
        poll.setTitle(title);
        poll.setDescription(description);
        poll.setOptions(options);
        pollService.savePoll(poll);
        return "redirect:/polls";
    }
}