package com.maticuad.volleyballApp.service;

import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.model.Persistance.Team;

import java.util.List;

public interface TeamService extends GenericService<Team> {
    List<Player> getTeamRoster(Team team);
    void transferPlayer(Long playerId, String teamFromName, String teamDestinationName);
    void removePlayer(Player player, Team team);
    void addPlayer(Player player, Team team);
    boolean isPlayerInTeam(Player player, Team team);
    boolean isRosterEmpty(Team team);
    boolean checkRosterCapacity(Team team);
    boolean isGenderValid(Player player, Team team);
}
