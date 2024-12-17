package com.example.getrand_userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userservice")
public class GatewayController {
    public String test() {
        return "test";
    }
}
