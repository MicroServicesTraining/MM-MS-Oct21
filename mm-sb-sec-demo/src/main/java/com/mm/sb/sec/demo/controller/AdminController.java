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
	
	@GetMapping("/admin/finduser")
	public String findUser() {
		return "<h1> Find User </h1>";
	}
	
	@GetMapping("/admin/newuser")
	public String createUser() {
		return "<h1> Create User </h1>";
	}
	
	@GetMapping("/admin/modifyuser")
	public String modifyUser() {
		return "<h1> Modify User </h1>";
	}
	
	

}
