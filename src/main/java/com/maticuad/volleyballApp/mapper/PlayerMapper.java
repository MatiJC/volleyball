package com.maticuad.volleyballApp.mapper;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.model.Persistance.Player;

import java.util.List;

public interface PlayerMapper {
    Player toPersistent(PlayerDTO dto);
    PlayerDTO toDTO(Player player);
    List<Player> toPersistent(List<PlayerDTO> list);
    List<PlayerDTO> toDTO(List<Player> list);
}
