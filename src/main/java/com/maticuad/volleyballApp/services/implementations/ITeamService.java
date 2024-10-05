package com.maticuad.volleyballApp.services.implementations;

import com.maticuad.volleyballApp.exceptions.ApiException;
import com.maticuad.volleyballApp.models.Player;
import com.maticuad.volleyballApp.models.Team;
import com.maticuad.volleyballApp.repositories.PlayerRepository;
import com.maticuad.volleyballApp.repositories.TeamRepository;
import com.maticuad.volleyballApp.services.PlayerService;
import com.maticuad.volleyballApp.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ITeamService implements TeamService {

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final PlayerService playerService;

    @Override
    public List<Team> getAllTeams() {
        return null;
    }

    @Override
    public Team getTeamByName(String teamName) throws ApiException {
        return null;
    }

    @Override
    public Team getTeamById(Long id) throws ApiException {
        return null;
    }

    @Override
    public List<Player> getTeamRoster(Team team) {
        return null;
    }

    @Override
    public void createTeam() {

    }

    @Override
    public void updateTeam(Long teamId) {

    }

    @Override
    @Transactional
    public void transferPlayer(Long playerId, String teamFromName, String teamDestinationName) throws ApiException {
        Player player = playerService.getPlayerById(playerId);
        Team fromTeam = this.getTeamByName(teamFromName);
        Team destinationTeam = this.getTeamByName(teamDestinationName);
        removePlayer(player, fromTeam);
        addPlayer(player, destinationTeam);

    }

    @Override
    public void removePlayer(Player player, Team team) throws ApiException {
        if (isRosterEmpty(team)) {
            //throw new ApiException(team.teamName() + " is empty");
        }
        if (!isPlayerInTeam(player, team)) {
//            throw new ApiException("Player " + playerService.playerFullName(player) +
//                    " is not in team " + team.teamName());
        }
        this.getTeamRoster(team).remove(player);
    }

    @Override
    public void addPlayer(Player player, Team team) throws ApiException {
        if (isPlayerInTeam(player, team)) {
//            throw new ApiException("Player " + playerService.playerFullName(player) +
//                    " is already in team " + team.teamName());
        }
        if (checkRosterCapacity(team)) {
//            throw new ApiException(team.teamName() + " is full");
        }
        this.getTeamRoster(team).add(player);
    }

    @Override
    public boolean isPlayerInTeam(Player player, Team team) {
        return this.getTeamRoster(team).contains(player);
    }

    @Override
    public boolean isRosterEmpty(Team team) {
        return false;
    }

    @Override
    public boolean checkRosterCapacity(Team team) {
        return false;
    }

    @Override
    public boolean isGenderValid(Player player, Team team) {
        return false;
    }

}
