package com.example.wsdl2java.blz_service;

import com.thomas_bayer.blz.GetBankResponseType;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/19/2023
 */
public class BlzSoapClient extends WebServiceGatewaySupport {
	public GetBankResponseType getBank(String url, Object request){
		JAXBElement<GetBankResponseType> res = (JAXBElement<GetBankResponseType>) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return res.getValue();
	}
}