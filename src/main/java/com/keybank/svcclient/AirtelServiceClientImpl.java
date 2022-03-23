/** @Copyright 2022 keybank pvt ltd, all rights are reserved, you shouldn't disclose the information outside otherwise terms and condition will apply.
 * 
 */
package com.keybank.svcclient;

import java.util.Date;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.keybank.model.AirtelServiceRequest;
import com.keybank.model.AirtelServiceResponse;

/**
 * @author Sagar, 22-Mar-2022
 *
 *         Description:
 */
@Component
public class AirtelServiceClientImpl implements AirtelServiceClient {

	@Override
	public AirtelServiceResponse enroll(AirtelServiceRequest request) {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:9222/v1/mobile/verify";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("clientId", "keybank");
		headers.set("msgTs", new Date().toString());
		headers.set("requestId", "101");
		headers.set("version", "1.0");
		HttpEntity<Object> httpEntity = new HttpEntity<>(request, headers);
		return rt.exchange(url, HttpMethod.POST, httpEntity, AirtelServiceResponse.class).getBody();
	}

}
