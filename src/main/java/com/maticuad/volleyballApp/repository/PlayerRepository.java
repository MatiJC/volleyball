package com.maticuad.volleyballApp.repository;

import com.maticuad.volleyballApp.model.Persistance.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {
    @NonNull
    Optional<Player> findById(@NonNull Long id);
    List<Player> findByLastName(String lastName);

}
