/**
 * 
 */
package com.mm.sb.sec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/users")
public class DemoController {

	@GetMapping
	public String getUsersList() {
		return "<h1>Users List</h1>";
	}
		
}
