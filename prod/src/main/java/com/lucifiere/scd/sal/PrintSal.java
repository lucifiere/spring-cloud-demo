package com.lucifiere.scd.sal;

import com.lucifiere.scd.constants.RestUrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Configuration
@Service
public class PrintSal {

    @Value("spring.application.name")
    private String appName;

    @Autowired
    private RestTemplate restTemplate;

    public String getNotice() {
        ResponseEntity<String> resp = restTemplate.getForEntity(RestUrlConstants.URL_GET_NOTICE, String.class);
        return resp.getBody();
    }

}
