/**
 * 
 */
package com.mm.sb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController("/demo")
public class DemoController {

	@GetMapping("/msg")
	public String getMessage() {
		return "<h1>" + "Hello" + "</h1>";
	}
	
}
