package com.keybank.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.keybank.exception.InvalidEnrollmentRequestException;
import com.keybank.model.EnrollmentRequest;

class EnrollmentValidatorTest {

	private EnrollmentValidator validator;
	private EnrollmentRequest request;

	@BeforeEach
	void setUp() throws Exception {
		validator = new EnrollmentValidator();
		request = new EnrollmentRequest("9178282533", 10000.0, "30-03-2022", "28-03-2022", "airtel", "sagar");
	}

	@Test
	void testValidateRequest_Req_Null() {
		try {
			request = null;
			validator.validateRequest(request);
		} catch (InvalidEnrollmentRequestException e) {
			assertEquals("enr001", e.getRespCode());
		}
	}

	@Test
	void testValidateRequest_MobileNo_Null() {
		try {
			request.setMobileNo(null);
			validator.validateRequest(request);
		} catch (InvalidEnrollmentRequestException e) {
			assertEquals("enr002", e.getRespCode());
		}
	}

	@Test
	void testValidateRequest_MobileNo_IsEmpty() {
		try {
			request.setMobileNo(" ");
			validator.validateRequest(request);
		} catch (InvalidEnrollmentRequestException e) {
			assertEquals("enr002", e.getRespCode());
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		validator = null;
	}

}
