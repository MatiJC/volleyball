package com.maticuad.volleyballApp.controller;

import com.maticuad.volleyballApp.dto.TeamDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamController {
    ResponseEntity<List<TeamDTO>> getAllTeams();
    ResponseEntity<TeamDTO> getTeam(Long id);
    ResponseEntity<TeamDTO> getTeamByName(String name);
    ResponseEntity<Long> createTeam(TeamDTO team);
    ResponseEntity<Long> updateTeam(TeamDTO team, Long id);
    ResponseEntity<Long> deleteTeam(Long id);
}
