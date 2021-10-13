package com.phi.springprofile.services;

import com.phi.springprofile.entity.Vehicle;
import com.phi.springprofile.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
  private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicle(){
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicle( int id){
        return vehicleRepository.findById(id).orElse(new Vehicle());
    }

    public Vehicle getVehicleByName(String name){
        return vehicleRepository.findVehicleByName(name);
    }


    public Vehicle saveVehicle(Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return vehicle;
    }

    public List<Vehicle>  getSortedVehicle(){
      List<Vehicle> vehicleList=vehicleRepository.findAll(Sort.by("id").descending());
     return vehicleList;
    }

    public List<Vehicle>  getPageVehicle(int page){
        Sort sort=Sort.by("id").descending();
        List<Vehicle> vehicleList=vehicleRepository.findAll(PageRequest.of(page,3,sort)).getContent();
        return vehicleList;
    }

    public List<Vehicle>  getVehicleByGear(int num){
        Sort sort=Sort.by("id").descending();
        List<Vehicle> vehicleList=vehicleRepository.findVehicleByNumGear(num,Sort.by("id").descending());
        return vehicleList;
    }

    public List<Vehicle>  getVehicleByPage(@PathVariable String name,@PathVariable int page){
        Pageable paging=PageRequest.of(page,3);
        List<Vehicle> vehicleList=vehicleRepository.findVehicleByName(name,paging);
        return vehicleList;
    }
}
