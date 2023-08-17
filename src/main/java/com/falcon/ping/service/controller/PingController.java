package com.falcon.ping.service.controller;

import com.falcon.ping.service.business.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping( "/ping")
    public void ping(){
        pingService.sendPing();
    }
}
