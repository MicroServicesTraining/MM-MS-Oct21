/**
 * 
 */
package com.mm.jpa.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author USER
 *
 */
@Configuration
/*
 * @PropertySources({
 * 
 * @PropertySource("mm-demo.properties"),
 * 
 * @PropertySource("mm-demo1.properties") })
 */
public class DemoConfig {
	
	@Value("${mm.demo.message}")
	private String message;
	
	@Value("${mm.demo.username:Ravi}")
	private String userName;
	
	@Value("${mm.demo.maxlimit:30}")
	private Integer maxLimit;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the maxLimit
	 */
	public Integer getMaxLimit() {
		return maxLimit;
	}

	/**
	 * @param maxLimit the maxLimit to set
	 */
	public void setMaxLimit(Integer maxLimit) {
		this.maxLimit = maxLimit;
	}
	
}
