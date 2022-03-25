/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.exception;

/**
 * @author Sagar, 24-Mar-2022
 *
 *         Description:
 */
public class AirtelServiceDownException extends RuntimeException {

	private static final long serialVersionUID = 8701940397966560125L;

	public AirtelServiceDownException(String message) {
		super(message);
	}

}
