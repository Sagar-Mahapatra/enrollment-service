/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.dao;

import com.keybank.exception.BusinessException;
import com.keybank.exception.SystemException;
import com.keybank.model.EnrollmentDaoRequest;
import com.keybank.model.EnrollmentDaoResponse;

/**
 * @author Sagar, 25-Mar-2022
 *
 *         Description:
 */
public interface EnrollmentDao {

	public EnrollmentDaoResponse enrollment(EnrollmentDaoRequest req) throws BusinessException, SystemException;

}
