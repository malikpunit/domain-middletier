package com.example.modulith.greeting;

import org.springframework.modulith.ApplicationModule;
import org.springframework.stereotype.Service;

@ApplicationModule(id = "greeting", displayName = "Greeting")
@Service
public class GreetingModule {

    public String hello(String name) {
        return "Hello, " + (name == null || name.isBlank() ? "world" : name) + "!";
    }
}
