package com.phi.springprofile.controller;

import com.phi.springprofile.pojos.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacksonController {

    @PostMapping("/post-car")
    public Car postCar(@RequestBody Car car){
        System.out.println(car.toString());
     return car;

    }

}
