package com.maticuad.volleyballApp.translators;

import com.maticuad.volleyballApp.dto.TeamDTO;
import com.maticuad.volleyballApp.models.Team;

public interface TeamTranslator {
    public Team toPersistent(TeamDTO dto);
    public TeamDTO toDTO(Team team);
}
