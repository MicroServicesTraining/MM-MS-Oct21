/**
 * 
 */
package com.mm.sc.config.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("${sb.sample.message}")
    private String greetingMessage;
	
	@Value("${sb.greeting.message}")
	private String message;

    @GetMapping("/showMessage")
    public String showConfig() {
        String configInfo = "<h1>Message From Cloud Config :: " + greetingMessage +"</h1><h2>"+message+"</h2>";
               
        return configInfo;
    }
	
}
