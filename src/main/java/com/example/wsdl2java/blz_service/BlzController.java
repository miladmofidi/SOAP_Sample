package com.example.wsdl2java.blz_service;

import com.thomas_bayer.blz.DetailsType;
import com.thomas_bayer.blz.GetBankResponseType;
import com.thomas_bayer.blz.GetBankType;
import com.thomas_bayer.blz.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/19/2023
 */
@RestController
@RequestMapping("/blz")
public class BlzController {

	@Autowired
	private BlzSoapClient soapClient;

	@GetMapping("/invoke")
	public DetailsType sum(@RequestParam String code) {
		ObjectFactory objectFactory = new ObjectFactory();
		GetBankType type = new GetBankType();
		type.setBlz(code);
		GetBankResponseType response = soapClient.getBank("http://www.thomas-bayer.com/axis2/services/BLZService",
			objectFactory.createGetBank(type));
		return response.getDetails();
	}
}

