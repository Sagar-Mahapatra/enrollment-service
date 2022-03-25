/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar, 24-Mar-2022
 *
 *         Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDaoRequest {
	private Double amount;
	private String billDate;
	private String customerName;
	private String mobileNo;
	private String paymentDate;
	private String providerType;

}
