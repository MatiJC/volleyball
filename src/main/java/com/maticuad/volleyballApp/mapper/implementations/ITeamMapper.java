package com.maticuad.volleyballApp.mapper.implementations;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.model.Persistance.Team;
import com.maticuad.volleyballApp.mapper.PlayerMapper;
import com.maticuad.volleyballApp.mapper.TeamMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ITeamMapper implements TeamMapper {

    private final PlayerMapper playerMapper;

    @Override
    public Team toPersistent(TeamDTO dto) {
        Team team = new Team();
        team.setName(dto.getName());
        team.setId(dto.getId());
        team.setGender(dto.getGender());
        team.setPlayers(this.playerMapper.toPersistent(dto.getPlayers()));
        team.setDeleted(dto.getDeleted());
        return team;
    }

    @Override
    public TeamDTO toDTO(Team team) {
        TeamDTO teamDTO = new TeamDTO();
        teamDTO.setId(team.getId());
        teamDTO.setName(team.getName());
        teamDTO.setGender(team.getGender());
        teamDTO.setPlayers(this.playerMapper.toDTO(team.getPlayers()));
        teamDTO.setDeleted(team.getDeleted());
        return teamDTO;
    }

    @Override
    public List<Team> toPersistent(List<TeamDTO> list) {
        List<Team> teams = new ArrayList<>();
        for (TeamDTO dto : list) {
            teams.add(this.toPersistent(dto));
        }
        return teams;
    }

    @Override
    public List<TeamDTO> toDTO(List<Team> list) {
        List<TeamDTO> teamsDTO  = new ArrayList<>();
        for (Team team : list) {
            teamsDTO.add(this.toDTO(team));
        }
        return teamsDTO;
    }
}
