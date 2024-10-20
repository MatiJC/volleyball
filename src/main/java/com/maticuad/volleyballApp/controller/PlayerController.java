package com.maticuad.volleyballApp.controller;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.model.Api.RestResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerController {
    ResponseEntity<PlayerDTO> getPlayer(Long id);
    ResponseEntity<List<PlayerDTO>> getAllPlayers();
    ResponseEntity<RestResponse<PlayerDTO>> createPlayer(PlayerDTO player);
    ResponseEntity<RestResponse<PlayerDTO>> updatePlayer(Long id);
    ResponseEntity<RestResponse<PlayerDTO>> deletePlayer(Long id);

}
