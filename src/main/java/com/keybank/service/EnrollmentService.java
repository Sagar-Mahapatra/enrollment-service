/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.service;

import com.keybank.exception.BusinessException;
import com.keybank.exception.SystemException;
import com.keybank.model.EnrollmentRequest;
import com.keybank.model.EnrollmentResponse;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
public interface EnrollmentService {

	public EnrollmentResponse enrollment(EnrollmentRequest req) throws BusinessException, SystemException;

}
