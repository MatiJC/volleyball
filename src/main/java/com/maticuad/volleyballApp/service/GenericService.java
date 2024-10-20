package com.maticuad.volleyballApp.service;

import java.util.List;

public interface GenericService<PERSISTENT> {
    PERSISTENT getById(Long id);
    List<PERSISTENT> getAll();
    PERSISTENT create(PERSISTENT entity);
    void update(Long id);
    void delete(Long id);
    void preCreate(PERSISTENT entity);
    void preUpdate(PERSISTENT entity);
}
