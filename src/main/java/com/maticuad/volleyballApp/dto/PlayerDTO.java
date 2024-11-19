package com.maticuad.volleyballApp.dto;

import com.maticuad.volleyballApp.model.Persistance.Gender;
import com.maticuad.volleyballApp.model.Persistance.Position;
import lombok.*;

@Data
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
    private Boolean deleted;
}
