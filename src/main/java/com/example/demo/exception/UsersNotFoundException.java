package com.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsersNotFoundException extends RuntimeException {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public UsersNotFoundException()
    {
        logger.info("=============================");
        logger.info("[Class:UsersNotFoundException] - Users not found");
        logger.info("=============================");
    }

}
