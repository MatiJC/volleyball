package com.maticuad.volleyballApp.dto;

import com.maticuad.volleyballApp.models.Gender;
import com.maticuad.volleyballApp.models.Position;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Position position;
    private TeamDTO team;
    private int shirtNumber;
}
