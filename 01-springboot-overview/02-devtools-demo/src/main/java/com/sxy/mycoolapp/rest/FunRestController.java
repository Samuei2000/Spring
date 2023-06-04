package com.sxy.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController-->Set up rest controller
@RestController
public class FunRestController {
    //inject properties:caoch.name,team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach:"+coachName+", team"+teamName;
    }

    // expose "/" that return "Hello World"
    //@GetMapping-->Handle HTTP GET requests
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a hard 5k!";
    }
}