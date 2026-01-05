//package com.ds.soap.config;
//
//import com.ds.soap.client.service.MarksClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//
//@Configuration
//public class SoapClientConfig {
//
//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setContextPath("com.ds.soap.client");
//        return marshaller;
//    }
//
//    @Bean
//    public MarksClient marksClient(Jaxb2Marshaller marshaller) {
//        MarksClient client = new MarksClient();
//        client.setDefaultUri("http://localhost:9595/services/marks");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }
//}

package com.ds.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.ds.soap.client");
        return marshaller;
    }
}
