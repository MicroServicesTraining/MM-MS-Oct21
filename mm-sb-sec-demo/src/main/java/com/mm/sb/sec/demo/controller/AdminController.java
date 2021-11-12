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
public class AdminController {
	
	@GetMapping("/admin")
	public String getAdminHome() {
		return "<h1> Welcome Admin </h1>";
	}

}
