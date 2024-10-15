package com.maticuad.volleyballApp.controllers.implementations;

import com.maticuad.volleyballApp.controllers.TeamController;
import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.models.Team;
import com.maticuad.volleyballApp.services.TeamService;
import com.maticuad.volleyballApp.translators.TeamTranslator;
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
    public ResponseEntity<List<Team>> getAllTeams() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/{name}")
    public ResponseEntity<Team> getTeamByName(@PathVariable String name) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<Team> createTeam(TeamDTO team) {
        return null;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Team> deleteTeam(@PathVariable Long id) {
        return null;
    }
}
