/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentRequest {

	private String mobileNo;
	private Double amount;
	private String paymentDate;
	private String billDate;
	private String providerType;
	private String customerName;

}
