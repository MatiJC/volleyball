package com.maticuad.volleyballApp.controllers;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.models.Team;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamController {
    public ResponseEntity<Team> createTeam(TeamDTO team);
    public ResponseEntity<Team> updateTeam(Long id);
    public ResponseEntity<Team> deleteTeam(Long id);
    public ResponseEntity<List<Team>> getAllTeams();
    public ResponseEntity<Team> getTeamById(Long id);
    public ResponseEntity<Team> getTeamByName(String name);
}
