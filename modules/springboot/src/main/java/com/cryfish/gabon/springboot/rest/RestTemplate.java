package com.cryfish.gabon.springboot.rest;

import org.springframework.stereotype.Component;

import java.util.Collections;

//@Component
public class RestTemplate extends org.springframework.web.client.RestTemplate {
    public RestTemplate() {
        setInterceptors(Collections.singletonList(new CorrelationIdInterceptor()));
    }
}
