package com.aline.transactionmicroservice.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    /**
     * Health Check endpoint
     */
    @Timed("health")
    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public void healthCheck() {}

}
