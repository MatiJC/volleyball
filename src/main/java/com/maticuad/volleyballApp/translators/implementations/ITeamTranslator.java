package com.maticuad.volleyballApp.translators.implementations;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.models.Team;
import com.maticuad.volleyballApp.translators.PlayerTranslator;
import com.maticuad.volleyballApp.translators.TeamTranslator;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class ITeamTranslator implements TeamTranslator{

    private PlayerTranslator playerTranslator;

    @Override
    public Team toPersistent(TeamDTO dto) {
        Team team = new Team();
        team.setName(dto.getName());
        team.setId(dto.getId());
        team.setGender(dto.getGender());
        team.setPlayers(this.playerTranslator.toPersistent(dto.getPlayers()));
        return team;

    }

    @Override
    public TeamDTO toDTO(Team team) {
        TeamDTO teamDTO = new TeamDTO();
        teamDTO.setId(team.getId());
        teamDTO.setName(team.getName());
        teamDTO.setGender(team.getGender());
        teamDTO.setPlayers(this.playerTranslator.toDTO(team.getPlayers()));
        return teamDTO;

    }
}
