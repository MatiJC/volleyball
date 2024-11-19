package com.maticuad.volleyballApp.controller.implementations;

import com.maticuad.volleyballApp.controller.TeamController;
import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.service.TeamService;
import com.maticuad.volleyballApp.mapper.TeamMapper;
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
    private final TeamMapper teamMapper;

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
    public ResponseEntity<Long> createTeam(@Valid @RequestBody TeamDTO team) {
        return null;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Long> updateTeam(@RequestBody @Valid TeamDTO team,
                                           @PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteTeam(@PathVariable Long id) {
        return null;
    }
}
