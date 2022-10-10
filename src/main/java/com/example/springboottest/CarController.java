package com.example.springboottest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carservice")
public class CarController {

    private CarService carService;

    @PostMapping
    public void  addCar(@RequestBody Car car){
         carService.addCar(car);
    }

    @GetMapping
    public List<Car> getCar(){
        return carService.getCars();
    }

}
