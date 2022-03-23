/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keybank.model.AirtelServiceRequest;
import com.keybank.model.AirtelServiceResponse;
import com.keybank.model.EnrollmentRequest;
import com.keybank.model.EnrollmentResponse;
import com.keybank.svcclient.AirtelServiceClient;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@Service
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private AirtelServiceClient airtelClient;

	@Override
	public EnrollmentResponse enrollment(EnrollmentRequest req) {
		AirtelServiceRequest request = new AirtelServiceRequest();
		request.setAmount(req.getAmount());
		request.setBillDate(req.getBillDate());
		request.setCustomerName(req.getCustomerName());
		request.setMobileNo(req.getMobileNo());
		request.setPaymentDate(req.getPaymentDate());
		request.setProviderType(req.getProviderType());
		AirtelServiceResponse airtelServiceResponse = airtelClient.enroll(request);
		return new EnrollmentResponse(airtelServiceResponse.getRespCode(), airtelServiceResponse.getRespMsg(),
				airtelServiceResponse.getDescription());
	}

}
