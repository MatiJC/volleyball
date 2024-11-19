package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IGenericService<PERSISTENT> implements GenericService<PERSISTENT> {

    @Override
    public PERSISTENT getById(Long id) {
        return null;
    }

    @Override
    public List<PERSISTENT> getAll() {
        return List.of();
    }

    @Override
    public Long create(PERSISTENT entity) {
        return null;
    }

    @Override
    public Long update(PERSISTENT persistent, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void preCreate(PERSISTENT entity) {

    }

    @Override
    public void preUpdate(PERSISTENT entity) {

    }

}
