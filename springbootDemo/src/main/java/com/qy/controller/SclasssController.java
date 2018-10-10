package com.qy.controller;

import com.qy.service.SclassService;
import com.qy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * author: qiyong
 * 2018/9/13 14:48
 */
@Controller
public class SclasssController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private SclassService sclassService;

}
