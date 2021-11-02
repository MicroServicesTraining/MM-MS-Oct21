/**
 * 
 */
package com.mm.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sms.entity.Result;

/**
 * @author USER
 *
 */
@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

}
