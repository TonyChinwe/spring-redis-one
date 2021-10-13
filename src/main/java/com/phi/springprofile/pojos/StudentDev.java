package com.phi.springprofile.pojos;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@Profile("dev")
@ConfigurationProperties(prefix = "student")
public class StudentDev implements Stud {


    @Value("${student.name}")
    public String studentName;

    @Value("${student.regnumber}")
    public int studentRegNumber;

    @Value("${student.courses}")
    public List<String> studentCourses;
}
