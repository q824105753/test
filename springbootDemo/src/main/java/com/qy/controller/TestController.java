package com.qy.controller;

import com.qy.service.SclassService;
import com.qy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * author: qiyong
 * 2018/9/13 15:46
 */
@Controller
public class TestController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private SclassService sclassService;


}
