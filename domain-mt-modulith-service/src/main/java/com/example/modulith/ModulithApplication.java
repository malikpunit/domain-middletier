package com.example.modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.ApplicationModule;
import org.springframework.modulith.Modulith;

@SpringBootApplication
@Modulith(systemName = "modulith-example")
public class ModulithApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulithApplication.class, args);
    }
}
