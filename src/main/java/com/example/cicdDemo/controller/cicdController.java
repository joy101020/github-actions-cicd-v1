package com.example.cicdDemo.controller;

import com.example.cicdDemo.model.CicdUsers;
import com.example.cicdDemo.service.CicdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cicd")
public class cicdController {

    @Autowired
    private CicdService cicdService;

    @PostMapping("/add")
    public ResponseEntity<CicdUsers> addUser(@RequestBody CicdUsers cicdUsers) {
        return new ResponseEntity<>(cicdService.addUser(cicdUsers), HttpStatus.CREATED);
    }

    @GetMapping("/data")
    public ResponseEntity<String> data() {
        return new ResponseEntity<>("The data is reflected", HttpStatus.OK);
    }


    @GetMapping(params = "version=v1")
    public ResponseEntity<List<CicdUsers>> version1() {
        return ResponseEntity.ok(cicdService.getAllCicdUsers());
    }

    @GetMapping(params = "version=v2")
    public ResponseEntity<List<CicdUsers>> version2() {
        return ResponseEntity.ok(cicdService.getAllCicdUsers());
    }
}
