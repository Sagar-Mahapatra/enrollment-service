/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.validator;

import org.springframework.stereotype.Component;

import com.keybank.exception.InvalidEnrollmentRequestException;
import com.keybank.model.EnrollmentRequest;

/**
 * @author Sagar, 24-Mar-2022
 *
 *         Description:
 */
@Component
public class EnrollmentValidator {

	public void validateRequest(EnrollmentRequest req) throws InvalidEnrollmentRequestException {

		if (req == null) {
			throw new InvalidEnrollmentRequestException("enr001", "ENROLLMENT REQUEST IS NULL");
		}
		if ("".equals(req.getMobileNo()) || req.getMobileNo() == null) {
			throw new InvalidEnrollmentRequestException("enr002", "INVALID MOBILE NUMBER");
		}

	}

}
