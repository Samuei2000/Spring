package com.sxy.springcoredemo.rest;

import com.sxy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a field for the dependency
    //this field depends on any implement class of Coach interface
    private Coach myCoach;

    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
    /*@Autowired
    public String doSome(Coach theCoach) {
        We need a "theCoach",Spring will help us find
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
