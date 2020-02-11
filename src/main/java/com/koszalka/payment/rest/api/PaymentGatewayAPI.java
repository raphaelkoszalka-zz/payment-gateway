package com.koszalka.payment.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@RequestMapping(path = "/v1")
public interface PaymentGatewayAPI {

    @RequestMapping(path = "/gateway", method = RequestMethod.GET)
    ResponseEntity<Object> test(HttpServletResponse response);

}
