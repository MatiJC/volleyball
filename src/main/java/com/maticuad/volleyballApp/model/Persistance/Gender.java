package com.maticuad.volleyballApp.model.Persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MAN("MAN"),
    WOMAN("WOMAN");

    private final String name;
}
