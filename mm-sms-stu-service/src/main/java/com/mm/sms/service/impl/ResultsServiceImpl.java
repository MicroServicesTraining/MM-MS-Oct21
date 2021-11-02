/**
 * 
 */
package com.mm.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sms.dao.ResultsDao;
import com.mm.sms.entity.Result;
import com.mm.sms.service.ResultsService;

/**
 * @author USER
 *
 */
@Service
public class ResultsServiceImpl implements ResultsService {

	@Autowired
	private ResultsDao resultsDao;
	
	@Override
	public List<Result> getAllResults() {
		return resultsDao.getAllResults();
	}

}
