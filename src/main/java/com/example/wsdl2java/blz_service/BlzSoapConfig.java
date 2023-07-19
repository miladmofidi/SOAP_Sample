package com.example.wsdl2java.blz_service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/19/2023
 */
@Configuration
public class BlzSoapConfig {

	@Bean
	@Qualifier("marshaller2")
	public Jaxb2Marshaller marshaller()  {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		String[] packagesToScan= {"com.thomas_bayer.blz","org.tempuri", "com.dataaccess.webservicesserver", "com.thomas_bayer.blz" };
		marshaller.setPackagesToScan(packagesToScan);
		return marshaller;
	}

	@Bean
	public BlzSoapClient soapConnector(Jaxb2Marshaller marshaller) {
		BlzSoapClient client = new BlzSoapClient();
		client.setDefaultUri("http://www.thomas-bayer.com/axis2/services/BLZService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
