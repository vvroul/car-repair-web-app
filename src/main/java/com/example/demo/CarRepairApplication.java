package com.example.demo;

import com.example.demo.builder.UsersBuilder;
import com.example.demo.enumeration.UserTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.project.ppaa.model"})  // scan JPA entities
public class CarRepairApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(CarRepairApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("=============================");
        logger.info("Testing logger output");
        logger.info("=============================");

    }
}
