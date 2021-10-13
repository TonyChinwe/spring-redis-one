package com.phi.springprofile.controller;


import com.phi.springprofile.pojos.StudentConfig;
import com.phi.springprofile.pojos.StudentPojo;
import com.phi.springprofile.services.Awo;
import com.phi.springprofile.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
   private StudentService studentService;

   @Autowired
   private StudentConfig studentConfig;

   @Value("Tony Idogwu")
   private String name;

   @Value("${student.pojos.name: default name}")
   private String nameProp;

   @Value("${studentd.pojos.reg: 34}")
   private int reg;

   @Value("${studentd.pojos.classes: mo,yop,jiop,nom}")
   private List<String> stringList;


    @GetMapping("/name")
    public String getStudentName(){
     return studentConfig.getName();
   }

    @GetMapping("/reg")
    public String getStudentNumber(){
        return String.valueOf(studentService.getStudentRegNumber());
 }

 @GetMapping("/classes")
 public List<String> getStudentClasses(){
  return studentService.getStudentClases();
 }


}
