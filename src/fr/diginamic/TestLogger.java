package fr.diginamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);
    public static void main(String[] args) {
        LOGGER.info("bonjour slf4j !");
        LOGGER.info("implementation logback");

    }}
