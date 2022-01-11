/**
 * 
 */
package com.ofs.cache.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.cache.demo.entity.Reader;
import com.ofs.cache.demo.repository.ReaderRepository;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/readers")
public class ReadersController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReadersController.class);
	
	@Autowired
	private ReaderRepository readerRepository;

	@Cacheable(value = "readers")
	@GetMapping
	public List<Reader> getAllReaders(){
		LOGGER.info("getAllReaders method");
		return readerRepository.findAll();
	}
	
	@Cacheable(value = "readers", key="#name")
	@GetMapping("/{name}")
	public List<Reader> getReadersByName(@PathVariable String name){
		LOGGER.info("getReadersByName method");
		return readerRepository.findByName(name);
	}
	
	@CachePut(value = "readers", key="#name")
	@GetMapping("/modified/{name}")
	public List<Reader> getReadersByNameLatest(@PathVariable String name){
		LOGGER.info("getReadersByNamelatest method");
		return readerRepository.findByName(name);
	}

	
	@CacheEvict(value = "readers", allEntries = true)
	@GetMapping("/clearcachereaders")
	public void removeCacheReaders() {
		LOGGER.info("Clearing Readers from Cache");
	}
	
}
