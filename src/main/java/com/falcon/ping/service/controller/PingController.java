package com.falcon.ping.service.controller;

import com.falcon.ping.service.business.PingService;
import com.falcon.ping.service.controller.responses.PingResponse;
import com.falcon.ping.service.exception.PongClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping( "/ping")
    public ResponseEntity<PingResponse> ping() throws PongClientException {
        pingService.sendPing();
        return new ResponseEntity<>(new PingResponse(200, "Ping sended successfully"), HttpStatus.OK);
    }
}
