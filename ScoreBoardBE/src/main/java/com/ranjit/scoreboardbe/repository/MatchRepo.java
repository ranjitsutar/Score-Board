package com.ranjit.scoreboardbe.repository;

import com.ranjit.scoreboardbe.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MatchRepo extends JpaRepository<Match, Integer> {
    //provide
    Optional<Match> findByTeamHeading(String teamHeading);

}
