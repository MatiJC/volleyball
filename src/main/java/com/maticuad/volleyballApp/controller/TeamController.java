package com.maticuad.volleyballApp.controller;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.model.Api.RestResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamController {
    ResponseEntity<List<TeamDTO>> getAllTeams();
    ResponseEntity<TeamDTO> getTeam(Long id);
    ResponseEntity<TeamDTO> getTeamByName(String name);
    ResponseEntity<RestResponse<TeamDTO>> createTeam(TeamDTO team);
    ResponseEntity<RestResponse<TeamDTO>> updateTeam(Long id);
    ResponseEntity<RestResponse<TeamDTO>> deleteTeam(Long id);
}
