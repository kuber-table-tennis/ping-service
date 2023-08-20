package com.falcon.ping.service.controller;

import com.falcon.ping.service.controller.responses.ErrorResponse;
import com.falcon.ping.service.exception.PongClientException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PingErrorHandlerController {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(PingErrorHandlerController.class);

    @ExceptionHandler(PongClientException.class)
    public ResponseEntity<ErrorResponse> documentRuntimeException(PongClientException e) {
        LOGGER.error("Error on pong communication, " + e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(500, "Failed to fetch Pong Client"));
    }

}
