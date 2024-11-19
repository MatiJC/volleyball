package com.maticuad.volleyballApp.dto;

import com.maticuad.volleyballApp.model.Persistance.Gender;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {
    private Long id;
    private String name;
    private List<PlayerDTO> players;
    private Gender gender;
    private Boolean deleted;
}
