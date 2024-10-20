package com.maticuad.volleyballApp.controller.implementations;

import com.maticuad.volleyballApp.controller.TeamController;
import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.model.Api.RestResponse;
import com.maticuad.volleyballApp.service.TeamService;
import com.maticuad.volleyballApp.translator.TeamTranslator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ITeamController implements TeamController {

    private final TeamService teamService;
    private final TeamTranslator teamTranslator;

    @Override
    @GetMapping
    public ResponseEntity<List<TeamDTO>> getAllTeams() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<TeamDTO> getTeam(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/{name}")
    public ResponseEntity<TeamDTO> getTeamByName(@PathVariable String name) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<RestResponse<TeamDTO>> createTeam(@Valid @RequestBody TeamDTO team) {
        return null;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<TeamDTO>> updateTeam(@PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<TeamDTO>> deleteTeam(@PathVariable Long id) {
        return null;
    }
}
