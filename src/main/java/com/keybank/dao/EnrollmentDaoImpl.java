/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.dao;

import org.springframework.stereotype.Component;

import com.keybank.exception.BusinessException;
import com.keybank.exception.SystemException;
import com.keybank.model.EnrollmentDaoRequest;
import com.keybank.model.EnrollmentDaoResponse;

/**
 * @author Sagar, 25-Mar-2022
 *
 *         Description:
 */
@Component
public class EnrollmentDaoImpl implements EnrollmentDao {

	@Override
	public EnrollmentDaoResponse enrollment(EnrollmentDaoRequest req) throws BusinessException, SystemException {
		EnrollmentDaoResponse resp = null;
		try {
			String dbRespCode = "0";
			String dbRespMsg = "success";

			resp = new EnrollmentDaoResponse();

			if ("0".equals(dbRespCode)) {
				resp.setRespCode(dbRespCode);
				resp.setRespMsg(dbRespMsg);
				resp.setEnrollmentStatus("ENROLLMENT DONE SUCCESSFULLY");
			} else if ("100".equals(dbRespCode) || "101".equals(dbRespCode) || "102".equals(dbRespCode)) {
				throw new BusinessException(dbRespCode, dbRespMsg);
			} else {
				throw new SystemException(dbRespCode, dbRespMsg);
			}
		} catch (BusinessException be) {
			be.printStackTrace();
			throw be;
		} catch (SystemException se) {
			se.printStackTrace();
			throw se;
		}

		return resp;
	}

}
