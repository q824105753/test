package com.qy.service;

import com.qy.entity.Sclass;

import java.util.List;

public interface SclassService {

    List<Sclass> findAll();

    void save(Sclass sclass);

    void delete(Sclass sclass);

    void update(Sclass sclass);

    Sclass findByCid(Integer cid);

}
