package com.maticuad.volleyballApp.model.Persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Position {
    SETTER("SETTER"),
    OUTSIDE_HITTER("OUTSIDE_HITTER"),
    OPPOSITE_HITTER("OPPOSITE_HITTER"),
    MIDDLE_BLOCKER("MIDDLE_BLOCKER"),
    LIBERO("LIBERO");

    private final String name;
}
