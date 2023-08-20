package com.falcon.ping.service.client;


import com.falcon.ping.service.business.Constants;
import com.falcon.ping.service.config.ConfigProperties;
import com.falcon.ping.service.exception.PongClientException;
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

    public void pingToPong() throws PongClientException {
        log.info("Ping");
        try{
            restTemplate.getForEntity(configProperties.getPongUrl(), Void.class);
        }catch(Exception e){
            throw new PongClientException(Constants.PONG_CLIENT_NETWORK_FAILURE_MESSAGE);
        }
    }
}
