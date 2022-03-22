/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.model;

import lombok.Data;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@Data
public class EnrollmentResponse {

	private String respCode;
	private String respMsg;
	private String enrollmentStatus;

}
