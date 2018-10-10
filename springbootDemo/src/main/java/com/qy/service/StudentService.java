package com.qy.service;

import com.qy.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    void delete(Student student);

    void update(Student student);

    Student findBySid(Integer sid);

    public void sendMessage();
}
