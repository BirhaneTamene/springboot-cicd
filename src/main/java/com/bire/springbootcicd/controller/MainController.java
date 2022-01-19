package com.bire.springbootcicd.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @GetMapping(path = "/get-info/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getInfo(@PathVariable("id") Long id){
        if(id != null){
            return ResponseEntity.ok("The id is valid!");
        }
        return ResponseEntity.badRequest().body("The id is invalid! Please, try again!");
    }
}
