package com.ranjit.scoreboardbe.service;

import com.ranjit.scoreboardbe.model.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getAllLiveMatches();
    //get CWC table

    List<List<String>> getPointTable();

}
