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
public class SellerController {
	
	@GetMapping("/seller")
	public String getSellerHome() {
		return "<h1> Welcome Seller </h1>";
	}

}
