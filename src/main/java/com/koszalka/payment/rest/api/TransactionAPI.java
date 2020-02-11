package com.koszalka.payment.rest.api;

import com.koszalka.payment.persistence.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@RequestMapping(path = "/v1")
public interface TransactionAPI {

    @RequestMapping(path = "/transaction", method = RequestMethod.POST)
    ResponseEntity<TransactionDTO> postTransaction(@RequestBody TransactionDTO transactionDTO);

}
