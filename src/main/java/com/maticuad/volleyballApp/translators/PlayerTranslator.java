package com.maticuad.volleyballApp.translators;

import com.maticuad.volleyballApp.dto.PlayerDTO;
import com.maticuad.volleyballApp.models.Player;

import java.util.List;

public interface PlayerTranslator {
    Player toPersistent(PlayerDTO dto);
    PlayerDTO toDTO(Player player);
    List<Player> toPersistent(List<PlayerDTO> list);
    List<PlayerDTO> toDTO(List<Player> list);
}
