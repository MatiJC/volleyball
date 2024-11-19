package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.model.Api.ErrorDetail;
import com.maticuad.volleyballApp.model.Persistance.Player;
import com.maticuad.volleyballApp.repository.PlayerRepository;
import com.maticuad.volleyballApp.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IPlayerService implements PlayerService {

    private final PlayerRepository playerRepository;

    @Override
    public Player getById(Long id) {
        try {
            return this.playerRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Player> getAll() {
        try {
            return this.playerRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Player> getAllPlayersByTeam(String teamName) {
        try {
            return List.of();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long create(Player entity) {
        try {
            preCreate(entity);
            Player created = this.playerRepository.save(entity);
            return created.getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long update(Player entity, Long id) {
        try {
            preUpdate(entity);
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(Long id) {
    }

    public String playerFullName(Player player) {
        return "";
    }

    @Override
    public void preCreate(Player entity) {
        try {
            List<ErrorDetail> errors = new ArrayList<>();
            if (existsByName(entity.getFirstName(), entity.getLastName())) {
                errors.add(new ErrorDetail("Name", "Already exists player with this name"));
            }

//            if (!errors.isEmpty()) {
//
//            }

        } catch (ServiceException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public void preUpdate(Player entity) {

    }

    @Override
    public boolean existsByName(String firstName, String lastName) {
        return this.playerRepository.findByFirstNameAndLastName(firstName, lastName).isPresent();
    }
}
