package com.example.wsdl2java.calculator_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tempuri.Add;
import org.tempuri.AddResponse;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/19/2023
 */
@RestController
public class AddController {
	@Autowired
	private CalcSoapClient calcSoapClient;

	@PostMapping("/invoke")
	public AddResponse invokeWebService(@RequestBody Add request ){
		AddResponse response = calcSoapClient.numberToDollar( request );
		return response;
	}

}
