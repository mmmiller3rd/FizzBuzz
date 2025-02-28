package com.mmmiller3rd.FizBuzz.controller;

import com.mmmiller3rd.FizBuzz.service.FizzBuzzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FizzBuzzController {
    private final FizzBuzzService fizzBuzzService;

    @Autowired
    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping(value = "/runFizzBuzz", produces = "text/plain")
    public ResponseEntity<String> runFizzBuzz(@RequestParam(defaultValue = "100", required = false) String n) {
        try {
            return ResponseEntity.ok(fizzBuzzService.runFizzBuzz(verifyN(n)));
        } catch (NumberFormatException nfe) {
            return ResponseEntity.badRequest().body("Please provide a valid number for n");
        }
    }

    public int verifyN(String n) {
        return Integer.parseInt(n);
    }
}
