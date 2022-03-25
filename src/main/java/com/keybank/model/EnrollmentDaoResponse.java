/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar, 25-Mar-2022
 *
 *         Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDaoResponse {

	private String respCode;
	private String respMsg;
	private String enrollmentStatus;

}
