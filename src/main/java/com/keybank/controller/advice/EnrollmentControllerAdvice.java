/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.keybank.exception.AirtelServiceDownException;
import com.keybank.exception.BusinessException;
import com.keybank.exception.DBException;
import com.keybank.exception.InvalidEnrollmentRequestException;
import com.keybank.exception.SystemException;
import com.keybank.model.EnrollmentResponse;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@RestControllerAdvice
public class EnrollmentControllerAdvice {

	@ExceptionHandler(value = InvalidEnrollmentRequestException.class)
	public EnrollmentResponse handleInvalidEnrollmentRequestException(InvalidEnrollmentRequestException e) {
		return buildErrorResponse(e.getRespCode(), e.getRespMsg());
	}

	@ExceptionHandler(value = BusinessException.class)
	public EnrollmentResponse handleBusinessException(BusinessException e) {
		return buildErrorResponse(e.getRespCode(), e.getRespMsg());
	}

	@ExceptionHandler(value = SystemException.class)
	public EnrollmentResponse handleSystemException(SystemException e) {
		return buildErrorResponse(e.getRespCode(), e.getRespMsg());
	}

	private EnrollmentResponse buildErrorResponse(String code, String msg) {
		EnrollmentResponse response = new EnrollmentResponse();
		response.setRespCode(code);
		response.setRespMsg(msg);
		return response;
	}

	@ExceptionHandler(value = AirtelServiceDownException.class)
	public EnrollmentResponse handleAirtelServiceDownException(AirtelServiceDownException e) {
		EnrollmentResponse response = new EnrollmentResponse();
		response.setRespMsg(e.getMessage());
		response.setRespCode("500");
		return response;
	}

	@ExceptionHandler(value = DBException.class)
	public EnrollmentResponse handleDBException(DBException e) {
		EnrollmentResponse response = new EnrollmentResponse();
		response.setRespMsg(e.getMessage());
		response.setRespCode("500");
		return response;
	}

}
