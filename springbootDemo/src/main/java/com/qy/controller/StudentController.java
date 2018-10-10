package com.qy.controller;

import com.qy.entity.Sclass;
import com.qy.entity.Student;
import com.qy.service.SclassService;
import com.qy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private SclassService sclassService;



    @RequestMapping("/index")
    public ModelAndView index() {
        List<Student> slist = studentService.findAll();
        for (Student stu :slist){
            Sclass sclass = sclassService.findByCid(stu.getCid());
            stu.setCname(sclass.getCname());
        }
        return new ModelAndView("index", "slist", slist);
    }

    @RequestMapping("/toAdd")
    public ModelAndView toAdd() {
        List<Sclass> sclist = sclassService.findAll();
        return new ModelAndView("add", "sclist", sclist);
    }


    @RequestMapping("/add")
    public String add(Student student) {
        studentService.save(student);
        return "redirect:index";
    }

    @RequestMapping("/load")
    public ModelAndView load(Integer sid) {
        List<Sclass> sclist = sclassService.findAll();
        Student student = studentService.findBySid(sid);
        ModelAndView mav = new ModelAndView("update", "student", student);
        mav.addObject("sclist", sclist);
        return mav;
    }

    @RequestMapping("/update")
    public String update(Student student) {
        studentService.save(student);
        return "redirect:index";
    }

    @RequestMapping("/delete")
    public String delete(Integer sid) {
        Student student = studentService.findBySid(sid);
        studentService.delete(student);
        return "redirect:index";
    }

    @RequestMapping("/sendMessage")
    public void sendMessage(){
        System.out.println("1");
        studentService.sendMessage();
        System.out.println("2");
    }




}
