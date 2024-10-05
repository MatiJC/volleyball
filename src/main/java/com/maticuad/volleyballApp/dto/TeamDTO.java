package com.maticuad.volleyballApp.dto;

import com.maticuad.volleyballApp.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {
    private Long id;
    private String name;
    private List<PlayerDTO> players;
    private Gender gender;
}
