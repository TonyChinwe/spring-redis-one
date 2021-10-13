package com.phi.springprofile.repository;

import com.phi.springprofile.entity.Vehicle;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

    @Query("SELECT p FROM Vehicle  p WHERE p.name LIKE :name")
    public Vehicle findVehicleByName(@Param("name") String name);


    public List<Vehicle> findVehicleByNumGear(int num, Sort s);

    public List<Vehicle> findVehicleByName(@Param("name") String name,Pageable p);
}
