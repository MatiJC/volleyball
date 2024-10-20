package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.service.GenericService;

import java.util.List;

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
    public PERSISTENT create(PERSISTENT entity) {
        return null;
    }

    @Override
    public void update(Long id) {

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
