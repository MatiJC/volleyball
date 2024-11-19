package com.maticuad.volleyballApp.mapper;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.model.Persistance.Team;

import java.util.List;

public interface TeamMapper {
    Team toPersistent(TeamDTO dto);
    TeamDTO toDTO(Team team);
    List<Team> toPersistent(List<TeamDTO> list);
    List<TeamDTO> toDTO(List<Team> list);
}
