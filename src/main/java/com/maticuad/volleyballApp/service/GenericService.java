package com.maticuad.volleyballApp.service;

import java.util.List;

public interface GenericService<PERSISTENT> {
    PERSISTENT getById(Long id);
    List<PERSISTENT> getAll();
    Long create(PERSISTENT entity);
    Long update(PERSISTENT persistent, Long id);
    void delete(Long id);
    void preCreate(PERSISTENT entity);
    void preUpdate(PERSISTENT entity);
}
