package com.maticuad.volleyballApp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TEAM")
public class Team {
    @Id
    @SequenceGenerator(
            name = "team_sequence",
            sequenceName = "team_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_sequence")
    @Column(name = "TEAM_ID", nullable = false, updatable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", foreignKey = @ForeignKey(name = "FK_PLAYERS"))
    private List<Player> players = new ArrayList<>();

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Team(String name, List<Player> players, Gender gender) {
        this.name = name;
        this.players = players;
        this.gender = gender;
    }
}
