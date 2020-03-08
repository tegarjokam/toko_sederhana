package com.tegar.dao;

import java.util.List;

public interface DaoService<T> {

    int create(T objectType);
    int update(T objectType);
    int delete(T objectType);

    List<T> findAll();
}
