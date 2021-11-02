/**
 * 
 */
package com.mm.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sms.entity.Result;
import com.mm.sms.service.ResultsService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/results")
public class ResultsController {
	
	@Autowired
	private ResultsService resultsService;

	@GetMapping
	public List<Result> getAllResults(){
		return resultsService.getAllResults();
	}
	
}
