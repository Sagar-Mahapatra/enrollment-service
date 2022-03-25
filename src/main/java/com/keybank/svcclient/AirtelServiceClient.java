/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.svcclient;

import com.keybank.exception.BusinessException;
import com.keybank.exception.SystemException;
import com.keybank.model.AirtelServiceRequest;
import com.keybank.model.AirtelServiceResponse;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
public interface AirtelServiceClient {

	public AirtelServiceResponse enroll(AirtelServiceRequest request) throws BusinessException, SystemException;

}
