package com.falcon.ping.service.client;


import com.falcon.ping.service.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PongClient {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PongClient.class);


    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private RestTemplate restTemplate;
    public void pingToPong(){
        log.info("Ping Service: Ping");
        restTemplate.getForEntity(configProperties.getPongUrl(), Void.class);
    }
}
