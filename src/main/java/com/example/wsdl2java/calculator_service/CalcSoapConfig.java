package com.example.wsdl2java.calculator_service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/18/2023
 */
@Configuration
public class CalcSoapConfig {
	@Bean
	@Qualifier("marshaller")
	public Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		String[] packagesToScan= {"com.thomas_bayer.blz","org.tempuri", "com.dataaccess.webservicesserver", "com.thomas_bayer.blz" };
		marshaller.setPackagesToScan(packagesToScan);

		return marshaller;
	}

}
