package com.webservice.client.send;

import com.webservice.client.wsdl.RunJsonResult;
import com.webservice.client.wsdl.RunJsonResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Slf4j
public class DataClient extends WebServiceGatewaySupport {

    public RunJsonResultResponse getData(String in0, String in1, String in2) {

        RunJsonResult request = new RunJsonResult();
        request.setIn0(in0);
        request.setIn1(in1);
        request.setIn2(in2);

        log.info("Requesting location for " + in0);

        RunJsonResultResponse response = (RunJsonResultResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://10.42.51.91:8090/service/ws/jsonWebService", request);

        return response;
    }

}
