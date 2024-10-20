package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.repository.PlayerRepository;
import com.maticuad.volleyballApp.service.PlayerService;
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
    public Player getPlayer(Long id) {
        return null;
    }

    @Override
    public Player createPlayer(Player player) {
        return null;
    }

    @Override
    public void updatePlayer(Long playerId) {

    }

    @Override
    public void deletePlayer(Long playerId) {

    }

    public String playerFullName(Player player) {
        return "";
    }
}
