package com.mmmiller3rd.FizBuzz.controller;

import com.mmmiller3rd.FizBuzz.Constants;
import com.mmmiller3rd.FizBuzz.service.FizzBuzzService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FizzBuzzController.class)
@ContextConfiguration(classes = { FizzBuzzService.class, FizzBuzzController.class })
class FizzBuzzControllerTest extends Constants {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    FizzBuzzController fizzBuzzController;

    @Test
    void runFizzBuzz_default() throws Exception {
        mockMvc.perform(get("/runFizzBuzz"))
                .andExpect(status().isOk())
                .andExpect(content().string(getDefaultReturn()));
    }

    @Test
    void runFizzBuzz_custom() throws Exception {
        mockMvc.perform(get("/runFizzBuzz").param("n", "21"))
                .andExpect(status().isOk())
                .andExpect(content().string(getCustomReturn()));
    }

    @Test
    void runFizzBuzz_invalid() throws Exception {
        mockMvc.perform(get("/runFizzBuzz").param("n", "test"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Please provide a valid number for n"));
    }

    @Test
    void verifyN_valid() {
        assertEquals(10, fizzBuzzController.verifyN("10"));
    }

    @Test
    void verifyN_invalid() {
        assertThrows(NumberFormatException.class, () -> fizzBuzzController.verifyN("test"));
    }
}
