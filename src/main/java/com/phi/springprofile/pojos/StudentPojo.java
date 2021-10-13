package com.phi.springprofile.pojos;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
public class StudentPojo {

    @Value("${student.name}")
    public String studentName;

    @Value("${student.regnumber}")
    public int studentRegNumber;

    public List<String> studentCourses;

}
