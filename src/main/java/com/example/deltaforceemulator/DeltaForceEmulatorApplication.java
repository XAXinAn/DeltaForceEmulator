package com.example.deltaforceemulator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.deltaforceemulator.mapper")
public class DeltaForceEmulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeltaForceEmulatorApplication.class, args);
    }

}
