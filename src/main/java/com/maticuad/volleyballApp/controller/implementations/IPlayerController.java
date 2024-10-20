package com.maticuad.volleyballApp.controller.implementations;

import com.maticuad.volleyballApp.controller.PlayerController;
import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.model.Api.RestResponse;
import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.service.PlayerService;
import com.maticuad.volleyballApp.translator.PlayerTranslator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
@CrossOrigin("*")
@RequiredArgsConstructor
public class IPlayerController implements PlayerController {

    private final PlayerService playerService;
    private final PlayerTranslator playerTranslator;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable Long id) {
        PlayerDTO player = this.playerTranslator.toDTO(this.playerService.getById(id));
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<PlayerDTO>> getAllPlayers() {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<RestResponse<PlayerDTO>> createPlayer(@RequestBody @Valid PlayerDTO player) {
        Player created = this.playerService.create(this.playerTranslator.toPersistent(player));
        return null;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<PlayerDTO>> updatePlayer(@PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<PlayerDTO>> deletePlayer(@PathVariable Long id) {
        return null;
    }
}

