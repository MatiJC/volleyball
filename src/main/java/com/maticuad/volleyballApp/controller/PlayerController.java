package com.maticuad.volleyballApp.controller;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerController {
    ResponseEntity<PlayerDTO> getPlayer(Long id);
    ResponseEntity<List<PlayerDTO>> getAllPlayers();
    ResponseEntity<Long> createPlayer(PlayerDTO player);
    ResponseEntity<Long> updatePlayer(PlayerDTO player, Long id);
    ResponseEntity<Long> deletePlayer(Long id);

}
