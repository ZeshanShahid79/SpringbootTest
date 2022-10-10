package com.example.springboottest;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {


    private List<Car> listOfCars;

    //Konstruktor
    public CarRepository() {

    }

    //methode add car

    public void addCar(Car newCar){
        listOfCars.add(newCar);
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    @Override
    public String toString() {
        return "CarRepository{" +
                "listOfCars=" + listOfCars +
                '}';
    }
}
