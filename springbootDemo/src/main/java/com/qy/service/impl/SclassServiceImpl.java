package com.qy.service.impl;

import com.qy.dao.SclassRepository;
import com.qy.entity.Sclass;
import com.qy.service.SclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("sclassService")
public class SclassServiceImpl implements SclassService {

    @Autowired
    private SclassRepository sclassRepository;


    public List<Sclass> findAll() {
        return sclassRepository.findAll();
    }

    public void save(Sclass sclass) {
        sclassRepository.save(sclass);
    }

    public void delete(Sclass sclass) {
        sclassRepository.delete(sclass);
    }

    public void update(Sclass sclass) {
        sclassRepository.save(sclass);
    }

    public Sclass findByCid(Integer cid) {
        return sclassRepository.findById(cid).get();
    }


}
