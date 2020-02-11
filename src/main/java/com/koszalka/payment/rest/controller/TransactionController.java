package com.koszalka.payment.rest.controller;

import com.koszalka.payment.persistence.bo.TransactionBO;
import com.koszalka.payment.persistence.dto.TransactionDTO;
import com.koszalka.payment.rest.api.TransactionAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController implements TransactionAPI {

    private final TransactionBO transactionBO;

    @Autowired
    public TransactionController(TransactionBO transactionBO) {
        this.transactionBO = transactionBO;
    }

    @Override
    public ResponseEntity<TransactionDTO> postTransaction(TransactionDTO dto)  {
        transactionBO.saveOne(dto);
        return new ResponseEntity<TransactionDTO>(HttpStatus.CREATED);
    }

}
