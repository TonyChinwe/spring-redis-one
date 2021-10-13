package com.phi.springprofile.services;

import com.phi.springprofile.pojos.Stud;
import com.phi.springprofile.pojos.StudentPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    Stud studentPojo;

 public String getStudentName(){

    return studentPojo.getStudentName();
 }

    public int getStudentRegNumber(){
        return studentPojo.getStudentRegNumber();
    }

    public List<String> getStudentClases(){
        return studentPojo.getStudentCourses();
    }

}
