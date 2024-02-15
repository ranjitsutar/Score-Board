package com.ranjit.scoreboardbe.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "score_bord")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer matchId;
    private  String teamHeading;
    private  String matchNumberVenu;
    private  String battingTeam;
    private  String battingScore;
    private  String bowlingTeam;
    private  String bowlTeamScore;
    private  String liveText;
    private String matchLink;
    private  String textComplete;
    @Enumerated
    private  MatchStatus status;
    private Date date;

    public Match() {
    }
    // set the match status

    public void setmatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }

    public Match(Integer matchId, String teamHeading, String matchNumberVenu, String battingTeam, String battingScore, String bowlingTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenu = matchNumberVenu;
        this.battingTeam = battingTeam;
        this.battingScore = battingScore;
        this.bowlingTeam = bowlingTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenu() {
        return matchNumberVenu;
    }

    public void setMatchNumberVenu(String matchNumberVenu) {
        this.matchNumberVenu = matchNumberVenu;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingScore() {
        return battingScore;
    }

    public void setBattingScore(String battingScore) {
        this.battingScore = battingScore;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
