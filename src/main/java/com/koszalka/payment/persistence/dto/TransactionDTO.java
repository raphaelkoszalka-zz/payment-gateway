package com.koszalka.payment.persistence.dto;

import java.util.Date;

public class TransactionDTO {

    private Long nsu;
    private Long value;
    private String card_flag;
    private String modality;
    private Date hour;

    public TransactionDTO(Long nsu, Long value, String card_flag, String modality, Date hour) {
        this.nsu = nsu;
        this.value = value;
        this.card_flag = card_flag;
        this.modality = modality;
        this.hour = hour;
    }

    public Date getHour() {
        return this.hour;
    }

    public Long getNsu() {
        return  this.nsu;
    }

    public Long getValue() {
        return this.value;
    }

    public String getCard_flag() {
        return this.card_flag;
    }

    public String getModality() {
        return this.modality;
    }

}
