package com.example.modulith.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingModule greetingModule;

    public GreetingController(GreetingModule greetingModule) {
        this.greetingModule = greetingModule;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return greetingModule.hello(name);
    }
}
