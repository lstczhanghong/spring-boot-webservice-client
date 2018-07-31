package com.webservice.client.controller;

import com.webservice.client.send.DataClient;
import com.webservice.client.wsdl.RunJsonResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "ws")
public class IndexController {
    @Autowired
    private DataClient dataClient;

    @GetMapping
    public String callWs() {
        RunJsonResultResponse response = dataClient.getData("8aaab3db6031562501606d63ce863708","qzxqjsc_silu","{\"pager\":{\"page\":\"1\",\"pageSize\":\"10\"}}");
        return response.getOut();
    }
}
