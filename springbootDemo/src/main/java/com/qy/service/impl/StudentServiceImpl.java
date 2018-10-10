package com.qy.service.impl;

import com.qy.dao.StudentRepository;
import com.qy.entity.Student;
import com.qy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }


    public void save(Student student) {
        studentRepository.save(student);
    }


    public void delete(Student student) {
        studentRepository.delete(student);
    }


    public void update(Student student) {
        studentRepository.save(student);
    }


    public Student findBySid(Integer sid) {
        return studentRepository.findById(sid).get();
    }


    @Async//异步
    public void sendMessage(){
        System.out.println("3");
        System.out.println("4");
    }
}
