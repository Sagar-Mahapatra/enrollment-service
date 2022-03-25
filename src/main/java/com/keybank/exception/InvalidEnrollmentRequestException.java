/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.exception;

/**
 * @author Sagar, 24-Mar-2022
 *
 *         Description:
 */
public class InvalidEnrollmentRequestException extends Exception {

	private static final long serialVersionUID = -1735536042108733728L;

	private String respCode;
	private String respMsg;

	public InvalidEnrollmentRequestException(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

}
