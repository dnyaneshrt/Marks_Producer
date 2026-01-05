//package com.ds.soap.client.service;
//
//
//import com.ds.soap.client.Calculate;
//import com.ds.soap.client.MarksResponse;
//import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
//
//public class MarksClient extends WebServiceGatewaySupport {
////
////    public MarksResponse getResult(int s1, int s2, int s3, int s4, int s5, int s6) {
////
////        MarksRequest request = new MarksRequest();
////        request.setS1(s1);
////        request.setS2(s2);
////        request.setS3(s3);
////        request.setS4(s4);
////        request.setS5(s5);
////        request.setS6(s6);
////
////        return (MarksResponse) getWebServiceTemplate()
////                .marshalSendAndReceive("http://localhost:9595/services/marks", request);
//
//    public MarksResponse getResult(int s1, int s2, int s3, int s4, int s5, int s6) {
//
//        Calculate request = new Calculate();
//        request.setArg0(s1);
//        request.setArg1(s2);
//        request.setArg2(s3);
//        request.setArg3(s4);
//        request.setArg4(s5);
//        request.setArg5(s6);
//
//        return (MarksResponse) getWebServiceTemplate()
//                .marshalSendAndReceive("http://localhost:9595/services/marks", request);
//    }
//}

package com.ds.soap.client.service;

import com.ds.soap.client.Calculate;
import com.ds.soap.client.CalculateResponse;
import com.ds.soap.client.MarksResponse;
import com.ds.soap.client.ObjectFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import javax.xml.bind.JAXBElement;

@Component
public class MarksClient extends WebServiceGatewaySupport {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private final ObjectFactory factory = new ObjectFactory();

    @PostConstruct
    public void init() {
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);
    }

    public MarksResponse getResult(int s1, int s2, int s3, int s4, int s5, int s6) {

        Calculate request = new Calculate();
        request.setArg0(s1);
        request.setArg1(s2);
        request.setArg2(s3);
        request.setArg3(s4);
        request.setArg4(s5);
        request.setArg5(s6);

        JAXBElement<Calculate> wrappedRequest = factory.createCalculate(request);

        JAXBElement<CalculateResponse> response =
                (JAXBElement<CalculateResponse>) getWebServiceTemplate()
                        .marshalSendAndReceive("http://localhost:9595/services/marks", wrappedRequest);

        return response.getValue().getReturn();
    }

}
