package com.example.wsdl2java.calculator_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.tempuri.Add;
import org.tempuri.AddResponse;

import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 7/18/2023
 */
@Service
public class CalcSoapClient {

	@Autowired
	@Qualifier("marshaller")
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate webServiceTemplate;

	private final String URL = "http://www.dneonline.com/calculator.asmx";

		public AddResponse numberToDollar( Add request){
		webServiceTemplate = new WebServiceTemplate(marshaller);
			AddResponse response = (AddResponse) webServiceTemplate.marshalSendAndReceive( URL, request,new WebServiceMessageCallback() {
			@Override
			public void doWithMessage( WebServiceMessage webServiceMessage) throws IOException, TransformerException {
				((SoapMessage)webServiceMessage).setSoapAction("http://tempuri.org/Add");
			}
		} );
		return response;

	}


}
