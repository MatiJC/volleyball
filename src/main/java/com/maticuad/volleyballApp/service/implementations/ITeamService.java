package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.model.Persistance.Team;
import com.maticuad.volleyballApp.repository.PlayerRepository;
import com.maticuad.volleyballApp.repository.TeamRepository;
import com.maticuad.volleyballApp.service.PlayerService;
import com.maticuad.volleyballApp.service.TeamService;
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
    public Team getById(Long id) {
        return null;
    }

    @Override
    public List<Team> getAll() {
        return List.of();
    }

    @Override
    public Long create(Team entity) {
        return null;
    }

    @Override
    public Long update(Team team, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void preCreate(Team entity) {

    }

    @Override
    public void preUpdate(Team entity) {

    }

    @Override
    public boolean existsByName(String name) {
        return this.teamRepository.findByName(name).isPresent();
    }

    @Override
    @Transactional
    public void transferPlayer(Long playerId, String teamFromName, String teamDestinationName) {
        Player player = playerService.getById(playerId);
//        Team fromTeam = this.getTeamByName(teamFromName);
//        Team destinationTeam = this.getTeamByName(teamDestinationName);
//        removePlayer(player, fromTeam);
//        addPlayer(player, destinationTeam);

    }

    @Override
    public void removePlayer(Player player, Team team) {
        if (isRosterEmpty(team)) {

        }
        if (!isPlayerInTeam(player, team)) {
        }

    }

    @Override
    public void addPlayer(Player player, Team team) {
        if (isPlayerInTeam(player, team)) {

        }
        if (checkRosterCapacity(team)) {

        }
    }

    @Override
    public boolean isPlayerInTeam(Player player, Team team) {
        return false;
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
