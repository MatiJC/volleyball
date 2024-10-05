package com.maticuad.volleyballApp.services.implementations;

import com.maticuad.volleyballApp.exceptions.ApiException;
import com.maticuad.volleyballApp.models.Player;
import com.maticuad.volleyballApp.repositories.PlayerRepository;
import com.maticuad.volleyballApp.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IPlayerService implements PlayerService {

    private final PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        return null;
    }

    @Override
    public Player getPlayerById(Long id) throws ApiException {
        return null;
    }

    @Override
    public Player createPlayer(Player player) {

    }

    @Override
    public void updatePlayer(Long playerId) {

    }

    public String playerFullName(Player player) {
        return "";
    }
}
