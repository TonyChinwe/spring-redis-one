package com.phi.springprofile.controller;

import com.phi.springprofile.entity.Vehicle;
import com.phi.springprofile.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/all-veh")
    public List<Vehicle> getAllVehicle(){
      return vehicleService.getAllVehicle();
    }

    @GetMapping("/one-veh/{id}")
    public Vehicle getOneVeh(@PathVariable int id){
        return vehicleService.getVehicle(id);
    }

    @GetMapping("/one/{name}")
    public Vehicle getVecleByName(@PathVariable String name){
        return vehicleService.getVehicleByName(name);
    }

    @GetMapping("/desce")
    public List<Vehicle> getVecleByName(){
        return vehicleService.getSortedVehicle();
    }

    @GetMapping("/vehi/{page}")
    public List<Vehicle> getVecleByName(@PathVariable int page){
        return vehicleService.getPageVehicle(page);
    }

    @GetMapping("/vehi-num/{num}")
    public List<Vehicle> getVecleByNum(@PathVariable int num){
        return vehicleService.getVehicleByGear(num);
    }



    @PostMapping("/post-veh")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }



}
