package com.maticuad.volleyballApp.controllers;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.models.Player;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerController {
    public ResponseEntity<PlayerDTO> getPlayerById(Long id);
    public ResponseEntity<List<PlayerDTO>> getAllPlayers();
    public ResponseEntity<Player> createPlayer(PlayerDTO player);
    public ResponseEntity<PlayerDTO> updatePlayer(Long id);
    public ResponseEntity<PlayerDTO> deletePlayer(Long id);

}
