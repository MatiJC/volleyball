package com.maticuad.volleyballApp.dto;

import com.maticuad.volleyballApp.models.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}
