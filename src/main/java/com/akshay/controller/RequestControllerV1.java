package com.akshay.controller;

import com.akshay.domain.Cab;
import com.akshay.domain.TeamMember;
import com.akshay.services.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RestControllerAdvice
@RequestMapping("/v1")
public class RequestControllerV1 {
    private final static Logger logger = LoggerFactory.getLogger(RequestControllerV1.class);

    @Autowired
    private MainService service;

    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<TeamMember> register(@RequestBody TeamMember teamMember)  {
        logger.info("Registering Team Member " + teamMember);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.registerTeamMember(teamMember));
    }


    @RequestMapping(
            value = "/cabs",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<List<Cab>> registerCabs(@RequestBody List<Cab> cabs){
        logger.info("Registering Cabs " + cabs);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.registerCabs(cabs));
    }
}
