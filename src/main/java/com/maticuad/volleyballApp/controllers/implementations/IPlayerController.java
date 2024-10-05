package com.maticuad.volleyballApp.controllers.implementations;

import com.maticuad.volleyballApp.controllers.PlayerController;
import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.models.Player;
import com.maticuad.volleyballApp.services.PlayerService;
import com.maticuad.volleyballApp.translators.PlayerTranslator;
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
    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO player) {
        Player created = this.playerService.createPlayer(this.playerTranslator.toPersistent(player));
        return ResponseEntity.ok(created);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<PlayerDTO> updatePlayer(@PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<PlayerDTO> deletePlayer(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<PlayerDTO> getPlayerById(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<PlayerDTO>> getPlayers() {
        return null;
    }
}

