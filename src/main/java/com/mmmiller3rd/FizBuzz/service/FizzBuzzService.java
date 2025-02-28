package com.mmmiller3rd.FizBuzz.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FizzBuzzService {

    public String runFizzBuzz(int n) {
        StringBuilder result = new StringBuilder();
        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0) {
                result.append("Fizz");
            }
            if (x % 5 == 0) {
                result.append("Buzz");
            }
            if (x % 3 != 0 && x % 5 != 0) {
                result.append(x);
            }
            result.append("\n");
        }
        log.info("\n{}", result);
        return result.toString();
    }
}
