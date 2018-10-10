package com.qy.dao;

import com.qy.entity.Sclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("sclassRepository")
public interface SclassRepository extends JpaRepository<Sclass,Integer> {
}
