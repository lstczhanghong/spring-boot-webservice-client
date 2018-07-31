package com.webservice.client.config;

import com.webservice.client.send.DataClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WsConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.webservice.client.wsdl");
        return marshaller;
    }
    @Bean
    public DataClient dataClient(Jaxb2Marshaller marshaller) {
        DataClient client = new DataClient();
        client.setDefaultUri("http://10.42.51.91:8090/service/ws/jsonWebService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
