/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keybank.dao.EnrollmentDao;
import com.keybank.exception.BusinessException;
import com.keybank.exception.SystemException;
import com.keybank.model.AirtelServiceRequest;
import com.keybank.model.AirtelServiceResponse;
import com.keybank.model.EnrollmentDaoRequest;
import com.keybank.model.EnrollmentDaoResponse;
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

	@Autowired
	private EnrollmentDao dao;

	@Override
	public EnrollmentResponse enrollment(EnrollmentRequest req) throws BusinessException, SystemException {
		EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
		if (req.getProviderType().equalsIgnoreCase("airtel")) {
			AirtelServiceRequest request = new AirtelServiceRequest();
			request.setAmount(req.getAmount());
			request.setBillDate(req.getBillDate());
			request.setCustomerName(req.getCustomerName());
			request.setMobileNo(req.getMobileNo());
			request.setPaymentDate(req.getPaymentDate());
			request.setProviderType(req.getProviderType());
			AirtelServiceResponse airtelServiceResponse = airtelClient.enroll(request);
			EnrollmentDaoResponse daoResponse = null;
			if ("200".equals(airtelServiceResponse.getRespCode())) {
				daoResponse = dao.enrollment(new EnrollmentDaoRequest(req.getAmount(), req.getBillDate(),
						req.getCustomerName(), req.getMobileNo(), req.getPaymentDate(), req.getProviderType()));
			}

			enrollmentResponse.setRespCode("200");
			enrollmentResponse.setRespMsg(daoResponse.getRespMsg());
			enrollmentResponse.setEnrollmentStatus(daoResponse.getEnrollmentStatus());

		}
		return enrollmentResponse;
	}

}
