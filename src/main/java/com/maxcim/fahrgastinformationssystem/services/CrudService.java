package com.maxcim.fahrgastinformationssystem.services;

import java.util.List;


public interface CrudService<T, ID> {
    List<T> findAll();
    T findById(ID id);
}
