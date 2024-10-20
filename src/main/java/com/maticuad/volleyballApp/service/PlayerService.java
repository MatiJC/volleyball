package com.maticuad.volleyballApp.service;

import com.maticuad.volleyballApp.model.Persistance.Player;

import java.util.List;

public interface PlayerService extends GenericService<Player> {
    String playerFullName(Player player);
}
