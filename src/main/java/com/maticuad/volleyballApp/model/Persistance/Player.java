package com.maticuad.volleyballApp.model.Persistance;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PLAYER")
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @Column(name = "ID", nullable = false, updatable = false)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "SHIRT_NUMBER")
    private Integer shirtNumber;

    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", foreignKey = @ForeignKey(name = "FK_TEAM_ID"))
    private Team team;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Player(String firstName, String lastName, Integer shirtNumber,
                  Position position, Team team, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shirtNumber = shirtNumber;
        this.position = position;
        this.team = team;
        this.gender = gender;
    }
}
