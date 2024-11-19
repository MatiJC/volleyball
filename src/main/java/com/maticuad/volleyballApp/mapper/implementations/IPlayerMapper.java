package com.maticuad.volleyballApp.mapper.implementations;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.mapper.PlayerMapper;
import com.maticuad.volleyballApp.mapper.TeamMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class IPlayerMapper implements PlayerMapper {

    private final TeamMapper teamMapper;

    @Override
    public Player toPersistent(PlayerDTO dto) {
        Player player = new Player();
        player.setId(dto.getId());
        player.setFirstName(dto.getFirstName());
        player.setLastName(dto.getLastName());
        player.setShirtNumber(dto.getShirtNumber());
        player.setPosition(dto.getPosition());
        player.setGender(dto.getGender());
        player.setTeam(this.teamMapper.toPersistent(dto.getTeam()));
        player.setDeleted(dto.getDeleted());
        return player;
    }

    @Override
    public PlayerDTO toDTO(Player player) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(playerDTO.getId());
        playerDTO.setFirstName(player.getFirstName());
        playerDTO.setLastName(player.getLastName());
        playerDTO.setShirtNumber(player.getShirtNumber());
        playerDTO.setPosition(player.getPosition());
        playerDTO.setGender(player.getGender());
        playerDTO.setTeam(this.teamMapper.toDTO(player.getTeam()));
        playerDTO.setDeleted(player.getDeleted());
        return playerDTO;
    }

    @Override
    public List<Player> toPersistent(List<PlayerDTO> list) {
        List<Player> players = new ArrayList<>();
        for (PlayerDTO dto : list) {
            players.add(this.toPersistent(dto));
        }
        return players;
    }

    @Override
    public List<PlayerDTO> toDTO(List<Player> list) {
        List<PlayerDTO> playersDTO  = new ArrayList<>();
        for (Player player : list) {
            playersDTO.add(this.toDTO(player));
        }
        return playersDTO;
    }
}
