package com.maticuad.volleyballApp.service;

import com.maticuad.volleyballApp.model.Persistance.Player;

import java.util.List;

public interface PlayerService extends GenericService<Player> {
    List<Player> getAllPlayersByTeam(String teamName);
    String playerFullName(Player player);
    boolean existsByName(String firstName, String lastName);
}
