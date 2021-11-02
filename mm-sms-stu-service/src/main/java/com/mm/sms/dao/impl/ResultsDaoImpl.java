/**
 * 
 */
package com.mm.sms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sms.dao.ResultsDao;
import com.mm.sms.entity.Result;
import com.mm.sms.repository.ResultRepository;

/**
 * @author USER
 *
 */
@Component
public class ResultsDaoImpl implements ResultsDao {

	@Autowired
	ResultRepository resultRepository;
	
	@Override
	public List<Result> getAllResults() {
		return resultRepository.findAll();
	}

}
