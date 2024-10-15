package com.maticuad.volleyballApp.services;

import com.maticuad.volleyballApp.exceptions.ApiException;
import com.maticuad.volleyballApp.models.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(Long id) throws ApiException;
    Player createPlayer(Player player);
    void updatePlayer(Long playerId);
    void deletePlayer(Long playerId);
    String playerFullName(Player player);
}
