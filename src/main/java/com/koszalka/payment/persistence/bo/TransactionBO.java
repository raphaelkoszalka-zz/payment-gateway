package com.koszalka.payment.persistence.bo;

import com.koszalka.payment.persistence.dto.TransactionDTO;
import com.koszalka.payment.persistence.entities.TransactionEntity;
import com.koszalka.payment.persistence.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionBO {

    private final TransactionRepository transactionRepository;

    public TransactionBO(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void saveOne(TransactionDTO dto)  {
        TransactionEntity entity = new TransactionEntity();

        entity.setCard_flag(dto.getCard_flag());
        entity.setHour(dto.getHour());
        entity.setModality(dto.getModality());
        entity.setValue(dto.getValue());

        transactionRepository.save(entity);
    }

}
