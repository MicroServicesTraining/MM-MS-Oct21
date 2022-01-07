package com.ofs.sc.apig.demo.ofsscapigdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@SpringBootApplication
@RestController
public class OfsScApigDemoApplication {

	private static final Logger LOGGER = Logger.getLogger("OfsScApigDemoApplication");
	
	public static void main(String[] args) {
		SpringApplication.run(OfsScApigDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String landingService() {
		LOGGER.log(Level.INFO, "Reached Landing Service");
		return "We reached Landing Page ";
	}
	// sleauth follows some standard logging pattern - [application name, traceid, spanid, zipkin-export]
}

