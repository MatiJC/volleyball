package com.maticuad.volleyballApp.services;

import com.maticuad.volleyballApp.exceptions.ApiException;
import com.maticuad.volleyballApp.models.Player;
import com.maticuad.volleyballApp.models.Team;

import java.util.List;

public interface TeamService {
    List<Team> getAllTeams();
    Team getTeamByName(String teamName) throws ApiException;
    Team getTeamById(Long id) throws ApiException;
    List<Player> getTeamRoster(Team team) throws ApiException;
    void createTeam();
    void updateTeam(Long teamId);
    void deleteTeam(Long teamId);
    void transferPlayer(Long playerId, String teamFromName, String teamDestinationName) throws ApiException;
    void removePlayer(Player player, Team team) throws ApiException;
    void addPlayer(Player player, Team team) throws ApiException;
    boolean isPlayerInTeam(Player player, Team team);
    boolean isRosterEmpty(Team team);
    boolean checkRosterCapacity(Team team);
    boolean isGenderValid(Player player, Team team);
}
