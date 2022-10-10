package com.example.springboottest;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService() {
    }

    public List<Car> getCars(){
       return carRepository.getListOfCars();

    }

    public void addCar(Car car){
        carRepository.addCar(car);
    }


}
