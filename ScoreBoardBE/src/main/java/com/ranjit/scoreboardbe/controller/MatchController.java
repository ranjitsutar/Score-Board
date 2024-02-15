package com.ranjit.scoreboardbe.controller;

import com.ranjit.scoreboardbe.model.Match;
import com.ranjit.scoreboardbe.service.impl.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchServiceImpl matchService;

    public MatchController(MatchServiceImpl matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){

     return new ResponseEntity<>(this.matchService.getAllLiveMatches(), HttpStatus.OK);

    }

}
