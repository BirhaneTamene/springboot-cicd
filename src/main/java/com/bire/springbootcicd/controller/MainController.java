package com.bire.springbootcicd.controller;

import com.bire.springbootcicd.model.Info;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/save-info", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Info info){

        return ResponseEntity.ok(info);
    }

}
