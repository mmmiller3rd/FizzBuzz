package com.mmmiller3rd.FizBuzz.service;

import com.mmmiller3rd.FizBuzz.Constants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzServiceTest extends Constants {

    FizzBuzzService fizzBuzzService;

    @BeforeEach
    void setUp() {
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    void runFizzBuzz_100() {
        String result = fizzBuzzService.runFizzBuzz(100);
        assertEquals(getDefaultReturn(), result);
    }

    @Test
    void runFizzBuzz_21() {
        String result = fizzBuzzService.runFizzBuzz(21);
        assertEquals(getCustomReturn(), result);
    }
}