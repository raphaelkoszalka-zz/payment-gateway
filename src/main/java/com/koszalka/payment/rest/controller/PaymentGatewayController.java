package com.koszalka.payment.rest.controller;

import com.koszalka.payment.rest.api.PaymentGatewayAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PaymentGatewayController implements PaymentGatewayAPI {

    @Override
    public ResponseEntity<Object> test(HttpServletResponse response) {
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
