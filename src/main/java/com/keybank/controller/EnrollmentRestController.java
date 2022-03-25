/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keybank.exception.BusinessException;
import com.keybank.exception.InvalidEnrollmentRequestException;
import com.keybank.exception.SystemException;
import com.keybank.model.EnrollmentRequest;
import com.keybank.model.EnrollmentResponse;
import com.keybank.service.EnrollmentService;
import com.keybank.validator.EnrollmentValidator;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@RestController
@RequestMapping("/v1")
public class EnrollmentRestController {

	@Autowired
	private EnrollmentService service;

	@Autowired
	private EnrollmentValidator validator;

	@PostMapping("/enrollment")
	public EnrollmentResponse enrollment(@RequestBody EnrollmentRequest req,
			@RequestHeader(name = "clientId", required = true) String clientId,
			@RequestHeader(name = "corelationId", required = true) String requestId,
			@RequestHeader(name = "msgTs", required = true) String msgTs)
			throws BusinessException, SystemException, InvalidEnrollmentRequestException {

		validator.validateRequest(req);
		return service.enrollment(req);
	}

}
