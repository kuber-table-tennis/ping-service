package com.falcon.ping.service.business;

import com.falcon.ping.service.client.PongClient;
import com.falcon.ping.service.config.ConfigProperties;
import com.falcon.ping.service.exception.PongClientException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PingService {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PingService.class);

    @Autowired
    private PongClient pongClient;
    public void sendPing() throws PongClientException {
        pongClient.pingToPong();
    }
}
