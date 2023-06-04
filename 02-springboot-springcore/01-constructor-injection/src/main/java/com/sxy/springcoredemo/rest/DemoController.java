package com.sxy.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a field for the dependency
    //this field depends on any implement class of Coach interface
    private Coach myCoach;
    //define a constructor for dependency injection
    @Autowired
    public  DemoController(Coach coach){
        this.myCoach=coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
