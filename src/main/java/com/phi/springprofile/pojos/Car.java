package com.phi.springprofile.pojos;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"dum3","dum4"})
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Car {

    @JsonIgnoreType
    public class PerCar{
      private int nin1;
      private String nin2;
    }

    @NonNull
    private String name;

    private int numGear;

    @JsonSetter("mod")
    private String model;

    @JsonIgnore
    private int dum1;

    @JsonIgnore
    private String dum2;


    private int dum3;


    private String dum4;

    private PerCar sd;




}
