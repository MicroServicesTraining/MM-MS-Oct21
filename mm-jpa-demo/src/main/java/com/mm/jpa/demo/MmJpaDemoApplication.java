package com.mm.jpa.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MmJpaDemoApplication {

	static final Logger LOGGER = LoggerFactory.getLogger("MmJpaDemoApplication");
	//static final Logger LOGGER = LoggerFactory.getLogger(MmJpaDemoApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Info Log");
		LOGGER.debug("Debug Log");
		LOGGER.error("Error LOG");
		LOGGER.trace("Tracing Log");
		LOGGER.warn("Warn Log");
		SpringApplication.run(MmJpaDemoApplication.class, args);
	}

}
