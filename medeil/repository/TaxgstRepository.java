/**
 * 
 */
package com.medeil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medeil.domain.TaxGst;

/**
 * @author Vanuston
 *
 */
@SuppressWarnings("rawtypes")
@Repository
public interface TaxgstRepository extends JpaRepository<TaxGst, Long> {

}
	