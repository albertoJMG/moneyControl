package com.ajmg.mc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajmg.mc.entities.Test;
import com.ajmg.mc.repository.TestRepository;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    
    @Autowired
    private TestRepository testRepository;

    @PostMapping("/test")
    public Test createUser(@RequestBody Test test) {
        return testRepository.save(test);
    }

}
