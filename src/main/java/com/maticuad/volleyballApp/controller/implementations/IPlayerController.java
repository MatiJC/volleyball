package com.maticuad.volleyballApp.controller.implementations;

import com.maticuad.volleyballApp.controller.PlayerController;
import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.service.PlayerService;
import com.maticuad.volleyballApp.mapper.PlayerMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
@CrossOrigin("*")
@RequiredArgsConstructor
public class IPlayerController implements PlayerController {

    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable Long id) {
        PlayerDTO player = this.playerMapper.toDTO(this.playerService.getById(id));
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<PlayerDTO>> getAllPlayers() {
        List<PlayerDTO> players = this.playerMapper.toDTO(this.playerService.getAll());
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<Long> createPlayer(@RequestBody @Valid PlayerDTO player) {
        Long created = this.playerService.create(this.playerMapper.toPersistent(player));
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Long> updatePlayer(@RequestBody @Valid PlayerDTO player,
                                               @PathVariable Long id) {
        Long updated = this.playerService.update(this.playerMapper.toPersistent(player), id);
        return new ResponseEntity<>(updated, HttpStatus.ACCEPTED);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deletePlayer(@PathVariable Long id) {
        this.playerService.delete(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}

