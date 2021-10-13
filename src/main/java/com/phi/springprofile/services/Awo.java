package com.phi.springprofile.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Data
@Configuration
@ConfigurationProperties("db")
public class Awo {


    @Value("${student.pojos.name}")
    private String name;


}
